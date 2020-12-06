package daos;

import entidades.Auditoria;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import telas.HibernateUtil;

public class DaoAuditoria {
    
    public Auditoria consultaId(int id){
            
        Auditoria obj = new Auditoria();
        String sql = "FROM auditoria " + "WHERE log_id = " + id;
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            org.hibernate.Query query = sessao.createQuery(sql);
            List<Auditoria> resultado = new ArrayList();
            resultado = query.list();
            obj = resultado.get(0);
        } catch (HibernateException hibEx) {
            hibEx.printStackTrace();
        }
            return obj;
    }
    
    public List<Auditoria> consultaTodos(){
        List<Auditoria> resultado = new ArrayList();
        String sql = "FROM auditoria ORDER BY log_id";
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            org.hibernate.Query query = sessao.createQuery(sql);
            resultado = query.list();
        } catch (HibernateException hibEx) {
            hibEx.printStackTrace();
        }
        return resultado;
    }
        
        public List<Auditoria> consultaParam(String param){
        List<Auditoria> resultado = new ArrayList();
        String sql = "FROM auditoria "
                + "WHERE acao LIKE '%" + param + "%' "
                + "ORDER BY log_id";
        
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            org.hibernate.Query query = sessao.createQuery(sql);
            resultado = query.list();            
        } catch (HibernateException hibEx) {
            hibEx.printStackTrace();
        }
        return resultado;
    } 
        
        public String exluir(Auditoria obj){
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