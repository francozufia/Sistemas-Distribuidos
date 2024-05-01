package DTO.dto.domain.entities;

import jakarta.persistence.Entity;

import java.util.Date;

@Entity public class Persona {
    private Long id;
    private String nombre;
    private String apellido;
    private int dni;
    private Date fecheNacimiento;
}
