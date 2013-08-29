/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.domainModel;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Nayara
 */
@Remote
public interface IEstadioRepositorio extends IRepositorio <Estadio>{
    List<Estadio> listarPorCidade(String cidade);
    List<Estadio> listarPorNome(String nome);
    List<Estadio> listarPorEstado(String estado);
}