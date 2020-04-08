package com.algaworks.algafood.domain.exception;

public class CozinhaNaoEncontraException extends EntidadeNaoEncontraException {

	private static final long serialVersionUID = 1L;

	public CozinhaNaoEncontraException(String mensagem) {
		super(mensagem);
	}
	
	public CozinhaNaoEncontraException(Long cozinhaId) {
		this(String.format("Não existe um cadastro de cozinha com código %d", cozinhaId));
	}

}
