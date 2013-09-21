/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.domainModel;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Nayara
 */
public interface IJogoRepositorio extends IRepositorio <Jogo>{
    List<Jogo> listarPorFase(Fase fase);
    List<Jogo> listarPorDataJogo(Date dataJogo);
    List<Jogo> listarPorSelecao(Selecao selecao);
    List<Jogo> listarPorEstadio(Estadio estadio);
    
}
