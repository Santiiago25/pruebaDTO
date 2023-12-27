package com.pruebadto.kt.model.dao;

import com.pruebadto.kt.model.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<Cliente, Integer> {
}
