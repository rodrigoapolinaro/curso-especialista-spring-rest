package com.algaworks.algafood.domain.exception;

public class EstadoNaoEncontraException extends EntidadeNaoEncontraException {

	private static final long serialVersionUID = 1L;

	public EstadoNaoEncontraException(String mensagem) {
		super(mensagem);
	}
	
	public EstadoNaoEncontraException(Long estadoId) {
		this(String.format("Não existe um cadastro de estado com código %d", estadoId));
	}

}
