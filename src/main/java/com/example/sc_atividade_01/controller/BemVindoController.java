package com.example.sc_atividade_01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BemVindoController {

    @GetMapping("/bemvindo")
    public String mensagemDeBoasVindas() {
        return "Seja muito bem-vindo(a) a minha primeira API com Spring Boot!";
    }

    @GetMapping("/bemvindo/{nome}")
    public String mensagemPersonalizada(@PathVariable String nome) {
        return "Olá, " + nome + "! Seja bem-vindo(a)!";
    }
}