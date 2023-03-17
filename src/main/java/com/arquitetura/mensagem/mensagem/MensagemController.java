package com.arquitetura.mensagem.mensagem;

import com.arquitetura.mensagem.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mensagem")
public class MensagemController {
    @Autowired
    private MensagemService mensagemService;

    @GetMapping
    public List<Mensagem> listarMensagens(){return mensagemService.listarMensagens();}

    @PostMapping("/texto")
    public Mensagem criaMensagemTexto(@RequestBody MensagemTexto mensagemTexto, String id_autor){return mensagemService.criaMensagemTexto(mensagemTexto, id_autor);}

    @PostMapping("/arquivo")
    public Mensagem criaMensagemArquivo(@RequestBody MensagemArquivo mensagemArquivo, @RequestBody String id_autor){return mensagemService.criaMensagemArquivo(mensagemArquivo, id_autor);}

    @GetMapping("/{id}")
    public Mensagem getMensagem(@PathVariable String id){return mensagemService.getMensagem(id);}

    @GetMapping("/{id}/user")
    public List<Mensagem> getMensagemUser(@PathVariable String id){return mensagemService.getMensagemUser(id);}


}
