/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.projetocinema.entity;

/**
 *
 * @author Dayany_LucasFreitas_ThiagoRiquelmo
 */
public class Guiche extends Entidade{
    private Integer numero;
    private Funcionario funcionario;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Guiche() {
    }

    public Guiche(Integer numero, Funcionario funcionario) {
        this.numero = numero;
        this.funcionario = funcionario;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    //</editor-fold>
    
}
