package com.thiago.ecommerce.modal;

import java.io.Serializable;
import java.util.Set;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DynamicInsert
@DynamicUpdate
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Carrinho implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToMany
	@JoinTable(name = "carrinho_produtocarrinho", joinColumns = {
			@JoinColumn(name = "carrinho_id", nullable = false, referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "produtocarrinho_id", nullable = false, referencedColumnName = "id") })
	private Set<ProdutoCarrinho> produtos;
	
	@ManyToOne(optional = false)
	private Cliente cliente;
}
