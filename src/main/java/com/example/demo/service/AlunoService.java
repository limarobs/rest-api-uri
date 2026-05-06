package com.example.demo.service;

import com.example.demo.dto.AlunoReponseDto;
import com.example.demo.model.Aluno;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlunoService {

    private List<Aluno> alunos = new ArrayList<>();

    public List<AlunoReponseDto> getAllAlunos(){

        List<AlunoReponseDto> resultado = new ArrayList<>();
        for (Aluno i : alunos) {
            resultado.add(new AlunoReponseDto(
                    i.getId(), i.getNome(), i.getEmail(), i.getIdade()
            ));
        }
        return resultado;
    }

    public Aluno salvarAluno(Aluno aluno){
        alunos.add(aluno);
        return aluno;
    }}
