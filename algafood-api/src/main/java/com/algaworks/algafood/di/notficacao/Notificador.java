package com.algaworks.algafood.di.notficacao;

import com.algaworks.algafood.di.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}