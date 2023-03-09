package com.arquitetura.mensagem.Mensagem;

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
    public Mensagem criaMensagemTexto(@RequestBody MensagemTexto mensagemTexto){return mensagemService.criaMensagemTexto(mensagemTexto);}

    @PostMapping("/arquivo")
    public Mensagem criaMensagemArquivo(@RequestBody MensagemArquivo mensagemArquivo){return mensagemService.criaMensagemArquivo(mensagemArquivo);}

    @GetMapping("/{id}")
    public Mensagem getMensagem(@PathVariable String id){return mensagemService.getMensagem(id);}

    @GetMapping("/{id}/user")
    public List<Mensagem> getMensagemUser(@PathVariable String id){return mensagemService.getMensagemUser(id);}


}
