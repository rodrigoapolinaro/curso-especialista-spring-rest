package com.algaworks.algafood.domain.exception;

public class EntidadeNaoEncontraException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public EntidadeNaoEncontraException(String mensagem) {
		super(mensagem);
	}

}
