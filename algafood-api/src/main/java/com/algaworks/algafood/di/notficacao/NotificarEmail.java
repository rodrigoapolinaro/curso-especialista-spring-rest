package com.algaworks.algafood.di.notficacao;

import com.algaworks.algafood.di.modelo.Cliente;

public class NotificarEmail implements Notificador {
	
	private boolean caixaAlta;
	private String hostServidorSmtp;
	
	
	public NotificarEmail(String hostServidorSmtp) {
		this.hostServidorSmtp = hostServidorSmtp;
		System.out.println("NotificadorEmail");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		if (this.caixaAlta) {
			mensagem = mensagem.toUpperCase();
		}
		
		System.out.printf("Notificando %s através do e-mail %s usando SMTP %s: %s\n",
				cliente.getNome(), cliente.getEmail(), this.hostServidorSmtp, mensagem);
	}
	
	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}

}
