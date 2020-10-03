/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apoio;

import entidades.Filme;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import telas.HibernateUtil;

/**
 *
 * @author estel
 */
public class CombosDAO {
    ResultSet resultado = null;

    public void popularCombo(String tabela, JComboBox combo) {

        ComboItens item = new ComboItens();
        combo.removeAllItems();
        item.setCodigo(0);
        item.setDescricao("Selecione");
        combo.addItem(item);

        List<ComboItens> retorno = new ArrayList();
        String sql = "FROM " + tabela + "ORDER BY codigo";
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            org.hibernate.Query query = sessao.createQuery(sql);
            retorno = query.list();
            for (int i = 0; i < retorno.size(); i++) {
               //
            }
        } catch (HibernateException hibEx) {
            hibEx.printStackTrace();
        }
        try {
            resultado = new ConexaoBD().getConnection().createStatement().executeQuery("select * from " + tabela);

            if (resultado.isBeforeFirst()) {
                while (resultado.next()) {
                    item = new ComboItens();
                    item.setCodigo(resultado.getInt(1));
                    item.setDescricao(resultado.getString(2));

                    combo.addItem(item);
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao popular Combo = " + e.toString());
        }
    }
    
    public void definirItemCombo (JComboBox combo, int item) {
        for (int i = 0; i < combo.getItemCount(); i++) {
            if ( ((ComboItens) combo.getItemAt(i)).getCodigo() == (item ) ) {
                combo.setSelectedIndex(i);
                return;
            }
        }
    }
}
