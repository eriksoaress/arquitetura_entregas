package com.arquitetura.mensagem.Mensagem;

import com.arquitetura.mensagem.Usuario.Usuario;

import java.util.UUID;

public abstract class Mensagem {
    private Usuario autor;
    private String id = UUID.randomUUID().toString();

    public Usuario getAutor() {
        return autor;
    }

    public String getId() {
        return id;
    }
}