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
public interface IApostaGolsRepositorio extends IRepositorio <ApostaGols>{
    List<ApostaGols> listarPorAposta(Aposta aposta);
    List<ApostaGols> listarPorJogador(Jogador jogador);
}
