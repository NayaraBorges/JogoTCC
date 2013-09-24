/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.presentation;

import br.edu.domainModel.IJogadorRepositorio;
import br.edu.domainModel.Jogador;
import br.edu.domainModel.Selecao;
import br.edu.domainModel.Usuario;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Nayara
 */
public class JogadorBean implements Serializable{
    
    IJogadorRepositorio repo;
    
    Long id;
    String nome;
    int numeroCamisa;
    Selecao selecao;
    Usuario usuarioInclusao;
    Usuario usuarioAlteracao;
    Date dataInclusao;
    Date dataAlteracao;
    
    List<Jogador> listagem;
    Jogador jogador;

     public void abrir(){
        if(id > 0)
            setJogador(repo.abrir(id));
    }
    
    public String editar(){
        abrir();
        return "salvarCamping.xhtml";
    }
    
    public String apagar(){
        abrir();
        repo.apagar(jogador);
        listagem = null;
        return "listarJogador.xhtml";
    }
    
    public void salvar(){
        abrir();
        
        if(jogador == null)
            jogador = new Jogador();
        
        jogador.setNome(nome);
        jogador.setNumeroCamisa(numeroCamisa);
        jogador.setSelecao(selecao);
        jogador.setUsuarioAlteracao(usuarioAlteracao);
        jogador.setUsuarioInclusao(usuarioInclusao);
        jogador.setDataAlteracao(dataAlteracao);
        jogador.setDataInclusao(dataInclusao);
        
        repo.salvar(jogador);
    }
   
    public List<Jogador> getListagem() {
        if (listagem == null){
            listagem = repo.listarTodos();
        }
        return listagem;
    }

    public void setListagem(List<Jogador> listagem) {
        this.listagem = listagem;
    }
        
    public IJogadorRepositorio getRepo() {
        return repo;
    }

    public void setRepo(IJogadorRepositorio repo) {
        this.repo = repo;
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

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public Selecao getSelecao() {
        return selecao;
    }

    public void setSelecao(Selecao selecao) {
        this.selecao = selecao;
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

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
        this.dataAlteracao = jogador.getDataAlteracao();
        this.dataInclusao = jogador.getDataInclusao();
        this.nome = jogador.getNome();
        this.numeroCamisa = jogador.getNumeroCamisa();
        this.selecao = jogador.getSelecao();
        this.usuarioAlteracao = jogador.getUsuarioAlteracao();
        this.usuarioInclusao = jogador.getUsuarioInclusao();
    
        
    }
    
    
}
