/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELS;


public class usuarioModel {
  private String nome;
  private String email;
  private String Senha;

    public usuarioModel(String nome, String email, String Senha) {
        this.nome = nome;
        this.email = email;
        this.Senha = Senha;
    }

    public usuarioModel(String nome, String email, char[] senha) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
   
  
}
