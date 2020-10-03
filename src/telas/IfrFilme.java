package telas;

import daos.DaoGenerico;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import entidades.Categoria;
import entidades.Classificacao;
import entidades.Idioma;
import entidades.Legenda;
import entidades.Filme;
import java.awt.Color;
import javax.swing.JComboBox;
/**
 *
 * @author Acer
 */
public class IfrFilme extends javax.swing.JInternalFrame {

    int codigo = 0;
    
    /**
     * Creates new form IfrFilme
     */
    public IfrFilme() {
        initComponents();
        inicia();
    }

    public void popularTabela() {

        // cabecalho da tabela
        Object[] cabecalho = new Object[6];
        cabecalho[0] = "Código";
        cabecalho[1] = "Nome";
        cabecalho[2] = "Duração";
        cabecalho[3] = "Valor";
        cabecalho[4] = "Idioma";
        cabecalho[5] = "Categoria";

        List<Filme> resultado = new ArrayList();
        String sql = "FROM Filme "
                + "ORDER BY codigo";
        tblFilme.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblFilme.getColumnModel().getColumn(1).setPreferredWidth(50);
        tblFilme.getColumnModel().getColumn(2).setPreferredWidth(50);
        tblFilme.getColumnModel().getColumn(3).setPreferredWidth(50);
        tblFilme.getColumnModel().getColumn(4).setPreferredWidth(50);
        tblFilme.getColumnModel().getColumn(5).setPreferredWidth(50);
        DefaultTableModel modelo = (DefaultTableModel) tblFilme.getModel();
        modelo.setNumRows(0);
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            org.hibernate.Query query = sessao.createQuery(sql);
            resultado = query.list();
            for (int i = 0; i < resultado.size(); i++) {
                Filme filme = resultado.get(i);
                modelo.addRow(new Object[]{filme.getCodigo(), filme.getNome(), filme.getDuracao(), filme.getValor(), filme.getIdioma().getIdioma(), filme.getCategoria().getDescricao()});

            }
        } catch (HibernateException hibEx) {
            hibEx.printStackTrace();
        }

