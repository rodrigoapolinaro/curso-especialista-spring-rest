package com.algaworks.algafood;

import org.springframework.context.annotation.Bean;

import com.algaworks.algafood.di.notficacao.NotificarEmail;
import com.algaworks.algafood.di.service.AtivacaoClienteService;


//@Configuration
public class AlgaConfig {
	
	@Bean
	public NotificarEmail notificadorEmail() {
		NotificarEmail notificador = new NotificarEmail("smtp.algamail.com.br");
		notificador.setCaixaAlta(true);
		
		return notificador;
	}
	
	@Bean
	public AtivacaoClienteService ativacaoClienteService() {
		return new AtivacaoClienteService(notificadorEmail());
	}

}
