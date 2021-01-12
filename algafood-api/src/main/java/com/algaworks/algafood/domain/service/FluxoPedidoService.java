package com.algaworks.algafood.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.algaworks.algafood.domain.model.Pedido;
import com.algaworks.algafood.domain.repository.PedidoRepository;

@Service
public class FluxoPedidoService {
	
	@Autowired
	private EmissaoPedidoService emissaoPedido;
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Transactional
	public void confirmar(String pedidoCodigo) {
		Pedido pedido = emissaoPedido.buscarOuFalhar(pedidoCodigo);
		pedido.confirmar();
		
		pedidoRepository.save(pedido);
	}
	
	@Transactional
	public void entregar(String pedidoCodigo) {
		Pedido pedido = emissaoPedido.buscarOuFalhar(pedidoCodigo);
		pedido.entregar();
	}
	
	@Transactional
	public void cancelar(String pedidoCodigo) {
		Pedido pedido = emissaoPedido.buscarOuFalhar(pedidoCodigo);
		pedido.cancelar();
		
		pedidoRepository.save(pedido);
	}

}
