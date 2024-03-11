package br.com.petz.clientepet2.cliente.application.service;

import br.com.petz.clientepet2.cliente.application.api.ClienteRequeste;
import br.com.petz.clientepet2.cliente.application.api.ClienteRespose;

public interface ClienteService {

	ClienteRespose criaCliente(ClienteRequeste clienteRequeste);

}
