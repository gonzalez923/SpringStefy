/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Agcaninos.canino.services;

import com.Agcaninos.canino.model.Cliente;

/**
 *
 * @author ACER
 */
public interface ClienteService {
    Cliente newCliente (Cliente newCliente);
    Iterable<Cliente> getAll();
    Cliente modiCliente (Cliente cliente);
    Boolean deleteCliente (Long iduser);
    
}
