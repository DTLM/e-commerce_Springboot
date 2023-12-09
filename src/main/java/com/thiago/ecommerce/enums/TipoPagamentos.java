package com.thiago.ecommerce.enums;

public enum TipoPagamentos {

	CARTAO_CREDITO("Cartão de credito"),
	CARTAO_DEBITO("Cartão de debito"),
	BOLETO("Boleto"),
	PIX("Pix");
	
	private final String name;
	
	private TipoPagamentos(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
