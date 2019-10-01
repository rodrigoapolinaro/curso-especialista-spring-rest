package com.algaworks.algafood.di.notficacao;

import org.springframework.context.annotation.Profile;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

@Profile("dev")
@TipoDoNotificador(NivelUrgencia.SEM_URGENTE)
//@Qualifier("normal")
@Component
public class NotificarEmailMock implements Notificador {
	
	public NotificarEmailMock() {
		System.out.println("NotificadorEmail MOCK");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
		System.out.printf("MOCK: Notificando seria enviada para %s através do e-mail %s: %s\n",
				cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
