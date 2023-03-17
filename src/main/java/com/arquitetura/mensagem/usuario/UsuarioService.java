package com.arquitetura.mensagem.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> listarUsuarios(){return usuarioRepository.findAll();}
    public Usuario adicionarUsuario(Usuario usuario){
        usuario.setIdentifier(UUID.randomUUID().toString());
        return usuarioRepository.save(usuario);
    }
    public Usuario getUsuario(String id){
        return usuarioRepository.findByIdentifier(id);
    }
}
