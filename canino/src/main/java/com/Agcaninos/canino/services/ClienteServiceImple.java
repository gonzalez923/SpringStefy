/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Agcaninos.canino.services;

import com.Agcaninos.canino.model.Cliente;
import com.Agcaninos.canino.repository.ClienteRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ACER
 */
@Service
public class ClienteServiceImple implements ClienteService{
    
    @Autowired
    private ClienteRepository clienteRepository;
    
    @Override
    public Iterable<Cliente> getAll(){
    return this.clienteRepository.findAll();
    }
    
    @Override
    public Cliente modiCliente(Cliente cliente) {
        Optional<Cliente> clienteEncontrado= this.clienteRepository.findById(cliente.getIduser());
        if(clienteEncontrado.get()!=null){
            clienteEncontrado.get().setNombre(cliente.getNombre());
            clienteEncontrado.get().setApellido(cliente.getApellido());
            clienteEncontrado.get().setEmail(cliente.getEmail());
            return this.newCliente(clienteEncontrado.get());
        
            

    }
        return null;
    }
    @Override
    public Boolean deleteCliente(Long iduser) {
        this.clienteRepository.deleteById(iduser);
        return true;
    }

    @Override
    public Cliente newCliente(Cliente newCliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
