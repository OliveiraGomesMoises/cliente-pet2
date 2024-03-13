package br.com.petz.clientepet2.cliente.application.api;

import java.util.List;
import java.util.UUID;

import br.com.petz.clientepet2.cliente.domain.Cliente;

public class ClienteListResponse {
	private UUID idCliente;
	private String nomeComoleto;
	private String cpf;
	private String email;
	private String celular;
	public static List<ClienteListResponse> converte(List<Cliente> clientes) {
		// TODO Auto-generated method stub
		return null;
	}
}
