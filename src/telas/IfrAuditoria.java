package telas;

import apoio.ConnectionFactory;
import apoio.DB_Connection;
import daos.DaoAuditoria;
import entidades.Auditoria;
import java.io.File;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.log4j.Logger;


public class IfrAuditoria extends javax.swing.JInternalFrame {
    private org.apache.log4j.Logger logger = Logger.getLogger(FrmLogin.class.getName());
    LocalDateTime agora = LocalDateTime.now();
    
    int codigo = 0;
    String consulta = "";
    DaoAuditoria daoAuditoria = new DaoAuditoria();
    
    public IfrAuditoria() {
        initComponents();
         inicia();
    }
    
       public void popularTabela() {

        //cabeçalho da tabela
        Object[] cabecalho = new Object[5];
        cabecalho[0] = "Código";
        cabecalho[1] = "Tabela";
//        cabecalho[2] = "NewId";
//        cabecalho[3] = "OldId";
//        cabecalho[4] = "NewCod";
//        cabecalho[5] = "OldCod";
//        cabecalho[6] = "NewDia";
//        cabecalho[7] = "OldDia";
//        cabecalho[8] = "NewValor";
//        cabecalho[9] = "OldValor";
//        cabecalho[10] = "NewIdioma";
//        cabecalho[11] = "OldIdioma";
//        cabecalho[12] = "NewDesc";
//        cabecalho[13] = "OldDesc";
//        cabecalho[14] = "NewNome";
//        cabecalho[15] = "OldNome";
//        cabecalho[16] = "NewCodIdioma";
//        cabecalho[17] = "OldCodIdioma";
//        cabecalho[18] = "NewCodClass";
//        cabecalho[19] = "OldCodClass";
//        cabecalho[20] = "NewCodLegenda";
//        cabecalho[21] = "OldCodLegenda";
//        cabecalho[22] = "NewCodCat";
//        cabecalho[23] = "OldCodCat";
//        cabecalho[24] = "NewCpf";
//        cabecalho[25] = "OldCpf";
//        cabecalho[26] = "NewPermissoes";
//        cabecalho[27] = "OldPermissoes";
//        cabecalho[28] = "NewHorario";
//        cabecalho[29] = "OldHorario";
//        cabecalho[30] = "NewCodSala";
//        cabecalho[31] = "OldCodSala";
//        cabecalho[32] = "NewCodFilme";
//        cabecalho[33] = "OldCodFilma";
//        cabecalho[34] = "NewFileira";
//        cabecalho[35] = "OldFileira";
//        cabecalho[36] = "NewNumero";
//        cabecalho[37] = "OldNumero";
//        cabecalho[38] = "NewCodSessao";
//        cabecalho[39] = "OldCodSessao";
//        cabecalho[40] = "NewCodPoltrona";
//        cabecalho[41] = "OldCodPoltrona";
//        cabecalho[42] = "NewEmissao";
//        cabecalho[43] = "OldEmissao";
//        cabecalho[44] = "NewTotal";
//        cabecalho[45] = "OldTotal";
//        cabecalho[46] = "NewCpfCliente";
//        cabecalho[47] = "OldCpfCliente";
//        cabecalho[48] = "NewCodUser";
//        cabecalho[49] = "OldCodUser";
//        cabecalho[50] = "NewCodVenda";
//        cabecalho[51] = "OldCodVenda";
//        cabecalho[52] = "NewIngresso";
//        cabecalho[53] = "OldIngresso";
//        cabecalho[54] = "NewDuracao";
//        cabecalho[55] = "OldDuracao";
        cabecalho[2] = "Ação";
        cabecalho[3] = "Usuário";
        cabecalho[4] = "DataHora";

        List<Auditoria> resultado = new ArrayList();
        String sql = "FROM auditoria "
            + "ORDER BY log_id";
        tblAuditoria.getColumnModel().getColumn(0).setPreferredWidth(30);
        tblAuditoria.getColumnModel().getColumn(1).setPreferredWidth(30);
        tblAuditoria.getColumnModel().getColumn(2).setPreferredWidth(30);
        tblAuditoria.getColumnModel().getColumn(3).setPreferredWidth(30);
        tblAuditoria.getColumnModel().getColumn(4).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(5).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(6).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(7).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(8).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(9).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(10).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(11).setPreferredWidth(30); 
//        tblAuditoria.getColumnModel().getColumn(12).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(13).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(14).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(15).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(16).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(17).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(18).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(19).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(20).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(21).setPreferredWidth(30); 
//        tblAuditoria.getColumnModel().getColumn(22).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(23).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(24).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(25).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(26).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(27).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(28).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(29).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(30).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(31).setPreferredWidth(30); 
//        tblAuditoria.getColumnModel().getColumn(32).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(33).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(34).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(35).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(36).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(37).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(38).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(39).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(40).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(41).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(42).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(43).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(44).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(45).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(46).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(47).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(48).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(49).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(50).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(51).setPreferredWidth(30); 
//        tblAuditoria.getColumnModel().getColumn(52).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(53).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(54).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(55).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(56).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(57).setPreferredWidth(30);
//        tblAuditoria.getColumnModel().getColumn(58).setPreferredWidth(30);
        
        DefaultTableModel modelo = (DefaultTableModel) tblAuditoria.getModel();
        modelo.setNumRows(0);
        try {
            DaoAuditoria daoAuditoria = new DaoAuditoria();
            resultado = daoAuditoria.consultaTodos();
            for (int i = 0; i < resultado.size(); i++) {
                Auditoria auditoria = resultado.get(i);
                //modelo.addRow(new Object[]{auditoria.getLog_id(), auditoria.getTabela(), auditoria.getNew_codigo(), auditoria.getOld_codigo(), auditoria.getNew_dia(), auditoria.getOld_dia(), auditoria.getNew_valor(), auditoria.getOld_valor(), auditoria.getNew_idioma(), auditoria.getOld_idioma(),auditoria.getNew_descricao(),auditoria.getOld_descricao(),auditoria.getNew_nome(),auditoria.getOld_nome(),auditoria.getNew_codIdioma(),auditoria.getOld_codIdioma(),auditoria.getNew_codClassificacao(),auditoria.getOld_codClassificacao(),auditoria.getNew_codLegenda(),auditoria.getOld_codLegenda(),auditoria.getNew_codCategoria(),auditoria.getOld_codCategoria(),auditoria.getNew_cpf(),auditoria.getOld_cpf(),auditoria.getNew_permissoes(),auditoria.getOld_permissoes(),auditoria.getNew_horario(),auditoria.getOld_horario(),auditoria.getNew_codSala(),auditoria.getOld_codSala(),auditoria.getNew_codFilme(),auditoria.getOld_codFilme(),auditoria.getNew_fileira(),auditoria.getOld_fileira(),auditoria.getNew_numero(),auditoria.getOld_numero(),auditoria.getNew_codSessao(),auditoria.getOld_codSessao(),auditoria.getNew_codPoltrona(),auditoria.getOld_codPoltrona(),auditoria.getNew_emissao(),auditoria.getOld_emissao(),auditoria.getNew_total(),auditoria.getOld_total(),auditoria.getNew_cpfCliente(),auditoria.getOld_cpfCliente(),auditoria.getNew_codUsuario(),auditoria.getOld_codUsuario(),auditoria.getNew_codVenda(),auditoria.getOld_codVenda(),auditoria.getNew_codIngresso(),auditoria.getOld_codIngresso(),auditoria.getNew_duracao(),auditoria.getOld_duracao(),auditoria.getAcao(),auditoria.getUsuario(),auditoria.getHora()});
                modelo.addRow(new Object[]{auditoria.getLog_id(), auditoria.getTabela(),auditoria.getAcao(),auditoria.getUsuario(),auditoria.getHora()});

            }
        } catch (HibernateException hibEx) {
            hibEx.printStackTrace();
        }

    }
       
