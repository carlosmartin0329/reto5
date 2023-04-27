package com.example.retoapp.modelo.repositorio;

import com.example.retoapp.modelo.entidad.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car,Long> {
}
