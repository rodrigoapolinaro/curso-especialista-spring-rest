package com.algaworks.algafood.api.model;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FormaPagamentoInput {
	
	@NotBlank
	private String descricao;

}
