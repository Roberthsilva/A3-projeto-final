/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELS;


public class contaModel {
   private String contas;
   private String preco;

    public contaModel(String contas, String preco) {
        this.contas = contas;
        this.preco = preco;
    }

    public contaModel() {
 
    }

    public String getConta() {
        return contas;
    }

    public String getPreco() {
        return preco;
    }

    public void setConta(String contas) {
        this.contas = contas;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
  
   
}
