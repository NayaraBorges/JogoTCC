/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.domainModel;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Nayara
 */
@Entity
@Table(name="Selecao")
public class Selecao implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    protected Long id;
    @Column(name="Nome")
    private String nome;
    @ManyToMany
    private Grupo grupo;
    @OneToOne
    private Jogador tecnico;
    @OneToOne
    private Usuario usuarioInclusao;
    @OneToOne
    private Usuario usuarioAlteracao;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataInclusao;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataAlteracao;

    public Date getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(Date dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    public Date getDataInclusao() {
        return dataInclusao;
    }

    public void setDataInclusao(Date dataInclusao) {
        this.dataInclusao = dataInclusao;
    }

    public Usuario getUsuarioAlteracao() {
        return usuarioAlteracao;
    }

    public void setUsuarioAlteracao(Usuario usuarioAlteracao) {
        this.usuarioAlteracao = usuarioAlteracao;
    }

    public Usuario getUsuarioInclusao() {
        return usuarioInclusao;
    }

    public void setUsuarioInclusao(Usuario usuarioInclusao) {
        this.usuarioInclusao = usuarioInclusao;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
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

    public Jogador getTecnico() {
        return tecnico;
    }

    public void setTecnico(Jogador tecnico) {
        this.tecnico = tecnico;
    }

}
