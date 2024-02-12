package com.gml.cliente.service;

import java.util.List;

import com.gml.cliente.model.ClienteEntity;

public interface ClienteService {

	public List<ClienteEntity> finAllCliente();
	
	public ClienteEntity findBySharedKey(String sharedKey);
	
	public ClienteEntity saveCliente(ClienteEntity clienteEntity);
	
	public ClienteEntity updateCliente(ClienteEntity clienteEntity);
	
	public void deleteCliente(String clienteEntity);

}
