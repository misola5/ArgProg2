/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argProg.SpingBack.Model;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

// https://www.youtube.com/watch?v=DrUSKWCYMNs
/**
 *
 * @author Marcelo
 */

@Getter @Setter
@Entity
@Table (name= "persona")
public class persona {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idPersona;
    
    @Basic
    private String nombre;
    private String apellido;
    private Date nacimiento;
    private String nacionalidad;
    private String email;
    private String residencia;
    private String telefono;
    private String instagram;
    private String linkedin;    
    private String facebook;
    private String about;
    private String urlimgfondo;
    private String urlimgpersonal;

    public persona() {
    }

    public persona(Long idPersona, String nombre, String apellido, Date nacimiento, String nacionalidad, String email, String residencia, String telefono, String instagram, String linkedin, String facebook, String about, String urlimgfondo, String urlimgpersonal) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.nacionalidad = nacionalidad;
        this.email = email;
        this.residencia = residencia;
        this.telefono = telefono;
        this.instagram = instagram;
        this.linkedin = linkedin;
        this.facebook = facebook;
        this.about = about;
        this.urlimgfondo = urlimgfondo;
        this.urlimgpersonal = urlimgpersonal;
    }
    
    
    
}
