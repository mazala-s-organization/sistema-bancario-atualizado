package br.com.senai.infob.primeiro_projeto.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "conta")
public class PoupancaModel {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_")
    private int id;

    @Column(name="deposito")
    private int deposito;

    @Column(name="transacao")
    private int transacao;

    @Column(name="valor")
    private double valor;

    @Column(name="rendimento")
    private String rendimento;

    public PoupancaModel() {
    }

    public PoupancaModel(int id, int deposito, int transacao, double valor, String rendimento) {
        this.id = id;
        this.deposito = deposito;
        this.transacao = transacao;
        this.valor = valor;
        this.rendimento = rendimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }

    public int getTransacao() {
        return transacao;
    }

    public void setTransacao(int transacao) {
        this.transacao = transacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getRendimento() {
        return rendimento;
    }

    public void setRendimento(String rendimento) {
        this.rendimento = rendimento;
    }

    
}
