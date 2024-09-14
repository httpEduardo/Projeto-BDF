package com.projeto.controller;

import com.projeto.entity.MovimentoManual;
import com.projeto.service.MovimentoManualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimentos")
public class MovimentoManualController {

    @Autowired
    private MovimentoManualService service;

    @GetMapping
    public List<MovimentoManual> getAllMovimentos() {
        return service.findAll();
    }

    @PostMapping
    public MovimentoManual createMovimento(@RequestBody MovimentoManual movimento) {
        return service.save(movimento);
    }
}
