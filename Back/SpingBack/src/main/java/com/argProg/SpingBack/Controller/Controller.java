/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argProg.SpingBack.Controller;

import com.argProg.SpingBack.Model.estudio;
import com.argProg.SpingBack.Model.experiencia;
import com.argProg.SpingBack.Model.persona;
import com.argProg.SpingBack.Service.IEstudioService;
import com.argProg.SpingBack.Service.IExperienciaService;
import com.argProg.SpingBack.Service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Marcelo
 */
@RestController
@CrossOrigin(origins ="http://localhost:4200")
public class Controller {
    
    @Autowired
    public IPersonaService persoServ;
    @Autowired
    public IEstudioService estuServ;
    @Autowired
    public IExperienciaService expeServ;
    
    //Persona
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/crearPersona")
    public void crearPersona(@RequestBody persona pers){
            persoServ.crearPersona(pers);
    }
    @GetMapping("/verPersona/{idPersona}")
    @ResponseBody
    public persona verPersona(@PathVariable Long idPersona){
        return persoServ.verPersona(idPersona);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/updatePersona")
    public void updatePersona(@RequestBody persona pers){
        persoServ.updatePersona(pers);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/deletePersona/{idPersona}")
    public void deletePersona(@PathVariable Long idPersona){
        persoServ.deletePersona(idPersona);
    }
    
    //Estudios
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/crearEstudio")
    public void crearEstudio(@RequestBody estudio est){
        estuServ.crearEstudio(est);
    }
    @GetMapping("/verEstudio/{idEstudio}")
    @ResponseBody
    public estudio verEstudio(@PathVariable Long idEstudio){
        return estuServ.verEstudio(idEstudio);
    }
    @GetMapping("/verListaEstudio")
    @ResponseBody
    public List <estudio> verListaEstudio(){
        return estuServ.verListaEstudio();
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/updateEstudio")
    public void updateEstudio(@RequestBody estudio est){
        estuServ.updateEstudio(est);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/deleteEstudio/{idEstudio}")
    public void deleteEstudio(@PathVariable Long idEstudio){
        estuServ.deleteEstudio(idEstudio);
    }
    
    //Experiencia
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/crearExperiencia")
    public void crearExperiencia(@RequestBody experiencia exp){
        expeServ.crearExperiencia(exp);
    }
    @GetMapping ("/verEperiencia/{idExperiencia}")
    @ResponseBody
    public experiencia verEperiencia(@PathVariable Long idExperiencia){
       return expeServ.verExperiencia(idExperiencia);
    }
    @GetMapping("/verListaExperiencia")
    @ResponseBody
    public List <experiencia> verListaExperiencia(){
        return expeServ.verListaExperiencia();
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/updateExperiencia")
    public void updateExperiencia(@RequestBody experiencia exp){
        expeServ.updateExperiencia(exp);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/deleteExperiencia/{idExperiencia}")
    public void deleteExperiencia(@PathVariable Long idExperiencia){
        expeServ.deleteExperiencia(idExperiencia);
    }
}
