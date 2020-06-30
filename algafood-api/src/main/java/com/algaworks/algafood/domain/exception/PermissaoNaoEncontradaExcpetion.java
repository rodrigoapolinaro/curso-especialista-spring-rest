package com.algaworks.algafood.domain.exception;

public class PermissaoNaoEncontradaExcpetion extends EntidadeNaoEncontraException {

	private static final long serialVersionUID = 1L;
	
	public PermissaoNaoEncontradaExcpetion(String mensagem) {
		super(mensagem);
	}
	
	public PermissaoNaoEncontradaExcpetion(Long permissaoId) {
		this(String.format("Não existe um cadastro de permissão com código %d", permissaoId));
	}

}
