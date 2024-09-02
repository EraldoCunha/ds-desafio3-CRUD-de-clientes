package com.ds.desafio3.ds_desafio3_CRUD_de_clientes.services;

import com.ds.desafio3.ds_desafio3_CRUD_de_clientes.dto.ClientDTO;
import com.ds.desafio3.ds_desafio3_CRUD_de_clientes.entities.Client;
import com.ds.desafio3.ds_desafio3_CRUD_de_clientes.repositories.ClientRepository;
import com.ds.desafio3.ds_desafio3_CRUD_de_clientes.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Client client = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Recurso não encontrado"));
        return new ClientDTO(client);
    }
}
