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
public interface IJogoGolsRepositorio extends IRepositorio <JogoGols>{
    List<JogoGols> listarPorJogador(Jogador jogador);
    List<JogoGols> listarPorJogo(Jogo jogo);
    
}
