package com.arquitetura.mensagem.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    @GetMapping
    public List<Usuario> listaUsuarios(){ return usuarioService.listarUsuarios(); }

    @PostMapping
    public Usuario adicionarUsuario(@RequestBody Usuario usuario){ return usuarioService.adicionarUsuario(usuario); }

    @GetMapping("/{id}")
    public Usuario getUsuario(@PathVariable String id){ return usuarioService.getUsuario(id); }
}
