/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.dataAccess;

import br.edu.domainModel.Aposta;
import br.edu.domainModel.IApostaRepositorio;
import br.edu.domainModel.Jogo;
import br.edu.domainModel.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;
import org.joda.time.DateTime;

/**
 *
 * @author NAYARA
 */
@Stateless
public class ApostaDAO extends DAOGenerico<Aposta> implements IApostaRepositorio{

    public ApostaDAO() {
        super(Aposta.class);
    }
    
    @Override
    public Long getID(Aposta obj){
        return obj.getId();
    }

    @Override
    public List<Aposta> listarTodos() {
        Query query=(Query) manager.createQuery("select u from Aposta u");
        return query.getResultList();
    }

    @Override
    public List<Aposta> listarPorData(DateTime dataAposta) {
        Query query=(Query) manager.createQuery("select u from Aposta u where u.dataAposta=:p");
        query.setParameter("p", dataAposta);
        return query.getResultList();
    }

    @Override
    public List<Aposta> listarPorJogo(Jogo jogo) {
        Query query=(Query) manager.createQuery("select u from Aposta u where u.jogo=:p");
        query.setParameter("p", jogo);
        return query.getResultList();
    }

    @Override
    public List<Aposta> listarPorUsuario(Usuario usuario) {
        Query query=(Query) manager.createQuery("select u from Aposta u where u.usuario=:p");
        query.setParameter("p", usuario);
        return query.getResultList();
    }
    
    
    
}
