package com.catalogoRailway.repository;

import com.catalogoRailway.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
     
}
