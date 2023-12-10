package com.thiago.ecommerce.service.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiago.ecommerce.modal.Produto;
import com.thiago.ecommerce.repository.ProdutoRepository;
import com.thiago.ecommerce.service.IProdutoService;


@Service
public class ProdutoService implements IProdutoService{

	@Autowired
	private ProdutoRepository dao;


	public ProdutoService(ProdutoRepository dao) {
		this.dao = dao;
	}


	@Override
	public List<Produto> getByVendedor(Long vendedorId) {
		// TODO Auto-generated method stub
		return null;
	}
}
