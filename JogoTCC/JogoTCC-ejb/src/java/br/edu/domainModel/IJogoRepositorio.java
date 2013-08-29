/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.domainModel;

import java.util.List;
import javax.ejb.Remote;
import org.joda.time.DateTime;

/**
 *
 * @author Nayara
 */
@Remote
public interface IJogoRepositorio extends IRepositorio <Jogo>{
    List<Jogo> listarPorFase(Fase fase);
    List<Jogo> listarPorDataJogo(DateTime dataJogo);
    List<Jogo> listarPorSelecao(Selecao selecao);
    List<Jogo> listarPorEstadio(Estadio estadio);
    
}
