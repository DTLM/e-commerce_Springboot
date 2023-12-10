package com.thiago.ecommerce.service;

import java.util.List;

import com.thiago.ecommerce.dto.VendedorDto;
import com.thiago.ecommerce.modal.Vendedor;

public interface IVendedorService {
	
	void cadastrar(VendedorDto vendedor) throws Exception;
	
	void editar(VendedorDto vendedor) throws Exception;
	
	Vendedor getById(Long id);
	
	List<Vendedor> listAll();
}
