package com.example.retoapp.modelo.repositorio;

import com.example.retoapp.modelo.entidad.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
