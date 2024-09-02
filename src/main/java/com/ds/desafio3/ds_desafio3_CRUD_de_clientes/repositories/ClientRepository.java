package com.ds.desafio3.ds_desafio3_CRUD_de_clientes.repositories;

import com.ds.desafio3.ds_desafio3_CRUD_de_clientes.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
