package br.com.projeto.projeto_api.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // define que trata-se de uma entidade no banco de dados
public class Funcionario {

	@Id // define o codigo como chave primária
	@GeneratedValue(strategy = GenerationType.IDENTITY) // define como auto increment
	@Column(nullable = false, name = "id_funcionario")
	private Long codigoFuncionario;

	@Column(nullable = false, name = "nome_funcionario")
	private String nomeFuncionario;

	@Column(nullable = false, name = "nascimento_funcionario")
	private String nascFuncionario;

	@Column(nullable = false, name = "endereco_funcionario")
	private String endFuncionario;

	public Long getCodigoFuncionario() {
		return codigoFuncionario;
	}

	public void setCodigoFuncionario(Long codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public String getNascFuncionario() {
		return nascFuncionario;
	}

	public void setNascFuncionario(String nascFuncionario) {
		this.nascFuncionario = nascFuncionario;
	}

	public String getEndFuncionario() {
		return endFuncionario;
	}

	public void setEndFuncionario(String endFuncionario) {
		this.endFuncionario = endFuncionario;
	}

}
