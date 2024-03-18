package br.com.petz.clientepet2.cliente.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.petz.clientepet2.cliente.application.api.ClienteDetalhadoResponse;
import br.com.petz.clientepet2.cliente.application.api.ClienteListResponse;
import br.com.petz.clientepet2.cliente.application.api.ClienteRequeste;
import br.com.petz.clientepet2.cliente.application.api.ClienteResponse;
import br.com.petz.clientepet2.cliente.application.repository.ClienteRepository;
import br.com.petz.clientepet2.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {
	private final ClienteRepository clienteRepository;

	@Override
	public ClienteResponse criaCliente(ClienteRequeste clienteRequeste) {
		log.info("[inicia] ClienteApplicationService - criaCliente");
		Cliente cliente = clienteRepository.salva(new Cliente(clienteRequeste));
		log.info("[finaliza] ClienteApplicationService - criaCliente");
		return ClienteResponse.builder().idCliente(cliente.getIdCliente()).build();
	}

	@Override
	public List<ClienteListResponse> buscaTodosClientes() {
		log.info("[inicia] ClienteApplicationService - buscaTodosClientes");
		List<Cliente> clientes = clienteRepository.buscaTodosClientes();
		log.info("[finaliza] ClienteApplicationService - buscaTodosClientes");
		return ClienteListResponse.converte(clientes);
	}

	@Override
	public ClienteDetalhadoResponse buscaClienteAtravesDoId(UUID idCliente) {
		log.info("[inicia] ClienteApplicationService - buscaClienteAtravesDoId");
		Cliente cliente = clienteRepository.buscaClienteAtravesDoId(idCliente);
		log.info("[finaliza] ClienteApplicationService - buscaClienteAtravesDoId");
		return new ClienteDetalhadoResponse(cliente);
	}

}