/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.projetocinema.entity;

/**
 *
 * @author Dayany_LucasFreitas_ThiagoRiquelmo
 */
public class Funcionario extends Entidade{
    private String nome;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Funcionario() {
    }

    public Funcionario(String nome) {
        this.nome = nome;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    //</editor-fold>
    
}
