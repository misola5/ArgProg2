/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argProg.SpingBack.Service;

import com.argProg.SpingBack.Model.persona;
import com.argProg.SpingBack.Repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marcelo
 */
@Service
public class PersonaService implements IPersonaService {

    @Autowired
    public PersonaRepository persoRepo;
    
    @Override
    public void crearPersona(persona pers) {
        this.persoRepo.save(pers);
    }

    @Override
    public persona verPersona(Long idPersona) {
       return this.persoRepo.findById(idPersona).orElse(null);
    }

    @Override
    public void updatePersona(persona pers) {
        this.persoRepo.save(pers);
    }

    @Override
    public void deletePersona(Long idPersona) {
        this.persoRepo.deleteById(idPersona);
    }
    
}
