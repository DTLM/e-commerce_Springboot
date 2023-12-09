package com.thiago.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiago.ecommerce.modal.Estoque;

@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, Long>{

}
