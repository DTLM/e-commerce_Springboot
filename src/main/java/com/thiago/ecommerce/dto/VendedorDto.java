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
public class VendedorDto {

	private Long id;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String nome;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Long cnpj;
}
