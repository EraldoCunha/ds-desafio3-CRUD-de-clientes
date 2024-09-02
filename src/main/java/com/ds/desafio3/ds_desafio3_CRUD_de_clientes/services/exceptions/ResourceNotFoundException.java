package com.ds.desafio3.ds_desafio3_CRUD_de_clientes.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String msg){
        super(msg);
    }
}
