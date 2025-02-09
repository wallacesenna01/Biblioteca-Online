package com.github.wallace.biblioteca_online.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "users")
public class User implements Serializable {

    public User () {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String telefone;

    @OneToOne(mappedBy = "user")
    private Loan loan;


    public User(Long id, String name, String email, String telefone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.telefone = telefone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
