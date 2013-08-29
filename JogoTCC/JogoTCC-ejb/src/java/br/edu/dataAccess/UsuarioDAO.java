/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.dataAccess;

import br.edu.domainModel.*;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author NAYARA
 */
@Stateless
public class UsuarioDAO extends DAOGenerico<Usuario> implements IUsuarioRepositorio{

    public UsuarioDAO() {
        super(Usuario.class);
    }
    
    @Override
    public Long getID(Usuario obj){
        return obj.getId();
    }

    @Override
    public List<Usuario> listarTodos() {
        Query query=(Query) manager.createQuery("select u from Usuario u");
        return query.getResultList();
    }
   
    @Override
    public List<Usuario> listarPorLogin(String nome) {
        Query query=(Query) manager.createQuery("select u from Usuario u where u.nome=:p");
        query.setParameter("p", nome);
        return query.getResultList();
    }
    
}
