
package daos;

import apoio.ConectionFactory;
import entidades.Auditoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javassist.CtMethod.ConstParameter.string;

public class DaoAuditoria {
  public List<Auditoria> read(){
      Connection con = ConectionFactory.getConnection();
      PreparedStatement stmt = null;
      ResultSet rs = null;
      
      List<Auditoria> auditoria = new ArrayList<>();
      
      try {
          stmt = con.prepareStatement("SELECT log_id, tabela, new_codigo, old_codigo, new_valor, old_valor FROM auditoria");
          rs = stmt.executeQuery();
          
          while(rs.next()){
                Auditoria audit = new Auditoria();
              
                audit.setLog_id(rs.getInt("log_id"));
                audit.setTabela(rs.getString("tabela"));
                audit.setNew_codigo(rs.getInt("new_codigo"));
                audit.setOd_codigo(rs.getInt("old_codigo"));
                audit.setNew_valor(rs.getDouble("new_valor"));
                audit.setOd_valor(rs.getDouble("old_valor"));
                
                
                auditoria.add(audit);
          }
          
      } catch (SQLException ex) {
          Logger.getLogger(DaoAuditoria.class.getName()).log(Level.SEVERE, null, ex);
      }finally{
          ConectionFactory.closeConnection(con, stmt, rs);
      }
      return auditoria;
  }  
}
