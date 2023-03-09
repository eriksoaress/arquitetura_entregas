package com.arquitetura.mensagem.Usuario;

import java.util.UUID;

public class Usuario {
    private String nome;
    private String id = UUID.randomUUID().toString();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }
}

