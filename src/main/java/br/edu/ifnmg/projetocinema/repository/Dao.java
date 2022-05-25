/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.projetocinema.repository;

import br.edu.ifnmg.projetocinema.entity.Entidade;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Dayany_LucasFreitas_ThiagoRiquelmo
 */
public abstract class Dao<E, K> implements IDao<E, K> {
    
    @Override
    public K salvar(E e) {

        Long id = 0L;

        // TODO id==0 não distingue se uma pessoa física é nova ou se deve ser atualizada devido ao CPF sempre ser obrigatório
        if (((Entidade) e).getId() == null 
                || ((Entidade) e).getId() == 0) {
            // Inserir novo registro

            try ( PreparedStatement preparedStatement
                    = ConexaoBd
                            .getConexao()
                            .prepareStatement(
                                    obterSentencaInsert(),
                                    Statement.RETURN_GENERATED_KEYS)) {

                        // montar a declaração sql com os dados (->?)
                        montarDeclaracao(preparedStatement, e);
                        System.out.println("SQL: " + preparedStatement);
                        preparedStatement.executeUpdate();

                        ResultSet resultSet = preparedStatement.getGeneratedKeys();

                        if (resultSet.next()) {
                            id = resultSet.getLong(1);
                        }

                    } catch (Exception ex) {
                        System.out.println(">> " + ex);
                    }

        } else {
            // Atualizar registro existente
            try ( PreparedStatement preparedStatement
                    = ConexaoBd
                            .getConexao()
                            .prepareStatement(
                                    obterSentencaUpdate())) {

                        montarDeclaracao(preparedStatement, e);
                        System.out.println(">> " + preparedStatement);
                        preparedStatement.executeUpdate();
                        id = ((Entidade) e).getId();

                    } catch (Exception ex) {
                        System.out.println("Exception: " + ex);
                    }

        }

        return (K) id;
    }
    
    public E localizarPorId(K id) {
        try ( PreparedStatement preparedStatement
                = ConexaoBd.getConexao().prepareStatement(obterSentencaLocalizarPorId())) {

            // Substitui respectiva id na sentença SQL
            preparedStatement.setLong(1, (Long) id);

            // Recupera os dados da consulta
            ResultSet resultSet
                    = preparedStatement.executeQuery();

            // Movimenta para o primeiro dado recuperado
            if (resultSet.next()) {

                // Extrai o objeto representado pelo registro recuperado
                return extrairObjeto(resultSet);
            }

        } catch (Exception ex) {
            System.out.println(">> " + ex);
        }

        // Caso não haja registro com a id fornecida
        return null;
    }
    
    /**
     * Sentença SQL específica para cada tipo de objeto a ser persistido no
     * banco de dados.
     *
     * @return Sentença SQL de inserção.
     */
    public abstract String obterSentencaInsert();

    /**
     * Monta a declaração SQL com os valores contidos no objeto recebido.
     *
     * @param pstmt Consulta a ser preparada.
     * @param e Objeto com valores a serem embutidos na consulta.
     */
    public abstract String obterSentencaUpdate();

    /**
     * Monta a declaração SQL com os valores contidos no objeto recebido.
     *
     * @param pstmt Consulta a ser preparada.
     * @param e Objeto com valores a serem embutidos na consulta.
     */
    
    public abstract String obterSentencaLocalizarPorId();

    /**
     * Monta a declaração SQL com os valores contidos no objeto recebido.
     *
     * @param pstmt Consulta a ser preparada.
     * @param e Objeto com valores a serem embutidos na consulta.
     */
    
    public abstract void montarDeclaracao(PreparedStatement pstmt, E e);
    
    public abstract E extrairObjeto(ResultSet resultSet);
}