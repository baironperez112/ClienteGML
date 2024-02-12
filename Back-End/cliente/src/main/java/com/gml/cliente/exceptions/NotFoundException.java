package com.gml.cliente.exceptions;

/**
 * Excepcion para peticiones con datos no encontrados.
 * @author BayronPerez
 */

public class NotFoundException extends RuntimeException {

	private static final long serialVersionUID = -7500322046753778196L;

	
	public NotFoundException(String mensaje) {
		super(mensaje);
	}

	public NotFoundException(String recurso, String id) {
		super(String.format("No se encontró registro(s) de %s con el ID %s", recurso, id));
	}
	
}

