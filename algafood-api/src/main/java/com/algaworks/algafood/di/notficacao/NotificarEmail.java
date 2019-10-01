package com.algaworks.algafood.di.notficacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

@Qualifier("normal")
@Component
public class NotificarEmail implements Notificador {
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
		System.out.printf("Notificando %s através do e-mail %s: %s\n",
				cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
