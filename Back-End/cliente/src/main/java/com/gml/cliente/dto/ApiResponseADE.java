package com.gml.cliente.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Representation del objeto api response ApiResponseADE.
 * @author Bayron Perez
 * @param <T>
 * @param <T>
 */

@Getter
@AllArgsConstructor
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ApiResponseADE<T> {

	private T data;

	private ResponseADE response;
	
}
