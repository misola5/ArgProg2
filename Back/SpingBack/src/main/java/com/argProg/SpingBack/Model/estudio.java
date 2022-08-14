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
@Table (name="estudio")
public class estudio {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idEstudio;
    @Basic
    private String titulo;
    private String intitucion;
    private String anioingreso;
    private String anioegreso;
    private String urlimgestudio;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn (name="idPersona")
    private persona persona;

    public estudio() {
    }

    public estudio(Long idEstudio, String titulo, String intitucion, String anioingreso, String anioegreso, String urlimgestudio, persona persona) {
        this.idEstudio = idEstudio;
        this.titulo = titulo;
        this.intitucion = intitucion;
        this.anioingreso = anioingreso;
        this.anioegreso = anioegreso;
        this.urlimgestudio = urlimgestudio;
        this.persona = persona;
    }

        
}
