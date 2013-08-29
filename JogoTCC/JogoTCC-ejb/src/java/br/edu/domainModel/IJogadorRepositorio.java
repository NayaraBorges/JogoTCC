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
public interface IJogadorRepositorio extends IRepositorio <Jogador>{
    List<Jogador> listarPorNome(String nome);
    List<Jogador> listarPorSelecao(Selecao selecao);
}
