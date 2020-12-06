package daos;

import entidades.Usuario;
import java.security.MessageDigest;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.xml.bind.DatatypeConverter;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import telas.HibernateUtil;
import org.apache.log4j.Logger;
import telas.FrmLogin;

public class DaoUsuario {
    
    private org.apache.log4j.Logger logger = Logger.getLogger(DaoUsuario.class.getName());
    LocalDateTime agora = LocalDateTime.now();
    
    public void consulta(Usuario usuario, String nome, String senha) {
        try {
            senha = hash(senha + nome);
            List<Usuario> resultado = new ArrayList();
            String sql = "FROM Usuario "
                    + "WHERE Nome = '" + nome + "' and senha = '" + senha + "'";
            try {
                Session sessao = HibernateUtil.getSessionFactory().openSession();
                org.hibernate.Query query = sessao.createQuery(sql);
                resultado = query.list();
                for (int i = 0; i < resultado.size(); i++) {
                    Usuario u = resultado.get(i);
                    usuario.setCodigo(u.getCodigo());
                    usuario.setNome(u.getNome());
                    usuario.setPermissoes(u.getPermissoes());
                }
                
            } catch (HibernateException hibEx) {
                hibEx.printStackTrace();
                logger.error(agora+" ERROR: Consulta inválida! --  Tela Dao-Usuário");
            }
        } catch (Exception e) {
            System.out.println("Erro ao consultar usuário: " + e);
        }
    }
    
    public String hash(String senha) {
        try {
            String hash = null;
            
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(senha.getBytes());
            byte[] digest = md.digest();
            hash = DatatypeConverter.printHexBinary(digest).toUpperCase();
            return hash;
        } catch (Exception hibEx) {
            hibEx.printStackTrace();
            logger.error(agora+" ERROR: Consulta inválida! --  Tela Dao-Usuário");
            return null;
        }
    }
    
    public void exclui(int codigo) {
        List resultado = null;
        Session sessao = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction transacao = sessao.beginTransaction();
            org.hibernate.Query query = sessao.createQuery("FROM Usuario WHERE codigo = " + codigo);
            
            resultado = query.list();
            for (Object obj : resultado) {
                Usuario usuario = (Usuario) obj;
                sessao.delete(usuario);
                transacao.commit();
                JOptionPane.showMessageDialog(null, "Cadastro excluído com sucesso!");
            }
        } catch (HibernateException hibEx) {
            hibEx.printStackTrace();
            //DaoUsuario.logger.error("Erro no registro" + hibEx.toString());
        }
    }
}
