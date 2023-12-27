package com.pruebadto.kt.service;

import com.pruebadto.kt.model.entity.Cliente;

public interface ICliente {

    Cliente save(Cliente cliente);

    Cliente findById(Integer id);

    void delete(Cliente cliente);

}
