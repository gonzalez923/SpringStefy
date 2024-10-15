/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Agcaninos.canino.repository;

import com.Agcaninos.canino.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ACER
 */
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
