package com.thiago.ecommerce.service.imple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiago.ecommerce.repository.PedidoRepository;
import com.thiago.ecommerce.service.IPedidoService;


@Service
public class PedidoService implements IPedidoService{

	@Autowired
	private PedidoRepository dao;


	public PedidoService(PedidoRepository dao) {
		this.dao = dao;
	}
}
