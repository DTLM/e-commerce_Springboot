package com.thiago.ecommerce.service.imple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiago.ecommerce.repository.ClienteRepository;
import com.thiago.ecommerce.service.IClienteService;


@Service
public class ClienteService implements IClienteService{

	@Autowired
	private ClienteRepository dao;


	public ClienteService(ClienteRepository dao) {
		this.dao = dao;
	}
}
