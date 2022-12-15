/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELS;


public class relatorioModel { 
   private String renda;
   private String gasto;
   private String mes;

    public relatorioModel(String renda, String gasto, String mes) {
        this.renda = renda;
        this.gasto = gasto;
        this.mes = mes;
    }

    public String getRenda() {
        return renda;
    }

    public String getGasto() {
        return gasto;
    }

    public String getMes() {
        return mes;
    }

    public void setRenda(String renda) {
        this.renda = renda;
    }

    public void setGasto(String gasto) {
        this.gasto = gasto;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
   
   
}
