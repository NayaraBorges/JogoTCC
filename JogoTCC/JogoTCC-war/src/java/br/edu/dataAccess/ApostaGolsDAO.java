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
public class ApostaGolsDAO extends DAOGenerico<ApostaGols> implements IApostaGolsRepositorio{

    public ApostaGolsDAO() {
        super(ApostaGols.class);
    }
    
    @Override
    public Long getID(ApostaGols obj){
        return obj.getId();
    }

    @Override
    public List<ApostaGols> listarTodos() {
        Query query=(Query) manager.createQuery("select u from ApostaGols u");
        return query.getResultList();
    }

    @Override
    public List<ApostaGols> listarPorAposta(Aposta aposta) {
        Query query=(Query) manager.createQuery("select u from ApostaGols u where u.aposta=:p");
        query.setParameter("p", aposta);
        return query.getResultList();
    }

    @Override
    public List<ApostaGols> listarPorJogador(Jogador jogador) {
        Query query=(Query) manager.createQuery("select u from ApostaGols u where u.jogador=:p");
        query.setParameter("p", jogador);
        return query.getResultList();
    }
    
    
    
}
