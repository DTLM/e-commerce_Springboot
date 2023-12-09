package com.thiago.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiago.ecommerce.modal.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long>{

}
