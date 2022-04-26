package br.com.projeto.projeto_api.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // define que trata-se de uma entidade no banco de dados
public class Produto {

	@Id // define o codigo como chave primária
	@GeneratedValue(strategy = GenerationType.IDENTITY) // define como auto increment
	@Column(nullable = false, name = "id_produto")
	private long codigoProduto;

	@Column(nullable = false, name = "nome_produto")
	private String nomeProduto;

	@Column(nullable = false, name = "descricao_produto")
	private String descricaoProduto;

	@Column(nullable = false, name = "valor_produto")
	private BigDecimal valorProduto;

	public long getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(long codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public BigDecimal getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(BigDecimal valorProduto) {
		this.valorProduto = valorProduto;
	}

}
