package com.thiago.ecommerce.service.imple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiago.ecommerce.repository.EstoqueRepository;
import com.thiago.ecommerce.service.IEstoqueService;


@Service
public class EstoqueService implements IEstoqueService{

	@Autowired
	private EstoqueRepository dao;


	public EstoqueService(EstoqueRepository dao) {
		this.dao = dao;
	}
}
