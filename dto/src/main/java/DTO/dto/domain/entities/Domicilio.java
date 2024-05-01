package DTO.dto.domain.entities;

import jakarta.persistence.Entity;

@Entity public class Domicilio {
    private Long id;
    private String calle;
    private int numero;
    private String provincia;
}
