package com.gml.cliente.dto;

import java.io.Serializable;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class ResponseADE implements Serializable{

	private static final long serialVersionUID = 1L;

	private String code;
	
	private String description;

	private String source;
	
}
