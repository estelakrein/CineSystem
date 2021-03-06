package daos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import telas.HibernateUtil;

/**
 *
 * @author estel
 */
public class DaoGenerico {
 
    public static DaoGenerico daoGenerico = null;
    
    private SessionFactory factory;
    private Transaction transaction;
    
    public DaoGenerico(){
        factory = HibernateUtil.getSessionFactory();
    }
    
    public static DaoGenerico getInstance(){
        if (daoGenerico == null){
            daoGenerico = new DaoGenerico();
        }
        return daoGenerico;
    }
    
    public boolean insert(Object o){
        boolean retorno = false;
        Session sessao = factory.openSession();
        try{
            transaction = sessao.beginTransaction();
            sessao.saveOrUpdate(o);
            transaction.commit();
            retorno = true;
        } catch (Exception e){
            transaction.rollback();
            retorno = false;
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return retorno;
    }
    
}
