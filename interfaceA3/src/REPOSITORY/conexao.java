/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package REPOSITORY;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class conexao {

    static PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public Connection conectaBD(){
        Connection conexao = null;
        try {
            String url 
                  =  "jdbc:mysql://localhost:3306/sistema_de_gastos?connectionTimeZone=UTC";
                  String usuario = "root";
                  String senha = "root";
                  
            conexao = DriverManager.getConnection(url,usuario,senha);
            
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não foi possivel conectar com banco de dados");
            Logger.getLogger(conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexao;
    }
}
