/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package REPOSITORY;


import MODELS.relatorioModel;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class relatorioRepository {
    
    Connection conexao; 
    
    public void CreateRelatorio (relatorioModel relatorio){
        try {
            String sql = "insert into relatorio(renda,gasto,mes) values (?,?,?)";
            
            conexao = new conexao().conectaBD();
            
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1,relatorio.getRenda());
            statement.setString(2,relatorio.getGasto());
            statement.setString(3,relatorio.getMes());
           
            
            statement.execute();
            statement.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não foi possivel criar relatorio");
            Logger.getLogger(sistemaRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public ArrayList<relatorioModel>readALLcontas(){
        
       return null;
}
        
        public void updateRelatorio(relatorioModel conta){
        
        }
         public void deleteRelatorio(relatorioModel conta){
        
        }
         
         
         
      public List<relatorioModel> readAllRelatorio() throws SQLException {
        String sql = "SELECT renda,gasto,mes FROM sistema_de_gastos.relatorio";
        conexao = new conexao().conectaBD();
        PreparedStatement ps = conexao.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<relatorioModel> listaRelatorio = new ArrayList<>();
        while (rs.next()) {
            String renda = rs.getString("renda");
            String gasto = rs.getString("gasto");
            String mes = rs.getString("mes");
            relatorioModel relatorio = new relatorioModel(renda, gasto, mes);
            relatorio.setRenda(renda);
            relatorio.setGasto(gasto);
            relatorio.setMes(mes);
            listaRelatorio.add(relatorio);

        }
        return listaRelatorio;
                
    }    
         
}

 