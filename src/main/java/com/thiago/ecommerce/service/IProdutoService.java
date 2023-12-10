package com.thiago.ecommerce.service;

import java.util.List;

import com.thiago.ecommerce.modal.Produto;

public interface IProdutoService {

	List<Produto> getByVendedor(Long vendedorId);
}