        // permite seleção de apenas uma linha da tabela
        tblFilme.setSelectionMode(0);
    }

    public void inicia() {
        tfdBuscar.setText("");
        tfdNome.setText("");
        tfdDuracao.setText("");
        tfdValor.setText("");
        
        List<Idioma> resultadoidi = new ArrayList();
        String sql = "FROM Idioma "
                + "ORDER BY codigo";
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            org.hibernate.Query query = sessao.createQuery(sql);
            resultadoidi = query.list();
            for (int i = 0; i < resultadoidi.size(); i++) {
                Idioma idioma = resultadoidi.get(i);
                cbxIdioma.addItem(idioma);
            }
        } catch (HibernateException hibEx) {
            hibEx.printStackTrace();
        }
        
        List<Legenda> resultadoleg = new ArrayList();
        sql = "FROM Legenda "
                + "ORDER BY codigo";
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            org.hibernate.Query query = sessao.createQuery(sql);
            resultadoleg = query.list();
            for (int i = 0; i < resultadoleg.size(); i++) {
                Legenda legenda = resultadoleg.get(i);
                cbxLegenda.addItem(legenda);
            }
        } catch (HibernateException hibEx) {
            hibEx.printStackTrace();
        }
        
        List<Categoria> resultadocat = new ArrayList();
        sql = "FROM Categoria "
                + "ORDER BY codigo";
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            org.hibernate.Query query = sessao.createQuery(sql);
            resultadocat = query.list();
            for (int i = 0; i < resultadocat.size(); i++) {
                Categoria categoria = resultadocat.get(i);
                cbxCategoria.addItem(categoria);
            }
        } catch (HibernateException hibEx) {
            hibEx.printStackTrace();
        }
        
        List<Classificacao> resultadocla = new ArrayList();
        sql = "FROM Classificacao "
                + "ORDER BY codigo";
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            org.hibernate.Query query = sessao.createQuery(sql);
            resultadocla = query.list();
            for (int i = 0; i < resultadocla.size(); i++) {
                Classificacao classificacao = resultadocla.get(i);
                cbxClassificacao.addItem(classificacao);
            }
        } catch (HibernateException hibEx) {
            hibEx.printStackTrace();
        }
        popularTabela();
        codigo = 0;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jOptionPane1 = new javax.swing.JOptionPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfdNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfdDuracao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfdValor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbxIdioma = new javax.swing.JComboBox<>();
        cbxClassificacao = new javax.swing.JComboBox<>();
        cbxLegenda = new javax.swing.JComboBox<>();
        cbxCategoria = new javax.swing.JComboBox<>();
        lblMensagem = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfdBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFilme = new javax.swing.JTable();
        btnFechar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setTitle("Cadastro de Filmes");

        jLabel2.setText("Nome:");

        jLabel3.setText("Duração:");

        tfdDuracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdDuracaoActionPerformed(evt);
            }
        });

        jLabel4.setText("Valor:");

        jLabel5.setText("Idioma:");

        jLabel6.setText("Legenda:");

        jLabel7.setText("Categoria:");

        jLabel8.setText("Classificação:");

        cbxIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxIdiomaActionPerformed(evt);
            }
        });

        lblMensagem.setText("Mensagem");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMensagem)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfdDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxIdioma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxLegenda, 0, 199, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tfdValor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(cbxClassificacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(tfdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfdDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tfdValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(cbxIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(cbxLegenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblMensagem)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastro", jPanel1);

        jLabel1.setText("Buscar");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblFilme.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Duração", "Valor", "Idioma", "Categoria"
            }
        ));
        tblFilme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFilmeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblFilme);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(tfdBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addContainerGap(290, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jTabbedPane1.addTab("Listagem", jPanel3);

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFechar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFechar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSalvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblFilmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFilmeMouseClicked

        String id = String.valueOf(tblFilme.getValueAt(tblFilme.getSelectedRow(), 0));
        String nome = String.valueOf(tblFilme.getValueAt(tblFilme.getSelectedRow(), 1));

        codigo = Integer.parseInt(id);
        Filme filme = new Filme();
        String sql = "FROM Filme " + "WHERE codigo = " + id;
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            org.hibernate.Query query = sessao.createQuery(sql);
            List<Filme> resultado = new ArrayList();
            resultado = query.list();
            filme = resultado.get(0);
        } catch (HibernateException hibEx) {
            hibEx.printStackTrace();
        }
        tfdNome.setText(nome);
        tfdDuracao.setText(String.valueOf(filme.getDuracao()));
        tfdValor.setText(String.valueOf(filme.getValor()));
        cbxIdioma.setSelectedItem(filme.getIdioma());
        cbxLegenda.setSelectedItem(filme.getLegenda());
        cbxClassificacao.setSelectedItem(filme.getClassificacao());
        cbxCategoria.setSelectedItem(filme.getCategoria());
        jTabbedPane1.setSelectedIndex(0);
        tfdNome.requestFocus();
    }//GEN-LAST:event_tblFilmeMouseClicked

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        List resultado = null;
        Session sessao = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction transacao = sessao.beginTransaction();
            String id = String.valueOf(tblFilme.getValueAt(tblFilme.getSelectedRow(), 0));

            org.hibernate.Query query = sessao.createQuery("FROM Filme WHERE codigo = " + id);

            resultado = query.list();
            for (Object obj : resultado) {
                Categoria categoria = (Categoria) obj;
                sessao.delete(categoria);
                transacao.commit();
                JOptionPane.showMessageDialog(null, "Cadastro excluído com sucesso!");
            }
        } catch (HibernateException hibEx) {
            hibEx.printStackTrace();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
            boolean result;
            try {
                Filme filme = new Filme();
                filme.setCodigo(codigo);
                filme.setNome(tfdNome.getText());
                filme.setDuracao(Integer.parseInt(tfdDuracao.getText()));
                Categoria categoria = (Categoria) cbxCategoria.getSelectedItem();
                filme.setCategoria(categoria);                
                Classificacao classificacao = (Classificacao) cbxClassificacao.getSelectedItem();
                filme.setClassificacao(classificacao);
                Idioma idioma = (Idioma) cbxIdioma.getSelectedItem();
                filme.setIdioma(idioma);
                Legenda legenda = (Legenda) cbxLegenda.getSelectedItem();
                filme.setLegenda(legenda);
                filme.setValor(Double.parseDouble(tfdValor.getText()));
                result = DaoGenerico.getInstance().insert(filme);
                if (result) {
                    JOptionPane.showMessageDialog(null, "Cadastro finalizado com sucesso!"); }
                else {
                    JOptionPane.showMessageDialog(null, "Cadastro com erro!"); 
                }
                inicia();
            } catch (HibernateException hibEx) {
                hibEx.printStackTrace();
            }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private String validarCampos(){
        String mensagem = "";
        if  (cbxIdioma.getSelectedIndex() == 0) {
            cbxIdioma.setBackground(Color.YELLOW);
            cbxIdioma.requestFocus();
            mensagem = "Campo IDIOMA com problemas!\n";
        } else {
            cbxIdioma.setBackground(Color.WHITE);
        }
        if  (cbxLegenda.getSelectedIndex() == 0) {
            cbxLegenda.setBackground(Color.YELLOW);
            cbxLegenda.requestFocus();
            mensagem = "Campo LEGENDA com problemas!\n";
        } else {
            cbxLegenda.setBackground(Color.WHITE);
        }
        if  (cbxClassificacao.getSelectedIndex() == 0) {
            cbxClassificacao.setBackground(Color.YELLOW);
            cbxClassificacao.requestFocus();
            mensagem = "Campo CLASSIFICAÇÃO com problemas!\n";
        } else {
            cbxClassificacao.setBackground(Color.WHITE);
        }
        if  (cbxCategoria.getSelectedIndex() == 0) {
            cbxCategoria.setBackground(Color.YELLOW);
            cbxCategoria.requestFocus();
            mensagem = "Campo CATEGORIA com problemas!\n";
        } else {
            cbxCategoria.setBackground(Color.WHITE);
        }
        if (tfdNome.getText() == "") {
            tfdNome.setBackground(Color.YELLOW);
            tfdNome.requestFocus();
            mensagem = mensagem + "Campo NOME com problemas!\n";
        } else {           
            tfdNome.setBackground(Color.WHITE);
        }
        if (tfdValor.getText() == "") {
            tfdValor.setBackground(Color.YELLOW);
            tfdValor.requestFocus();
            mensagem = mensagem + "Campo VALOR com problemas!\n";
        } else {           
            tfdValor.setBackground(Color.WHITE);
        }
        if (tfdDuracao.getText() == "") {
            tfdDuracao.setBackground(Color.YELLOW);
            tfdDuracao.requestFocus();
            mensagem = mensagem + "Campo DURAÇÃO com problemas!\n";
        } else {           
            tfdDuracao.setBackground(Color.WHITE);
        }
        lblMensagem.setText(mensagem);
        lblMensagem.setVisible(true);
        return mensagem;
    }
    private void cbxIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxIdiomaActionPerformed
        
    }//GEN-LAST:event_cbxIdiomaActionPerformed

    private void tfdDuracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdDuracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdDuracaoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        List<Filme> resultado = new ArrayList();
        String sql = "FROM Filme "
                + "WHERE nome LIKE '%" + tfdBuscar.getText() + "%' "
                + "ORDER BY codigo";
        tblFilme.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblFilme.getColumnModel().getColumn(1).setPreferredWidth(50);
        tblFilme.getColumnModel().getColumn(2).setPreferredWidth(50);
        tblFilme.getColumnModel().getColumn(3).setPreferredWidth(50);
        tblFilme.getColumnModel().getColumn(4).setPreferredWidth(50);
        tblFilme.getColumnModel().getColumn(5).setPreferredWidth(50);
        DefaultTableModel modelo = (DefaultTableModel) tblFilme.getModel();
        modelo.setNumRows(0);
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            org.hibernate.Query query = sessao.createQuery(sql);
            resultado = query.list();
            for (int i = 0; i < resultado.size(); i++) {
                Filme filme = resultado.get(i);
                modelo.addRow(new Object[]{filme.getCodigo(), filme.getNome(), filme.getDuracao(), filme.getValor(), filme.getIdioma().getIdioma(), filme.getCategoria().getDescricao()});

            }
        } catch (HibernateException hibEx) {
            hibEx.printStackTrace();
        }

        // permite seleção de apenas uma linha da tabela
        tblFilme.setSelectionMode(0);
    }//GEN-LAST:event_btnBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<Categoria> cbxCategoria;
    private javax.swing.JComboBox<Classificacao> cbxClassificacao;
    private javax.swing.JComboBox<Idioma> cbxIdioma;
    private javax.swing.JComboBox<Legenda> cbxLegenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JTable tblFilme;
    private javax.swing.JTextField tfdBuscar;
    private javax.swing.JTextField tfdDuracao;
    private javax.swing.JTextField tfdNome;
    private javax.swing.JTextField tfdValor;
    // End of variables declaration//GEN-END:variables
}
