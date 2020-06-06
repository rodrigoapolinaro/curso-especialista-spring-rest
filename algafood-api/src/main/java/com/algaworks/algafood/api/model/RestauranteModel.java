package com.algaworks.algafood.api.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RestauranteModel {
	
	private String id; 
	private String nome;
	private BigDecimal taxaFrete;
	private CozinhaModel cozinha;

}
