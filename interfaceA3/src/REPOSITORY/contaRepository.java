/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package REPOSITORY;

import MODELS.contaModel;
import VIEW.telaInicio;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class contaRepository { 
    Connection conexao; 
    
    @SuppressWarnings("ConvertToTryWithResources")
    public void CreateContas (contaModel contas){
        try {
            String sql = "insert into contas(conta,preco) values (?,?)";
            
            conexao = new conexao().conectaBD();
            
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1,contas.getConta());
            statement.setString(2,contas.getPreco());
           
            
            statement.execute();
            statement.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não foi possivel cadastrar conta");
            Logger.getLogger(sistemaRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public ArrayList<contaModel>readALLcontas(){
        
       return null;
}
        
        public void updateConta(contaModel contas){
        
        }
         public void deleteConta(contaModel contas){
        
        }
         
         public List<contaModel> readAllConta() throws SQLException {
        String sql = "SELECT conta,preco FROM sistema_de_gastos.contas";
        conexao = new conexao().conectaBD();
        PreparedStatement ps = conexao.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<contaModel> listaconta = new ArrayList<>();
        while (rs.next()) {
            String Conta = rs.getString("conta");
            String preco = rs.getString("preco");
            contaModel contas = new contaModel();
            contas.setConta(Conta);
            contas.setPreco(preco);
            listaconta.add(contas);

        }
        return listaconta;
                
    }
         
         
}
        

