package br.com.petz.clientepet2.cliente.application.api;

import java.time.LocalDate;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.lang.NonNull;

import br.com.petz.clientepet2.cliente.domain.Sexo;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class ClienteRequeste {
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	@Email
	private String email;
	@NotBlank
	private String celular;
	private String telefone;
	private Sexo sexo;
	@NonNull
	private LocalDate dataNascimento;
	@CPF
	private String cpf;
	@NonNull
	private Boolean aceitaTermos;

}
