/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argProg.SpingBack.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Marcelo
 */
@Getter @Setter
@Entity
@Table (name="experiencia")
public class experiencia {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idExperiencia;
    @Basic
    private String puesto;
    private String institucion;
    private String anioingreso;
    private String anioegreso;
    private String funciones;
    private Boolean actualidad;
    private String urlimgexperiencia;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn (name="idPersona")
    private persona persona;

    public experiencia() {
    }

    public experiencia(Long idExperiencia, String puesto, String institucion, String anioingreso, String anioegreso, String funciones, Boolean actualidad, String urlimgexperiencia) {
        this.idExperiencia = idExperiencia;
        this.puesto = puesto;
        this.institucion = institucion;
        this.anioingreso = anioingreso;
        this.anioegreso = anioegreso;
        this.funciones = funciones;
        this.actualidad = actualidad;
        this.urlimgexperiencia = urlimgexperiencia;      
        
    }
}
