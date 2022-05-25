/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.projetocinema;

import br.edu.ifnmg.projetocinema.repository.GeneroDao;
import br.edu.ifnmg.projetocinema.entity.Genero;

/**
 *
 * @author Dayany_LucasFreitas_ThiagoRiquelmo
 */
public class Main {
    public static void main(String[] args) {
        Genero gen = new Genero("Comedia");
    
        new GeneroDao().salvar(gen);
    }
    
}
