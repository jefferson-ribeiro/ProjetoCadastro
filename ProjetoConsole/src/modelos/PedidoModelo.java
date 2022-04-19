package modelos;

import java.util.ArrayList;

public class PedidoModelo {

	private int CodigoPedido;
	private ClienteModelo Cliente;
	private ProdutoModelo Produto;
	private FuncionarioModelo Funcionario;
	private int Quantidade;
	private double ValorTotal;

	private ArrayList<ProdutoModelo> listaProdutosCliente;
	private ArrayList<Integer> listaQtdProdutos;
	private ArrayList<Double> listaValorTotal;

	public PedidoModelo(int codigoPedido, ClienteModelo cliente, ProdutoModelo produto, FuncionarioModelo funcionario,
			int quantidade, double valorTotal, ArrayList<ProdutoModelo> listaProdutosCliente,
			ArrayList<Integer> listaQtdProdutos, ArrayList<Double> listaValorTotal) {
		super();
		CodigoPedido = codigoPedido;
		Cliente = cliente;
		Produto = produto;
		Funcionario = funcionario;
		Quantidade = quantidade;
		ValorTotal = valorTotal;
		this.listaProdutosCliente = listaProdutosCliente = new ArrayList<ProdutoModelo>();
		this.listaQtdProdutos = listaQtdProdutos = new ArrayList<Integer>();
		this.listaValorTotal = listaValorTotal = new ArrayList<Double>();
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

	public ArrayList<ProdutoModelo> getListaProdutosCliente() {
		return listaProdutosCliente;
	}

	public void setListaProdutosCliente(ArrayList<ProdutoModelo> listaProdutosCliente) {
		this.listaProdutosCliente = new ArrayList<ProdutoModelo>();
	}

	public ArrayList<Integer> getListaQtdProdutos() {
		return listaQtdProdutos;
	}

	public void setListaQtdProdutos(ArrayList<Integer> listaQtdProdutos) {
		this.listaQtdProdutos = new ArrayList<Integer>();
	}

	public ArrayList<Double> getListaValorTotal() {
		return listaValorTotal;
	}

	public void setListaValorTotal(ArrayList<Double> listaValorTotal) {
		this.listaValorTotal = new ArrayList<Double>();
	}

}
