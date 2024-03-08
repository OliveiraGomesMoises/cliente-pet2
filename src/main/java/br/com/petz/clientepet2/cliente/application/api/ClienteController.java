package br.com.petz.clientepet2.cliente.application.api;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class ClienteController implements ClienteAPI {

	@Override
	public ClienteRespose postCliente(ClienteRequeste clienteRequeste) {
		log.info("[inicia]ClienteController - postCliente");
		log.info("[finaliza]ClienteController - postCliente");
		return null;
	}

}
