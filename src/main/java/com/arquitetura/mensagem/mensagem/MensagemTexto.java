package com.arquitetura.mensagem.mensagem;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class MensagemTexto extends Mensagem{
    private String texto;
//    public MensagemTexto(String identifier, String autor){
//        super(identifier, autor);
//    }
}
