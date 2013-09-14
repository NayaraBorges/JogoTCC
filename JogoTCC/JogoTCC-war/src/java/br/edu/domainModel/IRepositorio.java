/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.domainModel;

import java.util.List;

/**
 *
 * @author NAYARA
 */
public interface IRepositorio <T>{
    boolean salvar (T obj);
    T abrir (long id);
    boolean apagar (T obj);
    List<T> listarTodos();
}
