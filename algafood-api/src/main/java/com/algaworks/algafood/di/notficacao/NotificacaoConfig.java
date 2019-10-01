package com.algaworks.algafood.di.notficacao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificacaoConfig {
	
	@Bean
	public NotificarEmail notificadorEmail() {
		NotificarEmail notificador = new NotificarEmail("smtp.algamail.com.br");
		notificador.setCaixaAlta(true);
		
		return notificador;
	}

}
