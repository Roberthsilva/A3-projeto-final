/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SERVICES;

import REPOSITORY.conexao;
import VIEW.telaInicio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Robeth
 */
public class autentication {
    
                   public void logar(String email, String senha) {

        String sqluser = "SELECT * FROM sistema_de_gastos.usuarios where email=? and senha=?";
                       Connection conexao = new conexao().conectaBD();

        try {
  
            PreparedStatement ppuser = conexao.prepareStatement(sqluser);
  
            ppuser.setString(1, email);

            ppuser.setString(2, senha);

            ResultSet rs = ppuser.executeQuery();
            if (rs.next()) {
            new telaInicio().setVisible(true);
            
            } else {
                JOptionPane.showMessageDialog(null, "Usuario nao cadastrado, cadastre-se!");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Deu errado, ferrou tudo");
            Logger.getLogger(conexao.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
