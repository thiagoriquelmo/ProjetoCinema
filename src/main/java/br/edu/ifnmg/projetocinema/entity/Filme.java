/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.projetocinema.entity;

/**
 *
 * @author Dayany_LucasFreitas_ThiagoRiquelmo
 */
public class Filme extends Entidade{
    private String nome;
    private Integer duração;
    private Classificacao classificacao;
    private Genero generoPrincipal;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Filme() {
    }

    public Filme(String nome, Integer duração, Classificacao classificacao, Genero generoPrincipal) {
        this.nome = nome;
        this.duração = duração;
        this.classificacao = classificacao;
        this.generoPrincipal = generoPrincipal;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDuração() {
        return duração;
    }

    public void setDuração(Integer duração) {
        this.duração = duração;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }

    public Genero getGeneroPrincipal() {
        return generoPrincipal;
    }

    public void setGeneroPrincipal(Genero generoPrincipal) {
        this.generoPrincipal = generoPrincipal;
    }
    //</editor-fold>
}
