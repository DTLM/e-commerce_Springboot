package com.thiago.ecommerce.service.imple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiago.ecommerce.repository.FormaPagamentoRepository;
import com.thiago.ecommerce.service.IFormaPagamentoService;


@Service
public class FormaPagamentoService implements IFormaPagamentoService{

	@Autowired
	private FormaPagamentoRepository dao;


	public FormaPagamentoService(FormaPagamentoRepository dao) {
		this.dao = dao;
	}
}
