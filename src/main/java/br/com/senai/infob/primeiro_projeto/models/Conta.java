package br.com.senai.infob.primeiro_projeto.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "conta")
public class Conta {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_")
    private int id;

    @Column(name="cpf")
    private String cpf;

    @Column(name="numConta")
    private String numConta;
    
    @Column(name="tipoConta")
    private String tipoConta;

    @Column(name="saldo")
    private double saldo;

    @Column(name="nome")
    private String nome;

    @Column(name="agencia")
    private String agencia;

    @Column(name="senha")
    private String senha;
    

    public Conta() {
    }


    public Conta(int id, String cpf, String numConta, String tipoConta, double saldo, String nome, String agencia,
            String senha) {
        this.id = id;
        this.cpf = cpf;
        this.numConta = numConta;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
        this.nome = nome;
        this.agencia = agencia;
        this.senha = senha;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getNumConta() {
        return numConta;
    }


    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }


    public String getTipoConta() {
        return tipoConta;
    }


    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }


    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getAgencia() {
        return agencia;
    }


    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }


    public String getSenha() {
        return senha;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }


    public int getId() {
        return this.id;
    }


    public void setId (int novo_valor) {
        this.id = novo_valor;

    }

}