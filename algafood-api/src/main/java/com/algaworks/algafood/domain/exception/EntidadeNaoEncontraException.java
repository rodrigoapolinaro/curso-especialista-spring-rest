package com.algaworks.algafood.domain.exception;

public abstract class EntidadeNaoEncontraException extends NegocioException {

	private static final long serialVersionUID = 1L;

	public EntidadeNaoEncontraException(String mensagem) {
		super(mensagem);
	}

}
