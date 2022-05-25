/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.projetocinema.entity;

/**
 *
 * @author Dayany_LucasFreitas_ThiagoRiquelmo
 */
public abstract class Entidade {
    private Long id;

    public Entidade() {
    }

    public Entidade(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
}