/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.presentation;

import br.edu.domainModel.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Nayara
 */
public class SelecaoBean implements Serializable{
    
    ISelecaoRepositorio repo;
    
    Long id;
    String nome;
    Grupo grupo;
    Jogador tecnico;
    Usuario usuarioInclusao;
    Usuario usuarioAlteracao;
    Date dataInclusao;
    Date dataAlteracao;
    
    List<Selecao> listagem;
    Selecao selecao;

     public void abrir(){
        if(id > 0)
            setSelecao(repo.abrir(id));
    }
    
    public String editar(){
        abrir();
        return "salvarSelecao.xhtml";
    }
    
    public String apagar(){
        abrir();
        repo.apagar(selecao);
        listagem = null;
        return "listarSelecao.xhtml";
    }
    
    public void salvar(){
        abrir();
        
        if(selecao == null)
            selecao = new Selecao();
        
        selecao.setGrupo(grupo);
        selecao.setNome(nome);
        selecao.setTecnico(tecnico);
        selecao.setUsuarioAlteracao(usuarioAlteracao);
        selecao.setUsuarioInclusao(usuarioInclusao);
        selecao.setDataAlteracao(dataAlteracao);
        selecao.setDataInclusao(dataInclusao);
        
        repo.salvar(selecao);
    }
    
    public ISelecaoRepositorio getRepo() {
        return repo;
    }

    public void setRepo(ISelecaoRepositorio repo) {
        this.repo = repo;
    }

    public List<Selecao> getListagem() {
        if(listagem == null){
            listagem = repo.listarTodos();
        }
        return listagem;
    }

    public void setListagem(List<Selecao> listagem) {
        this.listagem = listagem;
    }

    public Selecao getSelecao() {
        return selecao;
    }

    public void setSelecao(Selecao selecao) {
        this.selecao = selecao;
        this.grupo = selecao.getGrupo();
        this.nome = selecao.getNome();
        this.tecnico = selecao.getTecnico();
        this.usuarioAlteracao = selecao.getUsuarioAlteracao();
        this.usuarioInclusao = selecao.getUsuarioInclusao();
        this.dataAlteracao = selecao.getDataAlteracao();
        this.dataInclusao = selecao.getDataInclusao();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Jogador getTecnico() {
        return tecnico;
    }

    public void setTecnico(Jogador tecnico) {
        this.tecnico = tecnico;
    }

    public Usuario getUsuarioInclusao() {
        return usuarioInclusao;
    }

    public void setUsuarioInclusao(Usuario usuarioInclusao) {
        this.usuarioInclusao = usuarioInclusao;
    }

    public Usuario getUsuarioAlteracao() {
        return usuarioAlteracao;
    }

    public void setUsuarioAlteracao(Usuario usuarioAlteracao) {
        this.usuarioAlteracao = usuarioAlteracao;
    }

    public Date getDataInclusao() {
        return dataInclusao;
    }

    public void setDataInclusao(Date dataInclusao) {
        this.dataInclusao = dataInclusao;
    }

    public Date getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(Date dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }


    
}
