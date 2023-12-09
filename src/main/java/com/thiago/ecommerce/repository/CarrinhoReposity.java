package com.thiago.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiago.ecommerce.modal.Carrinho;

@Repository
public interface CarrinhoReposity extends JpaRepository<Carrinho, Long>{

}
