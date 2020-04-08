package com.algaworks.algafood.domain.exception;

public class CidadeNaoEncontraException extends EntidadeNaoEncontraException {

	private static final long serialVersionUID = 1L;

	public CidadeNaoEncontraException(String mensagem) {
		super(mensagem);
	}
	
	public CidadeNaoEncontraException(Long cidadeId) {
		this(String.format("Não existe um cadastro de cidade com código %d", cidadeId));
	}

}
