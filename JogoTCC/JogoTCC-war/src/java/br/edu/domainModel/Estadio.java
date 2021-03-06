/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.domainModel;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Nayara
 */
@Entity
@Table(name="Estadio")
public class Estadio implements Serializable{
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    protected Long id;
    @Column(name="Nome")
    private String nome;
    @Column(name="Cidade")
    private String cidade;
    @Column(name="Estado")
    private String Estado;
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

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
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
    
}
