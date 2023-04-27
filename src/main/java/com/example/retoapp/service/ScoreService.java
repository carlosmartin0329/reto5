package com.example.retoapp.service;


import com.example.retoapp.modelo.entidad.Score;
import com.example.retoapp.modelo.repositorio.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreService {
    @Autowired
    private ScoreRepository repository;

    public List<Score> getAll(){
        return repository.findAll();
    }
    public Score save(Score score){
        return repository.save(score);
    }
}
