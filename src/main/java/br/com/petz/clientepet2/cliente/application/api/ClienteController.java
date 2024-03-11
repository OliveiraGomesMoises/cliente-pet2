package br.com.petz.clientepet2.cliente.application.api;

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
	public ClienteRespose postCliente(ClienteRequeste clienteRequeste) {
		log.info("[inicia]ClienteController - postCliente");
		ClienteRespose clienteCriado = clienteService.criaCliente(clienteRequeste);
		log.info("[finaliza]ClienteController - postCliente");
		return clienteCriado;
	}

}
