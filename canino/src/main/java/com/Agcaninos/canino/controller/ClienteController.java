/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Agcaninos.canino.controller;

import com.Agcaninos.canino.model.Cliente;
import com.Agcaninos.canino.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ACER
 */
@RestController
@RequestMapping("/Cliente")
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;
    
    @PostMapping("/nuevo")
        public Cliente newCliente(@RequestBody Cliente newCliente){
        return this.clienteService.newCliente(newCliente);
    }
        
    @GetMapping("/mostrar")
    public Iterable<Cliente> getAll(){
        return clienteService.getAll();
        
    }
    
    @PostMapping("/modificar")
    public Cliente updateCliente(@RequestBody Cliente cliente){
        return this.clienteService.modiCliente(cliente);
    }
    
    @PostMapping(value="/(id)")
    public Boolean deleteCliente (@PathVariable(value="id")Long id){
        return this.clienteService.deleteCliente(id);
    }
    
}
