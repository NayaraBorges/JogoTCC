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
public class SelecaoDAO extends DAOGenerico<Selecao> implements ISelecaoRepositorio{

    public SelecaoDAO() {
        super(Selecao.class);
    }
    
    @Override
    public Long getID(Selecao obj){
        return obj.getId();
    }

    @Override
    public List<Selecao> listarTodos() {
        Query query=(Query) manager.createQuery("select u from Selecao u");
        return query.getResultList();
    }

    @Override
    public List<Selecao> listarPorNome(String nome) {
        Query query=(Query) manager.createQuery("select u from Selecao u where u.nome=:p");
        query.setParameter("p", nome);
        return query.getResultList();
    }

    @Override
    public List<Selecao> listarPorGrupo(Grupo grupo) {
        Query query=(Query) manager.createQuery("select u from Selecao u where u.grupo=:p");
        query.setParameter("p", grupo);
        return query.getResultList();
    }
    
}
