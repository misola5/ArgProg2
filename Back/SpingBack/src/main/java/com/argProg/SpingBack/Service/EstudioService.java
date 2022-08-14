/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argProg.SpingBack.Service;

import com.argProg.SpingBack.Model.estudio;
import com.argProg.SpingBack.Repository.EstudioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marcelo
 */
@Service
public class EstudioService implements IEstudioService {

    @Autowired
    public EstudioRepository estuRepo;
    
    @Override
    public void crearEstudio(estudio est) {
        this.estuRepo.save(est);
    }

    @Override
    public estudio verEstudio(Long idEstudio) {
        return this.estuRepo.findById(idEstudio).orElse(null);
    }

    @Override
    public List<estudio> verListaEstudio() {
        return this.estuRepo.findAll();
    }

    @Override
    public void updateEstudio(estudio est) {
        this.estuRepo.save(est);
    }

    @Override
    public void deleteEstudio(Long idEstudio) {
        this.estuRepo.deleteById(idEstudio);
    }
    
}
