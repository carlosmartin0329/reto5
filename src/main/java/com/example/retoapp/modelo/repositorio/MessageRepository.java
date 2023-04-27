package com.example.retoapp.modelo.repositorio;

import com.example.retoapp.modelo.entidad.Client;
import com.example.retoapp.modelo.entidad.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message,Long> {
}
