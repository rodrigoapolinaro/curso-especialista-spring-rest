package com.algaworks.algafood.domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public abstract class EntidadeNaoEncontraException extends NegocioException {

	private static final long serialVersionUID = 1L;

	public EntidadeNaoEncontraException(String mensagem) {
		super(mensagem);
	}

}
