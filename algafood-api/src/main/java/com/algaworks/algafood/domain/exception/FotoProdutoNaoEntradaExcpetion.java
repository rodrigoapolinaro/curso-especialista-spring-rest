package com.algaworks.algafood.domain.exception;

public class FotoProdutoNaoEntradaExcpetion extends EntidadeNaoEncontraException {

	private static final long serialVersionUID = 1L;

	public FotoProdutoNaoEntradaExcpetion(String mensagem) {
		super(mensagem);
	}
	
	public FotoProdutoNaoEntradaExcpetion(Long restauranteId, Long protudoId) {
		this(String.format("Não existe um cadastro de foto do produto com código %d para o restaurante de código %d",
				protudoId, restauranteId));
	}

}
