package com.thiago.ecommerce.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoProdutoDto{

	private Long id;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Long produtoId;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Double nota;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Long clienteId;
	
}
