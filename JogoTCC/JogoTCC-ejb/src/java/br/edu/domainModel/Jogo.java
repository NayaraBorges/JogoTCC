/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.domainModel;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.joda.time.DateTime;

/**
 *
 * @author Nayara
 */
@Entity
@Table(name="Jogo")
public class Jogo implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    protected Long id;
    @ManyToMany
    private Fase fase;
    @ManyToOne
    private Selecao selecao1;
    @ManyToOne
    private Selecao selecao2;
    @Column(name="Placar1")
    private int placar1;
    @Column(name="Placar2")
    private int placar2;
    @Column(name="DataJogo")
    private DateTime data;
    @Column(name="HoraJogo")
    private DateTime hora;
    @OneToOne
    private Estadio estadio;
    @OneToOne
    private Usuario usuarioInclusao;
    @OneToOne
    private Usuario usuarioAlteracao;
    @Column(name="DataInclusao")
    private DateTime dataInclusao;
    @Column(name="DataAlteracao")
    private DateTime dataAlteracao;

    public DateTime getData() {
        return data;
    }

    public DateTime getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(DateTime dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    public DateTime getDataInclusao() {
        return dataInclusao;
    }

    public void setDataInclusao(DateTime dataInclusao) {
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

    public void setData(DateTime data) {
        this.data = data;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public Fase getFase() {
        return fase;
    }

    public void setFase(Fase fase) {
        this.fase = fase;
    }

    public DateTime getHora() {
        return hora;
    }

    public void setHora(DateTime hora) {
        this.hora = hora;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    
    
    
}
