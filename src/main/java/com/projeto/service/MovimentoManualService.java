package com.projeto.service;

import com.projeto.entity.MovimentoManual;
import com.projeto.repository.MovimentoManualRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovimentoManualService {

    @Autowired
    private MovimentoManualRepository repository;

    public List<MovimentoManual> findAll() {
        return repository.findAll();
    }

    public MovimentoManual save(MovimentoManual movimento) {
        return repository.save(movimento);
    }
}
