/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.argProg.SpingBack.Service;

import com.argProg.SpingBack.Model.persona;

/**
 *
 * @author Marcelo
 */
public interface IPersonaService {
    
    public void crearPersona(persona pers);
    public persona verPersona(Long idPersona);
    public void updatePersona(persona pers);
    public void deletePersona(Long idPersona);
    
}
