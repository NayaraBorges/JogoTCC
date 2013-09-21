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
@Table(name="Aposta")
public class Aposta implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ApostaID")
    protected Long id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataAposta;
    @Column(name="Placar1")
    private int placar1;
    @Column(name="Placar2")
    private int placar2;
    @OneToOne
    private Usuario usuario;
    @OneToOne
    private Jogo jogo;

    public Date getDataAposta() {
        return dataAposta;
    }

    public void setDataAposta(Date dataAposta) {
        this.dataAposta = dataAposta;
    }

   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
