package com.example.retoapp.api;


import com.example.retoapp.modelo.entidad.Score;
import com.example.retoapp.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Score")
@CrossOrigin("*")
public class ApiScore {
    @Autowired
    private ScoreService service;

    @GetMapping("/all")
    public List<Score> getAll(){
        return service.getAll();
    }
    @PostMapping("/save")
    public ResponseEntity save(@RequestBody Score score){
        service.save(score);
        return ResponseEntity.status(201).build();
    }
}
