package com.example.projeto1.service;

import com.example.projeto1.entity.Pessoa;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    public Pessoa buscarPessoa(){
        Pessoa p = new Pessoa(1L,"Felipe Couto","0-");
        p.setId(1L);
        p.setNome("Felipe Couto");

        return p;
    }
}
