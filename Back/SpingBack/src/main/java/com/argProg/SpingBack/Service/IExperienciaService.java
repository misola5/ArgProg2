/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.argProg.SpingBack.Service;

import com.argProg.SpingBack.Model.experiencia;
import java.util.List;

/**
 *
 * @author Marcelo
 */
public interface IExperienciaService {
    
    public void crearExperiencia(experiencia exp);
    public experiencia verExperiencia(Long idExperiencia);
    public List <experiencia> verListaExperiencia();
    public void updateExperiencia(experiencia exp);
    public void deleteExperiencia(Long idExperiencia);
}
