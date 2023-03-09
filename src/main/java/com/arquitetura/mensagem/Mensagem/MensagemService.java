package com.arquitetura.mensagem.Mensagem;

import com.arquitetura.mensagem.Usuario.Usuario;
import com.arquitetura.mensagem.Usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MensagemService {
    private List<Mensagem> mensagens = new ArrayList<>();

    @Autowired
    private UsuarioService usuarioService;

    public List<Mensagem> listarMensagens(){return mensagens;}

    public Mensagem criaMensagemTexto(MensagemTexto mensagemTexto){
    for (Usuario usuario : usuarioService.listarUsuarios()){
        if (usuario.getId().equals(mensagemTexto.getAutor().getId())){
            mensagens.add(mensagemTexto);
            return mensagemTexto;
        }
    }
    return null;
    }
    public Mensagem criaMensagemArquivo(MensagemArquivo mensagemArquivo){
        for (Usuario usuario : usuarioService.listarUsuarios()){
            if (usuario.getId().equals(mensagemArquivo.getAutor().getId())){
                mensagens.add(mensagemArquivo);
                return mensagemArquivo;
            }
        }
        return null;
    }

    public Mensagem getMensagem(String id ) {
        for (Mensagem mensagem : mensagens){
            if (mensagem.getId().equals(id)){
                return mensagem;
            }
        }
        return null;

    }
    public List<Mensagem> getMensagemUser(String id){
        List<Mensagem> mensagensUsuario = new ArrayList<>();
        for (Mensagem mensagem : mensagens){
            if (mensagem.getAutor().getId().equals(id)){
                mensagensUsuario.add(mensagem);
            }
        }
        return mensagensUsuario;
    }

}
