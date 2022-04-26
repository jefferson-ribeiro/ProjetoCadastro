package br.com.projeto.projeto_api.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // define que trata-se de uma entidade no banco de dados
@Table(name = "clientes")
public class Cliente {

	@Id // define o codigo como chave primária
	@GeneratedValue(strategy = GenerationType.IDENTITY) // define como auto increment
	@Column(nullable = false, name = "id_cliente")
	private Long codigoCliente;

	@Column(nullable = false, name = "nome_cliente", length = 100)
	private String nomeCliente;

	@Column(nullable = false, name = "telefone_cliente")
	private String telefoneCliente;

	@Column(nullable = false, name = "cpf_cliente")
	private String cpfCliente;

	@Column(nullable = false, name = "email_cliente")
	private String emailCliente;

	public Long getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(Long codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getTelefoneCliente() {
		return telefoneCliente;
	}

	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

}
