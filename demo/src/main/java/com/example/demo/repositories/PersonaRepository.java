package com.example.demo.repositories;

import com.example.demo.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//esta interfaz se comunica directamente con la BD

//recibe en los<entidad,tipo de dato id>
@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long> {

}
