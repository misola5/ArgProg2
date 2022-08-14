/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argProg.SpingBack.Service;

import com.argProg.SpingBack.Model.experiencia;
import com.argProg.SpingBack.Repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marcelo
 */
@Service
public class ExperienciaService implements IExperienciaService{

    @Autowired
    public ExperienciaRepository expeRepo;
    
    @Override
    public void crearExperiencia(experiencia exp) {
        this.expeRepo.save(exp);
    }

    @Override
    public experiencia verExperiencia(Long idExperiencia) {
        return this.expeRepo.findById(idExperiencia).orElse(null);
    }

    @Override
    public List<experiencia> verListaExperiencia() {
        return this.expeRepo.findAll();
    }

    @Override
    public void updateExperiencia(experiencia exp) {
        this.expeRepo.save(exp);
    }

    @Override
    public void deleteExperiencia(Long idExperiencia) {
        this.expeRepo.deleteById(idExperiencia);
    }
    
}
