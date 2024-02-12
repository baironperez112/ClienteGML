package com.gml.cliente.exceptions;

import lombok.Getter;
import lombok.Setter;

/**
 * cepcion para peticiones con conflictos en sus resultados.
 * @author BayronPerez
 */
@Getter
@Setter
public class ConflictExceptions extends RuntimeException {

	private static final long serialVersionUID = -8556490604693291788L;

	/**
	 * Constructor de la clase
	 * 
	 * @param mensaje
	 */
	public ConflictExceptions(String mensaje) {
		super(mensaje);
	}
}

