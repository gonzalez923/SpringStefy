/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Agcaninos.canino.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 *
 * @author ACER
 */
@Entity
@Data
public class Cliente {
    @Id
    @Column(name = "id usuario")
    private Long iduser;
   
   @Column(name = "id nombre", nullable = false, length = 10)
   private String nombre;
   
   @Column(nullable = false)
   private String apellido;
   
   @Column(unique = true, nullable = false)
   private String email;
    
}
