package com.thiago.ecommerce.modal;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.thiago.ecommerce.enums.SituacaoPedido;

import jakarta.persistence.Column;
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
public class Pedido implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(optional = false)
	private Cliente cliente;
	@ManyToOne(optional = false)
	private Endereco endereco;
	@ManyToOne(optional = false)
	private Carrinho carrinho;
	@ManyToOne(optional = false)
	private FormaPagamento formaPagamento;
	@Column
	private Double frete;
	@Column
	private LocalDate dataPagamento;
	@Column
	private SituacaoPedido situacao;
}
