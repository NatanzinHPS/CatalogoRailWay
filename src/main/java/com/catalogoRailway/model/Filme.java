package com.catalogoRailway.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    private String diretor;
    private int ano;
    private Double nota;
}