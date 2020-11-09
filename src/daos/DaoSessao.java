/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entidades.Sessao;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import telas.HibernateUtil;

/**
 *
 * @author estel
 */
public class DaoSessao {
    
    public Sessao consultaId(int id){
        Sessao obj = new Sessao();
        String sql = "FROM Sessao " + "WHERE codigo = " + id;
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            org.hibernate.Query query = sessao.createQuery(sql);
            List<Sessao> resultado = new ArrayList();
            resultado = query.list();
            obj = resultado.get(0);
        } catch (HibernateException hibEx) {
            hibEx.printStackTrace();
        }
        return obj;
    }
    
    public List<Sessao> consultaTodos(){
        List<Sessao> resultado = new ArrayList();
        String sql = "FROM Sessao ORDER BY codigo";
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            org.hibernate.Query query = sessao.createQuery(sql);
            resultado = query.list();
        } catch (HibernateException hibEx) {
            hibEx.printStackTrace();
        }
        return resultado;
    }
    
    public List<Sessao> consultaFilme (String filme){
        List<Sessao> resultado = new ArrayList();
        String sql = "FROM Sessao "
                + "WHERE codFilme = " + filme 
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
    
    public String exluir(Sessao obj){
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
