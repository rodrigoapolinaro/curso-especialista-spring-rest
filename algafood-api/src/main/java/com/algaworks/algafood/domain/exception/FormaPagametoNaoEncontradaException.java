package com.algaworks.algafood.domain.exception;

public class FormaPagametoNaoEncontradaException extends EntidadeNaoEncontraException {

	private static final long serialVersionUID = 1L;

	public FormaPagametoNaoEncontradaException(String mensagem) {
		super(mensagem);
	}

	public FormaPagametoNaoEncontradaException(Long formaPagamentoId) {
		this(String.format("Não existe um cadastro de forma de pagamento com código %d", formaPagamentoId));
	}


}
