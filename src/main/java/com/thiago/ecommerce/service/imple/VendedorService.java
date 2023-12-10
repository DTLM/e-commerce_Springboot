package com.thiago.ecommerce.service.imple;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiago.ecommerce.dto.VendedorDto;
import com.thiago.ecommerce.modal.Vendedor;
import com.thiago.ecommerce.repository.VendedorRepository;
import com.thiago.ecommerce.service.IVendedorService;


@Service
public class VendedorService implements IVendedorService{

	@Autowired
	private VendedorRepository dao;


	public VendedorService(VendedorRepository dao) {
		this.dao = dao;
	}


	@Override
	public void cadastrar(VendedorDto vendedor) throws Exception {
		Vendedor entity = dao.findByNome(vendedor.getNome().toUpperCase());
		if(entity != null) {
			throw new Exception("Vendedor ja cadastrado.");
		}
		entity = Vendedor.builder().nome(vendedor.getNome()).cnpj(vendedor.getCnpj()).build();
		dao.save(entity);
	}


	@Override
	public void editar(VendedorDto vendedor) throws Exception {
		if(vendedor.getId() == null) {
			throw new Exception("Id não enviado no corpo da requisição.");
		}
		Optional<Vendedor> entity = dao.findById(vendedor.getId());
		if(!entity.isPresent()) {
			throw new Exception("Vendedor não encontrado.");
		}
		entity = Optional.of(Vendedor.builder().nome(vendedor.getNome()).cnpj(vendedor.getCnpj()).build());
		dao.save(entity.get());
	}


	@Override
	public Vendedor getById(Long id) {
		return dao.findById(id).isPresent()? dao.findById(id).get() : null;
	}


	@Override
	public List<Vendedor> listAll() {
		return dao.findAll();
	}
}
