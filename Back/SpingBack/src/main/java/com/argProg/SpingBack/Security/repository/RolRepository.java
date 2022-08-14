/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.argProg.SpingBack.Security.repository;

import com.argProg.SpingBack.Security.entity.Rol;
import com.argProg.SpingBack.Security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Marcelo
 */
public interface RolRepository extends JpaRepository <Rol,Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);    
}
