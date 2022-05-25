/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.projetocinema.entity;

/**
 *
 * @author Dayany_LucasFreitas_ThiagoRiquelmo
 */
public class Sala extends Entidade{
    private Integer numero;
    private Integer capacidade;
    private Tela tela;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Sala() {
    }

    public Sala(Integer numero, Integer capacidade, Tela tela) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.tela = tela;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public Tela getTela() {
        return tela;
    }

    public void setTela(Tela tela) {
        this.tela = tela;
    }
    //</editor-fold>
    
}
