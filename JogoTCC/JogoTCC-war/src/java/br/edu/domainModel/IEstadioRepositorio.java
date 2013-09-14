/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.domainModel;

import java.util.List;

/**
 *
 * @author Nayara
 */
public interface IEstadioRepositorio extends IRepositorio <Estadio>{
    List<Estadio> listarPorCidade(String cidade);
    List<Estadio> listarPorNome(String nome);
    List<Estadio> listarPorEstado(String estado);
}