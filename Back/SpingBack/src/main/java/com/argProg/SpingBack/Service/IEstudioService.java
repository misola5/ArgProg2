/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.argProg.SpingBack.Service;

import com.argProg.SpingBack.Model.estudio;
import java.util.List;

/**
 *
 * @author Marcelo
 */
public interface IEstudioService {
    
    public void crearEstudio(estudio est);
    public estudio verEstudio(Long idEstudio);
    public List <estudio> verListaEstudio();
    public void updateEstudio(estudio est);
    public void deleteEstudio(Long idEstudio);
    
    
}
