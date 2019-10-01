package com.algaworks.algafood.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.notficacao.NivelUrgencia;
import com.algaworks.algafood.di.notficacao.Notificador;
import com.algaworks.algafood.di.notficacao.TipoDoNotificador;
import com.algaworks.algafood.di.service.ClienteAtivadoEvent;

@Component
public class NotificacaoService {
	
	@TipoDoNotificador(NivelUrgencia.SEM_URGENTE)
	@Autowired
	private Notificador notificador;
	
	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		notificador.notificar(event.getCliente(), "Seu cadastro no sistema está ativo!");
	}

}
