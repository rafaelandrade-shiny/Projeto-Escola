package com.example.demo.controller;

import com.example.demo.model.Diretor;
import com.example.demo.Service.DiretorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/diretores")
public class DiretorController {

    @Autowired
    private DiretorService service;

    @PostMapping("/cadastrar")
    public ResponseEntity<Diretor> cadastrarDiretor(@RequestBody Diretor diretor) {
        Diretor novoDiretor = service.cadastrar(diretor);
        return ResponseEntity.ok(novoDiretor);
    }
    @GetMapping("/cadastrar-via-get")
    public ResponseEntity<Diretor> cadastrarDiretorViaGet(
            @RequestParam String nome,
            @RequestParam String email,
            @RequestParam String telefone,
            @RequestParam String senha
    ) {
        Diretor diretor = new Diretor();
        diretor.setNome(nome);
        diretor.setEmail(email);
        diretor.setTelefone(telefone);
        diretor.setSenha(senha);

        Diretor salvo = service.cadastrar(diretor);
        return ResponseEntity.ok(salvo);
    }
}