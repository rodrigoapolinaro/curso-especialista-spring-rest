package com.algaworks.algafood.api.openapi.model;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Api("Links")
public class LinksModelOpenApi {
	
	private LinkModel rel;
	
	@Setter
	@Getter
	@ApiModel("Link")
	private class LinkModel {
		
		private String href;
		private boolean templated;
		
	}

}
