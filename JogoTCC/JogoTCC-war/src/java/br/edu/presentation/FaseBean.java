/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.presentation;

import br.edu.domainModel.*;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Nayara
 */
public class FaseBean implements Serializable{
    
    IFaseRepositorio repo;

    Long id;
    String descricao;

    List<Fase> listagem;
    Fase fase;
    
    public void abrir(){
        if(id > 0)
            setFase(repo.abrir(id));
    }
    
    public String editar(){
        abrir();
        return "salvarFase.xhtml";
    }
    
    public String apagar(){
        abrir();
        repo.apagar(fase);
        listagem = null;
        return "listarFase.xhtml";
    }
    
    public void salvar(){
        abrir();
        
        if(fase == null)
            fase = new Fase();
        
        fase.setDescricao(descricao);
        
        repo.salvar(fase);
    }
    

    public IFaseRepositorio getRepo() {
        return repo;
    }

    public void setRepo(IFaseRepositorio repo) {
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

    public List<Fase> getListagem() {
        if(listagem == null){
            listagem = repo.listarTodos();
        }
        return listagem;
    }

    public void setListagem(List<Fase> listagem) {
        this.listagem = listagem;
    }

    public Fase getFase() {
        return fase;
    }

    public void setFase(Fase fase) {
        this.fase = fase;
        this.descricao = fase.getDescricao();
    }
    
    
}
