/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.projetocinema.repository;

import br.edu.ifnmg.projetocinema.entity.Genero;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dayany_LucasFreitas_ThiagoRiquelmo
 */
public class GeneroDao extends Dao<Genero, Long>{

    @Override
    public String obterSentencaInsert() {
        return "insert into genero (nome) values (?);";
    }
    
    @Override
    public String obterSentencaUpdate() {
        return "update genero set nome = ? where id = ?;";
    }
    
    @Override
    public String obterSentencaLocalizarPorId() {
        return "select id, nome from genero where id = ?;";
    }
    
    @Override
    public void montarDeclaracao(PreparedStatement pstmt, Genero e) {
        // -- SQLs a serem montadas "n" parâmetros:
        // insert into pessoafisica (cpf, nome, email, nascimento ativo) values (?, ?, ?, ?);
        // update pessoafisica set nome = ?, email = ?, nascimento = ?, ativo = ? where id = ?;
//        
        // -- SQLs a serem montadas com 0/1 parâmetro
        // select id, nome, email, nascimento from pessoafisica;
        // select id, nome, email, nascimento from pessoafisica where id = ?;
        // delete from pessoafisica where id = ?;
//        
        // TODO Montar declaração SQL para "n" parâmetros
        try {
            if (e.getId() == null || e.getId() == 0) {
                pstmt.setString(1, e.getNome());

            } else {
                pstmt.setString(1, e.getNome());
                pstmt.setLong(2, e.getId());
            }
        } catch (Exception ex) {
            System.out.println("Exceptoin: " + ex);
        }

        // TODO Método específico SQL para 0/1 parâmetro
    }
    
    @Override
    public Genero extrairObjeto(ResultSet resultSet) {
        Genero gen = new Genero();

        try {
            gen.setId(resultSet.getLong("id"));
            gen.setNome(resultSet.getString("nome"));

        } catch (SQLException ex) {
            Logger.getLogger(GeneroDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return gen;
    }
    
}
