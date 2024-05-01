package com.example.demo.services;

import com.example.demo.entities.Persona;
import com.example.demo.repositories.PersonaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService implements BaseService<Persona>{
    @Autowired
    private PersonaRepository personaRepository;

    //este constructor es lo mismo que la notacion autowired
    /*public PersonaService(PersonaRepository personaRepository){
        this.personaRepository = personaRepository;
    }*/

    //@transactional es para hacer transacciones con la BD
    @Override
    @Transactional
    public List<Persona> findAll() throws Exception {
        try {
            List <Persona> entities = personaRepository.findAll();
            return entities;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Persona findBiId(Long id) throws Exception {
        try {
            Optional<Persona> entitieOptional = personaRepository.findById(id);
            return entitieOptional.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Persona save(Persona entity) throws Exception {
        try {
            entity = personaRepository.save(entity);
            return entity;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Persona update(Long id, Persona entity) throws Exception {
        try {
            Optional<Persona> entitieOptional = personaRepository.findById(id);
            Persona persona = entitieOptional.get();
            persona = personaRepository.save(persona);
            return persona;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        try {
            if(personaRepository.existsById(id)) {
                personaRepository.deleteById(id);
                return true;
            }else{
                throw new Exception();
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
