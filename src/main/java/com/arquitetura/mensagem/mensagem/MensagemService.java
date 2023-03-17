package com.arquitetura.mensagem.mensagem;

import com.arquitetura.mensagem.usuario.Usuario;
import com.arquitetura.mensagem.usuario.UsuarioRepository;
import com.arquitetura.mensagem.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class MensagemService {
    @Autowired
    private MensagemRepository mensagemRepository;
    @Autowired
    private UsuarioService usuarioService;

    public List<Mensagem> listarMensagens(){return mensagemRepository.findAll();}

    public Mensagem criaMensagemTexto(MensagemTexto mensagemTexto, String id_autor){
        mensagemTexto.setIdentifier(UUID.randomUUID().toString());
        mensagemTexto.setUsuario(usuarioService.getUsuario(id_autor));
        return mensagemRepository.save(mensagemTexto);
    }
    public Mensagem criaMensagemArquivo(MensagemArquivo mensagemArquivo, String id_autor) {
        mensagemArquivo.setIdentifier(UUID.randomUUID().toString());
        mensagemArquivo.setUsuario(usuarioService.getUsuario(id_autor));
        return mensagemRepository.save(mensagemArquivo);
    }

    public Mensagem getMensagem(String identifier ) {
        return mensagemRepository.findByIdentifier(identifier);
    }

    public List<Mensagem> getMensagemUser(String idUser) {
        return mensagemRepository.findByUsuario(usuarioService.getUsuario(idUser));
    }

}
