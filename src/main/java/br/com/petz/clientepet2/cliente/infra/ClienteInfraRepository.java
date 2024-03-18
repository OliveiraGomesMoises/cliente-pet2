package br.com.petz.clientepet2.cliente.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.petz.clientepet2.cliente.application.api.ClienteListResponse;
import br.com.petz.clientepet2.cliente.application.repository.ClienteRepository;
import br.com.petz.clientepet2.cliente.domain.Cliente;
import br.com.petz.clientepet2.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Repository
@Log4j2
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {

	private final ClienteSpringDataJPARepository clienteSpringDataJPARepository ;

	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[inicia]ClienteInfraRepository - salva");
		clienteSpringDataJPARepository.save(cliente);
		log.info("[finaliza]ClienteInfraRepository - salva");
		return cliente;
	}

	@Override
	public List<Cliente> buscaTodosClientes() {
		log.info("[inicia]ClienteInfraRepository - buscaTodosClientes");
		List<Cliente> todosClientes = clienteSpringDataJPARepository.findAll();
		log.info("[finaliza]ClienteInfraRepository - buscaTodosClientes");
		return todosClientes;
	}

	@Override
	public Cliente buscaClienteAtravesDoId(UUID idCliente) {
		log.info("[inicia]ClienteInfraRepository - buscaClienteAtravesDoId");
		Cliente cliente = clienteSpringDataJPARepository.findById(idCliente)
				.orElseThrow(()-> APIException.build(HttpStatus.NOT_FOUND, "Cliente nõa encontrado!"));
		log.info("[finaliza]ClienteInfraRepository - buscaClienteAtravesDoId");
		return cliente;
	}

	
	}



