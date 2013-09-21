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

public class JogoBean implements Serializable{
    
    IJogoRepositorio repo;

    Long id;
    Fase fase;
    Selecao selecao1;
    Selecao selecao2;
    int placar1;
    int placar2;
    Date data;
    Date hora;
    Estadio estadio;
    Usuario usuarioInclusao;
    Usuario usuarioAlteracao;
    Date dataInclusao;
    Date dataAlteracao;

    List<Jogo> listagem;
    Jogo jogo;
    
    
    public void abrir(){
        if(id > 0)
            setJogo(repo.abrir(id));
    }
    
    public String editar(){
        abrir();
        return "salvarJogo.xhtml";
    }
    
    public String apagar(){
        abrir();
        repo.apagar(jogo);
        listagem = null;
        return "listarJogo.xhtml";
    }
    
    public void salvar(){
        abrir();
        
        if(jogo == null)
            jogo = new Jogo();
        
        jogo.setData(data);
        jogo.setHora(hora);
        jogo.setEstadio(estadio);
        jogo.setFase(fase);
        jogo.setPlacar1(placar1);
        jogo.setPlacar2(placar2);
        jogo.setSelecao1(selecao1);
        jogo.setSelecao2(selecao2);
        jogo.setUsuarioAlteracao(usuarioAlteracao);
        jogo.setUsuarioInclusao(usuarioInclusao);
        jogo.setDataAlteracao(dataAlteracao);
        jogo.setDataInclusao(dataInclusao);
        
        repo.salvar(jogo);
    }

    public IJogoRepositorio getRepo() {
        return repo;
    }

    public void setRepo(IJogoRepositorio repo) {
        this.repo = repo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Fase getFase() {
        return fase;
    }

    public void setFase(Fase fase) {
        this.fase = fase;
    }

    public Selecao getSelecao1() {
        return selecao1;
    }

    public void setSelecao1(Selecao selecao1) {
        this.selecao1 = selecao1;
    }

    public Selecao getSelecao2() {
        return selecao2;
    }

    public void setSelecao2(Selecao selecao2) {
        this.selecao2 = selecao2;
    }

    public int getPlacar1() {
        return placar1;
    }

    public void setPlacar1(int placar1) {
        this.placar1 = placar1;
    }

    public int getPlacar2() {
        return placar2;
    }

    public void setPlacar2(int placar2) {
        this.placar2 = placar2;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
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

    public List<Jogo> getListagem() {
       if (listagem == null){
            listagem = repo.listarTodos();
        }
        return listagem;
    }

    public void setListagem(List<Jogo> listagem) {
        this.listagem = listagem;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
        this.estadio = jogo.getEstadio();
        this.fase = jogo.getFase();
        this.placar1 = jogo.getPlacar1();
        this.placar2 = jogo.getPlacar2();
        this.selecao1 = jogo.getSelecao1();
        this.selecao2 = jogo.getSelecao2();
        this.usuarioAlteracao = jogo.getUsuarioAlteracao();
        this.usuarioInclusao = jogo.getUsuarioInclusao();
        this.dataAlteracao = jogo.getDataAlteracao();
        this.dataInclusao = jogo.getDataInclusao();
    }
    
    
}