    public void inicia() {
        popularTabela();
        codigo = 0;
    }
    //parte que cria e exporta a tabela CSV
//    public static void main(String[] args) {
// 
//   try {
//    PrintWriter pw= new PrintWriter(new File("C:\\Users\\Acer\\Documents\\NetBeansProjects\\auditoria.csv"));
//    StringBuilder sb=new StringBuilder();
// 
// 
//    Connection connection=null;
//    DB_Connection obj_DB_Connection=new DB_Connection();
//    connection=obj_DB_Connection.getConnection();
//    ResultSet rs=null;
// 
//    String query="select * from auditoria";
//    PreparedStatement ps=connection.prepareStatement(query);
//    rs=ps.executeQuery();
// 
//    while(rs.next()){
//     sb.append(rs.getString("log_id"));
//     sb.append(","); 
//     sb.append(rs.getString("tabela"));
//     sb.append(",");
//     sb.append(rs.getString("new_codigo"));
//     sb.append(",");
//     sb.append(rs.getString("old_codigo"));
//     sb.append(",");
//     sb.append(rs.getString("new_dia"));
//     sb.append(",");
//     sb.append(rs.getString("old_dia"));
//     sb.append(","); 
//     sb.append(rs.getString("new_valor"));
//     sb.append(",");
//     sb.append(rs.getString("old_valor"));
//     sb.append(",");
//     sb.append(rs.getString("new_idioma"));
//     sb.append(",");
//     sb.append(rs.getString("old_idioma"));
//     sb.append(",");
//     sb.append(rs.getString("new_descricao"));
//     sb.append(",");
//     sb.append(rs.getString("old_descricao"));
//     sb.append(","); 
//     sb.append(rs.getString("new_nome"));
//     sb.append(",");
//     sb.append(rs.getString("old_nome"));
//     sb.append(",");
//     sb.append(rs.getString("new_codIdioma"));
//     sb.append(",");
//     sb.append(rs.getString("old_codIdioma"));
//     sb.append(",");
//     sb.append(rs.getString("new_codClassificacao"));
//     sb.append(",");
//     sb.append(rs.getString("old_codClassificacao"));
//     sb.append(","); 
//     sb.append(rs.getString("new_codLegenda"));
//     sb.append(",");
//     sb.append(rs.getString("old_codLegenda"));
//     sb.append(",");
//     sb.append(rs.getString("new_codCategoria"));
//     sb.append(",");
//     sb.append(rs.getString("old_codCategoria"));
//     sb.append(",");
//     sb.append(rs.getInt("new_cpf"));
//     sb.append(",");
//     sb.append(rs.getInt("old_cpf"));
//     sb.append(","); 
//     sb.append(rs.getString("new_permissoes"));
//     sb.append(",");
//     sb.append(rs.getString("old_permissoes"));
//     sb.append(",");
//     sb.append(rs.getDate("new_horario"));
//     sb.append(",");
//     sb.append(rs.getDate("old_horario"));
//     sb.append(",");
//     sb.append(rs.getString("new_codSala"));
//     sb.append(",");
//     sb.append(rs.getString("old_codSala"));
//     sb.append(","); 
//     sb.append(rs.getString("new_codFilme"));
//     sb.append(",");
//     sb.append(rs.getString("old_codFilme"));
//     sb.append(",");
//     sb.append(rs.getInt("new_fileira"));
//     sb.append(",");
//     sb.append(rs.getInt("old_fileira"));
//     sb.append(",");
//     sb.append(rs.getString("new_numero"));
//     sb.append(",");
//     sb.append(rs.getString("old_numero"));
//     sb.append(","); 
//     sb.append(rs.getString("new_codSessao"));
//     sb.append(",");
//     sb.append(rs.getString("old_codSessao"));
//     sb.append(",");
//     sb.append(rs.getString("new_codPoltrona"));
//     sb.append(",");
//     sb.append(rs.getString("old_codPoltrona"));
//     sb.append(",");
//     sb.append(rs.getString("new_emissao"));
//     sb.append(",");
//     sb.append(rs.getString("old_emissao"));
//     sb.append(","); 
//     sb.append(rs.getString("new_total"));
//     sb.append(",");
//     sb.append(rs.getString("old_total"));
//     sb.append(",");
//     sb.append(rs.getString("new_cpfCliente"));
//     sb.append(",");
//     sb.append(rs.getString("old_cpfCliente"));
//     sb.append(",");
//     sb.append(rs.getString("new_codUsuario"));
//     sb.append(",");
//     sb.append(rs.getString("old_codUsuario"));
//     sb.append(","); 
//     sb.append(rs.getString("new_codVenda"));
//     sb.append(",");
//     sb.append(rs.getString("old_codVenda"));
//     sb.append(",");
//     sb.append(rs.getString("new_codIngresso"));
//     sb.append(",");
//     sb.append(rs.getString("old_codIngresso"));
//     sb.append(",");
//     sb.append(rs.getString("new_duracao"));
//     sb.append(",");
//     sb.append(rs.getString("old_duracao"));
//     sb.append(",");
//     sb.append(rs.getString("acao"));
//     sb.append(",");
//     sb.append(rs.getString("usuario"));
//     sb.append(",");
//     sb.append(rs.getString("hora"));
//     sb.append("\r\n");
//    }
// 
//    pw.write(sb.toString());
//    pw.close();
//    System.out.println("finished");
// 
//   } catch (Exception e) {
//       
//   } 
//}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAuditoria = new javax.swing.JTable();
        btnFechar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnExcel = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();

