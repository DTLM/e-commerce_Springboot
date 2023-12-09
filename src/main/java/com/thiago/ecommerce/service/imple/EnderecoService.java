package com.thiago.ecommerce.service.imple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiago.ecommerce.repository.AvaliacaoProdutoRepository;
import com.thiago.ecommerce.repository.EnderecoRepository;
import com.thiago.ecommerce.service.IAvaliacaoProdutoService;
import com.thiago.ecommerce.service.IEnderecoService;


@Service
public class EnderecoService implements IEnderecoService{

	@Autowired
	private EnderecoRepository dao;


	public EnderecoService(EnderecoRepository dao) {
		this.dao = dao;
	}
}
