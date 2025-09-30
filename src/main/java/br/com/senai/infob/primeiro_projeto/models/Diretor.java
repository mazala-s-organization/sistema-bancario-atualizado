package br.com.senai.infob.primeiro_projeto.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "conta")
public class Diretor {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_")
    private int id;

    @Column(name="nome")
    private String nome;

    @Column(name="telefone")
    private int telefone;

    @Column(name="cpf")
    private int cpf;

    @Column(name="email")
    private String email;

    public Diretor() {
    }

    public Diretor(int id, String nome, int telefone, int cpf, String email) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
