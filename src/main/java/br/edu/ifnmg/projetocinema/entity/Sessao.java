/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.projetocinema.entity;

import java.time.LocalDateTime;

/**
 *
 * @author Dayany_LucasFreitas_ThiagoRiquelmo
 */
public class Sessao extends Entidade{
    private Filme filme;
    private LocalDateTime horario;
    private Sala sala;
    private Audio audio;
    private Integer ingressosVendidos;
    private Float valorSessao;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Sessao() {
    }

    public Sessao(Filme filme, LocalDateTime horario, Sala sala, Audio audio, Integer ingressosVendidos, Float valorSessao) {
        this.filme = filme;
        this.horario = horario;
        this.sala = sala;
        this.audio = audio;
        this.ingressosVendidos = ingressosVendidos;
        this.valorSessao = valorSessao;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Audio getAudio() {
        return audio;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    public Integer getIngressosVendidos() {
        return ingressosVendidos;
    }

    public void setIngressosVendidos(Integer ingressosVendidos) {
        this.ingressosVendidos = ingressosVendidos;
    }

    public Float getValorSessao() {
        return valorSessao;
    }

    public void setValorSessao(Float valorSessao) {
        this.valorSessao = valorSessao;
    }
    //</editor-fold>
    
}
