package com.thiago.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiago.ecommerce.modal.Vendedor;

@Repository
public interface VendedorRepository extends JpaRepository<Vendedor, Long>{

	Vendedor findByNome(String nome);
}
