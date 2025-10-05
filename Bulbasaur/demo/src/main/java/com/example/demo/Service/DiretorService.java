package com.example.demo.Service;

import com.example.demo.model.Diretor;
import com.example.demo.repository.DiretorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiretorService {

    @Autowired
    private DiretorRepository repository;

    public Diretor cadastrar(Diretor diretor) {
        return repository.save(diretor);
    }
}