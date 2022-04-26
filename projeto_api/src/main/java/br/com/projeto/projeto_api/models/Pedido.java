package br.com.projeto.projeto_api.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity // define que trata-se de uma entidade no banco de dados
@Table(name = "pedido")
public class Pedido {

	@Id // define o codigo como chave primária
	@GeneratedValue(strategy = GenerationType.IDENTITY) // define como auto increment
	@Column(nullable = false, name = "id_pedido")
	private long CodigoPedido;

	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente Cliente;

	@ManyToOne
	@JoinColumn(name = "id_funcionario")
	private Funcionario Funcionario;

	@ManyToOne
	@JoinColumn(name = "id_produto")
	private Produto Produto;

	@Column(nullable = false, name = "quantidade_produto")
	private long Quantidade;

	@Column(nullable = false, name = "valorTotal_produto")
	private BigDecimal ValorTotal;

	public long getCodigoPedido() {
		return CodigoPedido;
	}

	public void setCodigoPedido(long codigoPedido) {
		CodigoPedido = codigoPedido;
	}

	public Cliente getCliente() {
		return Cliente;
	}

	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return Funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		Funcionario = funcionario;
	}

	public Produto getProduto() {
		return Produto;
	}

	public void setProduto(Produto produto) {
		Produto = produto;
	}

	public long getQuantidade() {
		return Quantidade;
	}

	public void setQuantidade(long quantidade) {
		Quantidade = quantidade;
	}

	public BigDecimal getValorTotal() {
		return ValorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		ValorTotal = valorTotal;
	}

}
