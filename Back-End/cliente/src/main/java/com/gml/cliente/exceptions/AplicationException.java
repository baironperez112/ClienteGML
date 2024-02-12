package com.gml.cliente.exceptions;

import org.springframework.http.HttpStatus;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import lombok.Getter;
import lombok.Setter;

/**
 * Clase donde se personaliza la exception del apicativo, Errores que no son de negocio
 * y que no deberia propagarse al cliente
 * @author BayronPerez
 */

@Getter
@Setter
public class AplicationException extends RuntimeException {

	private static final Logger logger = LogManager.getLogger(AplicationException.class);
	private static final long serialVersionUID = -4202662219335496160L;

	private final String code;

	private final HttpStatus status;
	
	private final String message;

	
	public AplicationException(String code, String message, HttpStatus status) {
		logger.error(message);
		this.code = code;
		this.message = message;
		this.status = status;
	}

	public AplicationException(String code, String message, HttpStatus status, String error) {
		logger.error("{} - {}", error, message);
		this.code = code;
		this.message = message;
		this.status = status;
	}

}