package com.arquitetura.mensagem.Usuario;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {
    private List<Usuario> usuarios = new ArrayList<>();

    public List<Usuario> listarUsuarios(){return usuarios;}
    public Usuario adicionarUsuario(Usuario usuario){
        usuarios.add(usuario);
        return usuario;
    }
    public Usuario getUsuario(String id){
        for (Usuario usuario : usuarios){
            if (usuario.getId().equals(id)){
                return usuario;
            }
        }
        return null;
    }
}
