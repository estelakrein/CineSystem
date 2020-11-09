/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entidades.Venda;
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
public class DaoVendas {
    
    public Venda consultaId(int id){
        Venda obj = new Venda();
        String sql = "FROM Venda " + "WHERE numero = " + id;
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            org.hibernate.Query query = sessao.createQuery(sql);
            List<Venda> resultado = new ArrayList();
            resultado = query.list();
            obj = resultado.get(0);
        } catch (HibernateException hibEx) {
            hibEx.printStackTrace();
        }
        return obj;
    }
    
    public List<Venda> consultaTodos(){
        List<Venda> resultado = new ArrayList();
        String sql = "FROM Venda ORDER BY numero";
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            org.hibernate.Query query = sessao.createQuery(sql);
            resultado = query.list();
        } catch (HibernateException hibEx) {
            hibEx.printStackTrace();
        }
        return resultado;
    }
    
//    public List<Venda> consultaParam(String param){
//        List<Venda> resultado = new ArrayList();
//        String sql = "FROM Venda "
//                + "WHERE descricao LIKE '%" + param + "%' "
//                + "ORDER BY codigo";
//        
//        try {
//            Session sessao = HibernateUtil.getSessionFactory().openSession();
//            org.hibernate.Query query = sessao.createQuery(sql);
//            resultado = query.list();            
//        } catch (HibernateException hibEx) {
//            hibEx.printStackTrace();
//        }
//        return resultado;
//    }
    
    public String exluir(Venda obj){
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
