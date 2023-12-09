package com.thiago.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiago.ecommerce.modal.ProdutoCarrinho;

@Repository
public interface ProdutoCarrinhoRepository extends JpaRepository<ProdutoCarrinho, Long>{

}
