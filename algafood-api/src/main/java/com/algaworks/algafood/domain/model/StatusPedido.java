package com.algaworks.algafood.domain.model;

public enum StatusPedido {
	
	CRIADO("Criado"),
	CONFIRMADO("Confirmação"),
	ENTREGUE("Entregue"),
	CANCELADO("Cancelado");
	
	private String descricao;
	
	StatusPedido(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
}
