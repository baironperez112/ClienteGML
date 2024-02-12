package com.gml.cliente.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gml.cliente.dto.ApiResponseCode;
import com.gml.cliente.exceptions.AplicationException;
import com.gml.cliente.exceptions.ConflictExceptions;
import com.gml.cliente.exceptions.NotFoundException;
import com.gml.cliente.model.ClienteEntity;
import com.gml.cliente.repository.ClienteRepository;
import com.gml.cliente.service.ClienteService;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;


	@Override
	public List<ClienteEntity> finAllCliente() {
		return clienteRepository.findAll();
	}

	@Override
	public ClienteEntity findBySharedKey(String sharedKey) {
		log.info("start service of find by sharedKey");
		if(sharedKey == null) {
			log.error("Error service param null");
			throw new AplicationException(ApiResponseCode.ERROR_PARAMETRO_NOT_FOUND.getCode(),
					ApiResponseCode.ERROR_PARAMETRO_NOT_FOUND.getDescription(),
					ApiResponseCode.ERROR_PARAMETRO_NOT_FOUND.getHttpStatus());
		} 
		else {
			try {
				return clienteRepository.findById(sharedKey)
				.orElseThrow(() -> new NotFoundException("Cliente", sharedKey));
			} 
			catch (Exception e) {
				throw new AplicationException(ApiResponseCode.GENERIC_ERROR.getCode(),
						ApiResponseCode.GENERIC_ERROR.getDescription(),
						ApiResponseCode.GENERIC_ERROR.getHttpStatus());
			}
		}
	}

	@Override
	public ClienteEntity saveCliente(ClienteEntity clienteEntity) {
		log.info("start service of saveCliente");
		if(clienteEntity.getSharedKey() != null && clienteRepository.existsById(clienteEntity.getSharedKey())) {
			log.error("Row exist");
			throw new ConflictExceptions(ApiResponseCode.ERROR_REGISTRO_EXISTENTE.getDescription());
		} else {
			return clienteRepository.save(clienteEntity);
		}
	}
	
	@Override
	public ClienteEntity updateCliente(ClienteEntity clienteEntity) {
		log.info("start service of updateCliente");
		if(clienteEntity.getSharedKey() == null && !clienteRepository.existsById(clienteEntity.getSharedKey())) {
			log.error("Row not found");
			throw new ConflictExceptions(ApiResponseCode.GENERIC_REGISTRO_NOT_FOUND.getDescription());
		} else {
			return clienteRepository.save(clienteEntity);
		}
	}

	@Override
	public void deleteCliente(String sharedKey) {
		log.info("start service of deleteCliente");
		if(sharedKey != null && !clienteRepository.existsById(sharedKey)) {
			throw new ConflictExceptions(ApiResponseCode.GENERIC_REGISTRO_NOT_FOUND.getDescription());
		} else {
			clienteRepository.deleteById(sharedKey);
		}
	}

}
