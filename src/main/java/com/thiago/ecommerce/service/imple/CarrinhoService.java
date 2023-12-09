package com.thiago.ecommerce.service.imple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiago.ecommerce.repository.CarrinhoReposity;
import com.thiago.ecommerce.service.ICarrinhoService;


@Service
public class CarrinhoService implements ICarrinhoService{

	@Autowired
	private CarrinhoReposity dao;


	public CarrinhoService(CarrinhoReposity dao) {
		this.dao = dao;
	}
}
