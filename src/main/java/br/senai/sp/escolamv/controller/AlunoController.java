package br.senai.sp.escolamv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/aluno")
public class AlunoController {

    @GetMapping("/primeira-pagina")
    public String primeiraPagina( ){
        return "primeira-pagina";
    }
    @GetMapping("/form-inserir")
    public String formInserir(){
        return "aluno/inserir";
    }
}

