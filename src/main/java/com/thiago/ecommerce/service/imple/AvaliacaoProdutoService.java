package com.thiago.ecommerce.service.imple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiago.ecommerce.repository.AvaliacaoProdutoRepository;
import com.thiago.ecommerce.service.IAvaliacaoProdutoService;


@Service
public class AvaliacaoProdutoService implements IAvaliacaoProdutoService{

	@Autowired
	private AvaliacaoProdutoRepository dao;


	public AvaliacaoProdutoService(AvaliacaoProdutoRepository dao) {
		this.dao = dao;
	}
}
