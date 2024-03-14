package br.com.petz.clientepet2.cliente.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.petz.clientepet2.cliente.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ClienteController implements ClienteAPI {
	private final ClienteService clienteService;

	@Override
	public ClienteResponse postCliente(ClienteRequeste clienteRequeste) {
		log.info("[inicia]ClienteController - postCliente");
		ClienteResponse clienteCriado = clienteService.criaCliente(clienteRequeste);
		log.info("[finaliza]ClienteController - postCliente");
		return clienteCriado;
	}

	@Override
	public List<ClienteListResponse> getTodosClientes() {
		log.info("[inicia]ClienteController - getTodosClientes");
		List<ClienteListResponse> clientes = clienteService.buscaTodosClientes();
		log.info("[finaliza]ClienteController - getTodosClientes");
		return clientes;
	}

	@Override
	public ClienteDetalhadoResponse getClienteAtravesDoId(UUID idCliente) {
		log.info("[inicia]ClienteController -  getClienteAtravesDoId");
		log.info("[idCliente]{}",idCliente);
		ClienteDetalhadoResponse clienteDetalhado = clienteService.buscaClienteAtravesDoId(idCliente);
		log.info("[finaliza]ClienteController -  getClienteAtravesDoId");
		return clienteDetalhado;
	}

}
