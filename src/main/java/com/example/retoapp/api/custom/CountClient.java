package com.example.retoapp.api.custom;

import com.example.retoapp.modelo.entidad.Client;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Builder
public class CountClient {
    private Long total;
    private Client client;

}
