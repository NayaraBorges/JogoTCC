/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.dataAccess;

import br.edu.domainModel.*;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author NAYARA
 */
public class JogoGolsDAO extends DAOGenerico<JogoGols> implements IJogoGolsRepositorio{

    public JogoGolsDAO() {
        super(JogoGols.class);
    }
    
    @Override
    public Long getID(JogoGols obj){
        return obj.getId();
    }

    @Override
    public List<JogoGols> listarTodos() {
        Query query=(Query) manager.createQuery("select u from JogoGols u");
        return query.getResultList();
    }

    @Override
    public List<JogoGols> listarPorJogador(Jogador jogador) {
        Query query=(Query) manager.createQuery("select u from JogoGols u where u.jogador=:p");
        query.setParameter("p", jogador);
        return query.getResultList();
    }

    @Override
    public List<JogoGols> listarPorJogo(Jogo jogo) {
        Query query=(Query) manager.createQuery("select u from JogoGols u where u.jogo=:p");
        query.setParameter("p", jogo);
        return query.getResultList();
    }
    
    
    
}
