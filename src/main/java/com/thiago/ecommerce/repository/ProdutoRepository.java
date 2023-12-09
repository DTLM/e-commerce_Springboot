package com.thiago.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiago.ecommerce.modal.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
