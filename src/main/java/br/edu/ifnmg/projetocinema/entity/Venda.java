/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.projetocinema.entity;

import java.util.List;

/**
 *
 * @author Dayany_LucasFreitas_ThiagoRiquelmo
 */
public class Venda extends Entidade{
    private Long codigoVenda;
    private Integer quantidade;
    private Sessao sessao;
    private List<Ingresso> ingressos;
    private Double valorTotal;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Venda() {
    }

    public Venda(Long codigoVenda, Integer quantidade, Sessao sessao, List<Ingresso> ingressos, Double valorTotal) {
        this.codigoVenda = codigoVenda;
        this.quantidade = quantidade;
        this.sessao = sessao;
        this.ingressos = ingressos;
        this.valorTotal = valorTotal;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Long getCodigoVenda() {
        return codigoVenda;
    }

    public void setCodigoVenda(Long codigoVenda) {
        this.codigoVenda = codigoVenda;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
    //</editor-fold>
    
}
