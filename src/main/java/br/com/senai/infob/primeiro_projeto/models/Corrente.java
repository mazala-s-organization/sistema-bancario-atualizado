package br.com.senai.infob.primeiro_projeto.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "conta")
public class Corrente {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_")
    private int id;

    @Column(name="numero")
    private int numero;

    @Column(name="saldo")
    private double saldo;

    @Column(name="limite")
    private int limite;

    @Column(name="agencia")
    private String agencia;

    public Corrente() {
    }

    public Corrente(int id, int numero, double saldo, int limite, String agencia) {
        this.id = id;
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.agencia = agencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    
}
