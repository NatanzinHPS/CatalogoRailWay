package com.catalogoRailway.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.catalogoRailway.model.Filme;
import com.catalogoRailway.repository.FilmeRepository;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    private final FilmeRepository repository;

    public FilmeController(FilmeRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Filme> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Filme salvar(@RequestBody Filme filme) {
        return repository.save(filme);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Filme> buscar(@PathVariable Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
