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
public class FaseDAO extends DAOGenerico<Fase> implements IFaseRepositorio{

    public FaseDAO() {
        super(Fase.class);
    }
    
    @Override
    public Long getID(Fase obj){
        return obj.getId();
    }

    @Override
    public List<Fase> listarTodos() {
        Query query=(Query) manager.createQuery("select u from Fase u");
        return query.getResultList();
    }

    @Override
    public List<Fase> listarPorDescricao(String descricao) {
         Query query=(Query) manager.createQuery("select u from Fase u where u.descricao=:p");
        query.setParameter("p", descricao);
        return query.getResultList();
    }
    
    
    
}
