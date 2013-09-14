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
public interface IGrupoRepositorio extends IRepositorio <Grupo>{
    List<Grupo> listarPorDescricao(String descricao);
}
