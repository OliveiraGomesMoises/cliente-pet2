package br.com.petz.clientepet2.cliente.application.api;

import java.time.LocalDateTime;
import java.util.UUID;

import br.com.petz.clientepet2.cliente.domain.Sexo;
import lombok.Value;
@Value
public class ClienteDetalhadoResponse {
	private UUID idCliente;
	private String nomeComoleto;
	private String cpf;
	private String email;
	private String celular;
	private String telefone;
	private Sexo sexo;
	private Boolean aceitaTermos;

	private LocalDateTime dataHoraDoCadastro;

}
