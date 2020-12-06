package daos;

import entidades.Sala;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import telas.HibernateUtil;

public class DaoSala {
    
    public Sala consultaId(int id){
        Sala obj = new Sala();
        String sql = "FROM Sala " + "WHERE codigo = " + id;
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            org.hibernate.Query query = sessao.createQuery(sql);
            List<Sala> resultado = new ArrayList();
            resultado = query.list();
            obj = resultado.get(0);
        } catch (HibernateException hibEx) {
            hibEx.printStackTrace();
        }
        return obj;
    }
    
    public List<Sala> consultaTodos(){
        List<Sala> resultado = new ArrayList();
        String sql = "FROM Sala ORDER BY codigo";
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            org.hibernate.Query query = sessao.createQuery(sql);
            resultado = query.list();
        } catch (HibernateException hibEx) {
            hibEx.printStackTrace();
        }
        return resultado;
    }
    
    public List<Sala> consultaParam(String param){
        List<Sala> resultado = new ArrayList();
        String sql = "FROM Sala "
                + "WHERE descricao LIKE '%" + param + "%' "
                + "ORDER BY codigo";
        
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            org.hibernate.Query query = sessao.createQuery(sql);
            resultado = query.list();            
        } catch (HibernateException hibEx) {
            hibEx.printStackTrace();
        }
        return resultado;
    }
    
    public String exluir(Sala obj){
        Session sessao = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction transacao = sessao.beginTransaction();
            
                sessao.delete(obj);
                transacao.commit();
                return "Cadastro excluído com sucesso!";
            
        } catch (HibernateException hibEx) {
            return hibEx.toString();
        }
    }
}
