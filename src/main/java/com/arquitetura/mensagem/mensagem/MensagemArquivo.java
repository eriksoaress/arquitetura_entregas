package com.arquitetura.mensagem.mensagem;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class MensagemArquivo extends Mensagem {
    private String arquivo;
}
