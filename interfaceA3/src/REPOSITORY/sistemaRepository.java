/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package REPOSITORY;

import MODELS.usuarioModel;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class sistemaRepository {
    Connection conexao;
 
    public void CreateUser (usuarioModel usuario){
        try {
            String sql = "insert into usuarios(nome,email,senha) values (?,?,?)";
            
            conexao = new conexao().conectaBD();
            
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1,usuario.getNome());
            statement.setString(2,usuario.getEmail());
            statement.setString(3,usuario.getSenha());
            
            statement.execute();
            statement.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não foi possivel cadastrar usuario");
            Logger.getLogger(sistemaRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public ArrayList<usuarioModel>readAllusuario(){
        
        return null;
    }
 
}
