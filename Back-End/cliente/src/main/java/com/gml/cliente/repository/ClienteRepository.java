package com.gml.cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gml.cliente.model.ClienteEntity;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, String> {

}
