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
public interface IApostaRepositorio extends IRepositorio <Aposta>{
    List<Aposta> listarPorData(Date dataAposta);
    List<Aposta> listarPorJogo(Jogo jogo);
    List<Aposta> listarPorUsuario(Usuario usuario);
}
