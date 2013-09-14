/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.domainModel;

import java.util.List;
import org.joda.time.DateTime;

/**
 *
 * @author Nayara
 */
public interface IApostaRepositorio extends IRepositorio <Aposta>{
    List<Aposta> listarPorData(DateTime dataAposta);
    List<Aposta> listarPorJogo(Jogo jogo);
    List<Aposta> listarPorUsuario(Usuario usuario);
}
