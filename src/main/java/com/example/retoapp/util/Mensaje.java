package com.example.retoapp.util;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Builder // crear un objeto
public class Mensaje {
    private int httpCode;
    private String mensaje;
}