package com.thiago.ecommerce.enums;

public enum SituacaoPedido {

	ESPERANDO_PAGAMENTO("Esperando pagamento."),
	PAGAMENTO_RECEBIDO_EM_EMPACOTAMENTO("Pagamento recebido, empacotando."),
	ENVIADO_PARA_ENTREGA("Enviado para entrega."),
	EM_TRANSITO("Em transito."),
	RECEBIDO("Recebido.");
	
	private final String name;
	
	private SituacaoPedido(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
