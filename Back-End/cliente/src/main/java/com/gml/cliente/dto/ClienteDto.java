package com.gml.cliente.dto;

import java.time.LocalDate;
import java.util.function.Function;
import com.gml.cliente.model.ClienteEntity;

import lombok.Data;


@Data
public class ClienteDto {

	private String sharedKey;

	private String nombre;

	private Integer telefono;

	private String email;

	private LocalDate fechaInicio;

	private LocalDate fechaFin;

	
	/**
	 * Funcion que retorna la entidad recibiendo un DTO *
	 */
	public static final Function<ClienteDto, ClienteEntity> CONVERTER_ENTITY = (ClienteDto c) -> {
		ClienteEntity cliente = new ClienteEntity();
		cliente.setSharedKey(c.getSharedKey());	
		cliente.setNombre(c.getNombre());
		cliente.setEmail(c.getEmail());
		cliente.setTelefono(c.getTelefono());
		cliente.setFechaInicio(c.getFechaInicio());
		cliente.setFechaFin(c.getFechaFin());

		return cliente;
	};

	/**
	 * Funcion que retorna la entidad recibiendo un ENTITY *
	 */
	public static final Function<ClienteEntity, ClienteDto> CONVERTER_DTO = (ClienteEntity c) -> {
		ClienteDto cliente = new ClienteDto();
		cliente.setSharedKey(c.getSharedKey());	
		cliente.setNombre(c.getNombre());
		cliente.setEmail(c.getEmail());
		cliente.setTelefono(c.getTelefono());
		cliente.setFechaInicio(c.getFechaInicio());
		cliente.setFechaFin(c.getFechaFin());
		
		return cliente;
	};
}
