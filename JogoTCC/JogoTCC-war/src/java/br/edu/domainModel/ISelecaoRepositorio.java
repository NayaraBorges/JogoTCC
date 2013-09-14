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
public interface ISelecaoRepositorio extends IRepositorio <Selecao>{
    List<Selecao> listarPorNome(String nome);
    List<Selecao> listarPorGrupo(Grupo grupo);
    
}
