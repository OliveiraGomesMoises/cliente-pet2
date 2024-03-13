package br.com.petz.clientepet2.cliente.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.lang.NonNull;

import br.com.petz.clientepet2.cliente.application.api.ClienteRequeste;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, unique = true, nullable = false)
	private UUID idCliente;
	@NotBlank
	private String nomeComoleto;
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

	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;

	public Cliente(ClienteRequeste clienteRequeste) {
		this.nomeComoleto = clienteRequeste.getNomeCompleto();
		this.email = clienteRequeste.getEmail();
		this.celular = clienteRequeste.getCelular();
		this.telefone = clienteRequeste.getTelefone();
		this.sexo = clienteRequeste.getSexo();
		this.dataNascimento = clienteRequeste.getDataNascimento();
		this.cpf = clienteRequeste.getCpf();
		this.aceitaTermos = clienteRequeste.getAceitaTermos();
		this.dataHoraDoCadastro = LocalDateTime.now();

	}
}
