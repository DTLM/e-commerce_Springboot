package com.thiago.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiago.ecommerce.modal.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
