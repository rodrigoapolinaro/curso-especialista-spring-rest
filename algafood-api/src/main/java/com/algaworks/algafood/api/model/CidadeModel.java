package com.algaworks.algafood.api.model;

import org.springframework.hateoas.RepresentationModel;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CidadeModel extends RepresentationModel<CidadeModel> {
	
	@ApiModelProperty(example = "1")
	private Long id;
	
	@ApiModelProperty(example = "Campinas")
	private String nome;
	
	@ApiModelProperty(example = "São Paulo")
	private EstadoModel estado;

}
