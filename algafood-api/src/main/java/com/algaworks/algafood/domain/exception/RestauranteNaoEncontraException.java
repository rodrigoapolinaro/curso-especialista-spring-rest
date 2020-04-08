package com.algaworks.algafood.domain.exception;

public class RestauranteNaoEncontraException extends EntidadeNaoEncontraException {

	private static final long serialVersionUID = 1L;

	public RestauranteNaoEncontraException(String mensagem) {
		super(mensagem);
	}
	
	public RestauranteNaoEncontraException(Long restauranteId) {
		this(String.format("Não existe um cadastro de restaurante com código %d", restauranteId));
	}

}
