package com.example.retoapp.modelo.repositorio;

import com.example.retoapp.modelo.entidad.Gama;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GamaRepository extends JpaRepository<Gama,Long> {
}
