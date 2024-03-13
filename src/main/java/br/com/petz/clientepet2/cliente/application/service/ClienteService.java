package br.com.petz.clientepet2.cliente.application.service;

import java.util.List;

import br.com.petz.clientepet2.cliente.application.api.ClienteListResponse;
import br.com.petz.clientepet2.cliente.application.api.ClienteRequeste;
import br.com.petz.clientepet2.cliente.application.api.ClienteResponse;

public interface ClienteService {

	ClienteResponse criaCliente(ClienteRequeste clienteRequeste);
	List<ClienteListResponse> buscaTodosClientes();

}
