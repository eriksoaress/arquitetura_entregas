package com.arquitetura.mensagem.mensagem;

import com.arquitetura.mensagem.usuario.Usuario;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Mensagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String identifier;

    @ManyToOne
    @JoinColumn(name = "id_autor")
    private Usuario usuario;
}