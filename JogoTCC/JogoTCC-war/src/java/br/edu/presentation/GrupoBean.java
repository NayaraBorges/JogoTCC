/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.presentation;

import br.edu.domainModel.Fase;
import br.edu.domainModel.Grupo;
import br.edu.domainModel.IGrupoRepositorio;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Nayara
 */
public class GrupoBean implements Serializable{
    
    IGrupoRepositorio repo;
    
    Long id;
    String descricao;
    
    List<Grupo> listagem;
    Grupo grupo;
    
    public void abrir(){
        if(id > 0)
            setGrupo(repo.abrir(id));
    }
    
    public String editar(){
        abrir();
        return "salvarGrupo.xhtml";
    }
    
    public String apagar(){
        abrir();
        repo.apagar(grupo);
        listagem = null;
        return "listarGrupo.xhtml";
    }
    
    public void salvar(){
        abrir();
        
        if(grupo == null)
            grupo = new Grupo();
        
        grupo.setDescricao(descricao);
        
        repo.salvar(grupo);
    }

    public IGrupoRepositorio getRepo() {
        return repo;
    }

    public void setRepo(IGrupoRepositorio repo) {
        this.repo = repo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Grupo> getListagem() {
        if(listagem == null){
            listagem = repo.listarTodos();
        }
        return listagem;
    }

    public void setListagem(List<Grupo> listagem) {
        this.listagem = listagem;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
        this.descricao = grupo.getDescricao();
    }
    
    
    

}
