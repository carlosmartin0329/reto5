package com.example.retoapp.modelo.entidad;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
@Table(name="gama")
@Builder

public class Gama implements Serializable {
   //primary key idGama
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long idGama;
   private String name;
   private String description;

   @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "gama")
   @JsonIgnoreProperties("gama")
   private List<Car> cars;
}
