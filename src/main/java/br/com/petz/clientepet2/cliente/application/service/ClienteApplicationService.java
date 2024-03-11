package br.com.petz.clientepet2.cliente.application.service;

import org.springframework.stereotype.Service;

import br.com.petz.clientepet2.cliente.application.api.ClienteRequeste;

import br.com.petz.clientepet2.cliente.application.api.ClienteRespose;
import lombok.extern.log4j.Log4j2;
@Service
@Log4j2
public class ClienteApplicationService implements ClienteService {

	@Override
	public ClienteRespose criaCliente(ClienteRequeste clienteRequeste) {
		log.info("[inicia] ClienteApplicationService - criaCliente");
		log.info("[finaliza] ClienteApplicationService - criaCliente");
		return null;
	}

}
