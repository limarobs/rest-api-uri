package com.example.demo.controller;


import com.example.demo.dto.AlunoReponseDto;
import com.example.demo.model.Aluno;
import com.example.demo.service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public List<AlunoReponseDto> listar(){
        return alunoService.getAllAlunos();

    }

    @PostMapping
    public Aluno criarAluno(@RequestBody Aluno aluno){
        return alunoService.salvarAluno(aluno);
    }


}


