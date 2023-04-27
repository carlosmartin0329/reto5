package com.example.retoapp.modelo.repositorio;

import com.example.retoapp.modelo.entidad.Score;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score,Long> {
}
