package DTO.dto.business.services;

import DTO.dto.domain.entities.Persona;

public interface IPersonaService {
    Persona crear(Persona persona);
    Persona getById(Long id);
}
