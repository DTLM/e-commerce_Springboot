package com.thiago.ecommerce.service.imple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiago.ecommerce.repository.ProdutoCarrinhoRepository;
import com.thiago.ecommerce.service.IProdutoCarrinhoService;


@Service
public class ProdutoCarrinhoService implements IProdutoCarrinhoService{

	@Autowired
	private ProdutoCarrinhoRepository dao;


	public ProdutoCarrinhoService(ProdutoCarrinhoRepository dao) {
		this.dao = dao;
	}
}
