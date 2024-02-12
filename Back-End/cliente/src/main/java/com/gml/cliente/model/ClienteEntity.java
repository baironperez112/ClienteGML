package com.gml.cliente.model;

import java.time.LocalDate;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "CLIENTE")
@Data
public class ClienteEntity {

	@Id
	@Column(name="sharedKey", nullable = false)
	private String sharedKey;
	
	@Column(name="nombre", nullable = false)
	private String nombre;
	
	@Column(name="telefono", nullable = false)
	private Integer telefono;
	
	@Column(name="email", nullable = false)
	private String email;
	
	@Column(name="fechaInicio", nullable = false)
	private LocalDate fechaInicio;
	
	@Column(name="fechaFin", nullable = false)
	private LocalDate fechaFin;
	
}