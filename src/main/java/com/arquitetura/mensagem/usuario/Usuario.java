package com.arquitetura.mensagem.usuario;

import com.arquitetura.mensagem.mensagem.Mensagem;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String identifier;
    private String nome;

    @OneToMany(mappedBy = "usuario")
    private List<Mensagem> mensagens;
}

