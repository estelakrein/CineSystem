/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entidades.Poltrona;
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
public class DaoPoltrona {
   
    public Poltrona consultaId(int id){
        Poltrona obj = new Poltrona();
        String sql = "FROM Poltrona " + "WHERE codigo = " + id;
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            org.hibernate.Query query = sessao.createQuery(sql);
            List<Poltrona> resultado = new ArrayList();
            resultado = query.list();
            obj = resultado.get(0);
        } catch (HibernateException hibEx) {
            hibEx.printStackTrace();
        }
        return obj;
    }
    
    public Poltrona consultaFN(String fila, int numero){
        Poltrona obj = new Poltrona();
        String sql = "FROM Poltrona " + "WHERE fileira = '" + fila + "' and numero = "+numero;
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            org.hibernate.Query query = sessao.createQuery(sql);
            List<Poltrona> resultado = new ArrayList();
            resultado = query.list();
            obj = resultado.get(0);
        } catch (HibernateException hibEx) {
            hibEx.printStackTrace();
        }
        return obj;
    }
    
    public List<Poltrona> consultaTodos(){
        List<Poltrona> resultado = new ArrayList();
        String sql = "FROM Poltrona ORDER BY codigo";
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            org.hibernate.Query query = sessao.createQuery(sql);
            resultado = query.list();
        } catch (HibernateException hibEx) {
            hibEx.printStackTrace();
        }
        return resultado;
    }
    
    public List<Poltrona> consultaSala(int sala){
        List<Poltrona> resultado = new ArrayList();
        String sql = "FROM Poltrona "
                + "WHERE codSala = " + sala 
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
    
    public String exluir(Poltrona obj){
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
