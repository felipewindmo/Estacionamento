/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;


public class Vaga {
    private int idVaga;
    private int numero;
    private String rua;
    private boolean obliquia;

    public int getIdVaga() {
        return idVaga;
    }

    public void setIdVaga(int idVaga) {
        this.idVaga = idVaga;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public boolean isObliquia() {
        return obliquia;
    }

    public void setObliquio(boolean obliquia) {
        this.obliquia = obliquia;
    }
}
