package com.algaworks.algafood.di.notficacao;

import org.springframework.context.annotation.Profile;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;


@Profile("prod")
@TipoDoNotificador(NivelUrgencia.SEM_URGENTE)
//@Qualifier("normal")
@Component
public class NotificarEmail implements Notificador {
	
	public NotificarEmail() {
		System.out.println("NotificadorEmail REAL");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
		System.out.printf("Notificando %s através do e-mail %s: %s\n",
				cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
