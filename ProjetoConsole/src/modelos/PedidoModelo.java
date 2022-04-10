package modelos;

public class PedidoModelo {

	private int CodigoPedido;
	private ClienteModelo Cliente;
	private ProdutoModelo Produto;
	private FuncionarioModelo Funcionario;
	private int Quantidade;
	private double ValorTotal;

	public PedidoModelo(int codigo, ClienteModelo cliente, ProdutoModelo produto, FuncionarioModelo funcionario,
			int quantidade, double valorTotal) {
		super();
		CodigoPedido = codigo;
		Cliente = cliente;
		Produto = produto;
		Funcionario = funcionario;
		Quantidade = quantidade;
		ValorTotal = valorTotal;
	}

	public int getCodigoPedido() {
		return CodigoPedido;
	}

	public void setCodigoPedido(int codigoPedido) {
		CodigoPedido = codigoPedido;
	}

	public ClienteModelo getCliente() {
		return Cliente;
	}

	public void setCliente(ClienteModelo cliente) {
		Cliente = cliente;
	}

	public ProdutoModelo getProduto() {
		return Produto;
	}

	public void setProduto(ProdutoModelo produto) {
		Produto = produto;
	}

	public FuncionarioModelo getFuncionario() {
		return Funcionario;
	}

	public void setFuncionario(FuncionarioModelo funcionario) {
		Funcionario = funcionario;
	}

	public int getQuantidade() {
		return Quantidade;
	}

	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}

	public double getValorTotal() {
		return ValorTotal;
	}

	public void setValorTotal(double valorTotal) {
		ValorTotal = valorTotal;
	}

}