        setClosable(true);
        setTitle("Consulta de Auditoria");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tblAuditoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Log ID", "Tabela", "Ação", "Usuário", "Data & Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAuditoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAuditoriaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAuditoria);

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Planilha para Consulta de Auditoria:");

        btnExcel.setText("Exportar Tabela Completa Excel");
        btnExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelActionPerformed(evt);
            }
        });

        btnRelatorio.setText("Gerar Relatório PDF");
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnExcel)
                        .addGap(99, 99, 99)
                        .addComponent(btnRelatorio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFechar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFechar)
                    .addComponent(btnExcel)
                    .addComponent(btnRelatorio))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblAuditoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAuditoriaMouseClicked

    }//GEN-LAST:event_tblAuditoriaMouseClicked

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelActionPerformed
        JFileChooser excelFileChooser = new JFileChooser();
        excelFileChooser.showSaveDialog(null);
        try {
            PrintWriter pw= new PrintWriter(new File("C:\\Users\\Acer\\Documents\\NetBeansProjects\\auditoria.csv"));
            StringBuilder sb=new StringBuilder();

            Connection connection=null;
            DB_Connection obj_DB_Connection=new DB_Connection();
            connection=obj_DB_Connection.getConnection();
            ResultSet rs=null;

            String query="select * from auditoria";
            PreparedStatement ps=connection.prepareStatement(query);
            rs=ps.executeQuery();

            while(rs.next()){
                sb.append(rs.getString("log_id"));
                sb.append(",");
                sb.append(rs.getString("tabela"));
                sb.append(",");
                sb.append(rs.getString("new_codigo"));
                sb.append(",");
                sb.append(rs.getString("old_codigo"));
                sb.append(",");
                sb.append(rs.getString("new_dia"));
                sb.append(",");
                sb.append(rs.getString("old_dia"));
                sb.append(",");
                sb.append(rs.getString("new_valor"));
                sb.append(",");
                sb.append(rs.getString("old_valor"));
                sb.append(",");
                sb.append(rs.getString("new_idioma"));
                sb.append(",");
                sb.append(rs.getString("old_idioma"));
                sb.append(",");
                sb.append(rs.getString("new_descricao"));
                sb.append(",");
                sb.append(rs.getString("old_descricao"));
                sb.append(",");
                sb.append(rs.getString("new_nome"));
                sb.append(",");
                sb.append(rs.getString("old_nome"));
                sb.append(",");
                sb.append(rs.getString("new_codIdioma"));
                sb.append(",");
                sb.append(rs.getString("old_codIdioma"));
                sb.append(",");
                sb.append(rs.getString("new_codClassificacao"));
                sb.append(",");
                sb.append(rs.getString("old_codClassificacao"));
                sb.append(",");
                sb.append(rs.getString("new_codLegenda"));
                sb.append(",");
                sb.append(rs.getString("old_codLegenda"));
                sb.append(",");
                sb.append(rs.getString("new_codCategoria"));
                sb.append(",");
                sb.append(rs.getString("old_codCategoria"));
                sb.append(",");
                sb.append(rs.getInt("new_cpf"));
                sb.append(",");
                sb.append(rs.getInt("old_cpf"));
                sb.append(",");
                sb.append(rs.getString("new_permissoes"));
                sb.append(",");
                sb.append(rs.getString("old_permissoes"));
                sb.append(",");
                sb.append(rs.getDate("new_horario"));
                sb.append(",");
                sb.append(rs.getDate("old_horario"));
                sb.append(",");
                sb.append(rs.getString("new_codSala"));
                sb.append(",");
                sb.append(rs.getString("old_codSala"));
                sb.append(",");
                sb.append(rs.getString("new_codFilme"));
                sb.append(",");
                sb.append(rs.getString("old_codFilme"));
                sb.append(",");
                sb.append(rs.getInt("new_fileira"));
                sb.append(",");
                sb.append(rs.getInt("old_fileira"));
                sb.append(",");
                sb.append(rs.getString("new_numero"));
                sb.append(",");
                sb.append(rs.getString("old_numero"));
                sb.append(",");
                sb.append(rs.getString("new_codSessao"));
                sb.append(",");
                sb.append(rs.getString("old_codSessao"));
                sb.append(",");
                sb.append(rs.getString("new_codPoltrona"));
                sb.append(",");
                sb.append(rs.getString("old_codPoltrona"));
                sb.append(",");
                sb.append(rs.getString("new_emissao"));
                sb.append(",");
                sb.append(rs.getString("old_emissao"));
                sb.append(",");
                sb.append(rs.getString("new_total"));
                sb.append(",");
                sb.append(rs.getString("old_total"));
                sb.append(",");
                sb.append(rs.getString("new_cpfCliente"));
                sb.append(",");
                sb.append(rs.getString("old_cpfCliente"));
                sb.append(",");
                sb.append(rs.getString("new_codUsuario"));
                sb.append(",");
                sb.append(rs.getString("old_codUsuario"));
                sb.append(",");
                sb.append(rs.getString("new_codVenda"));
                sb.append(",");
                sb.append(rs.getString("old_codVenda"));
                sb.append(",");
                sb.append(rs.getString("new_codIngresso"));
                sb.append(",");
                sb.append(rs.getString("old_codIngresso"));
                sb.append(",");
                sb.append(rs.getString("new_duracao"));
                sb.append(",");
                sb.append(rs.getString("old_duracao"));
                sb.append(",");
                sb.append(rs.getString("acao"));
                sb.append(",");
                sb.append(rs.getString("usuario"));
                sb.append(",");
                sb.append(rs.getString("hora"));
                sb.append("\r\n");
            }

            pw.write(sb.toString());
            pw.close();
            System.out.println("finished");

        } catch (Exception e) {
            logger.error(agora+" ERROR: Erro ao exportar planilha EXCEL! --  Tela de Auditoria");
        }
    }//GEN-LAST:event_btnExcelActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        try {
            // Compila o relatorio
            JasperReport relatorio = JasperCompileManager.compileReport(getClass().getResourceAsStream("/relatorios/Auditoria.jrxml"));

            // Mapeia campos de parametros para o relatorio, mesmo que nao existam
            Map parametros = new HashMap();

            // Executa relatorio
            JasperPrint impressao = JasperFillManager.fillReport(relatorio, parametros, ConnectionFactory.getConnection());

            // Exibe resultado em video
            JasperViewer.viewReport(impressao, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + e);
            logger.error(agora+" ERROR: Erro ao gerar relatório!  --  Tela Auditoria");
        }
    }//GEN-LAST:event_btnRelatorioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcel;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAuditoria;
    // End of variables declaration//GEN-END:variables
}
