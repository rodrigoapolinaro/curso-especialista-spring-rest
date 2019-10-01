package com.algaworks.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notficacao.NivelUrgencia;
import com.algaworks.algafood.di.notficacao.Notificador;
import com.algaworks.algafood.di.notficacao.TipoDoNotificador;

@Component
public class AtivacaoClienteService {
	
	@TipoDoNotificador(NivelUrgencia.SEM_URGENTE)
	//@Qualifier("urgente")
	@Autowired
	private Notificador notificador;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
	
}
