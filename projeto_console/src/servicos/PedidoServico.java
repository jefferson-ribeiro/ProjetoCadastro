package servicos;

import java.util.ArrayList;
import java.util.Scanner;

import modelos.ClienteModelo;
import modelos.FuncionarioModelo;
import modelos.PedidoModelo;
import modelos.ProdutoModelo;

public class PedidoServico {
	static Scanner teclado = new Scanner(System.in);

	public static void CadastroPedido(ArrayList<ClienteModelo> listaClientes, ArrayList<ProdutoModelo> listaProdutos,
			ArrayList<FuncionarioModelo> listaFuncionarios, ArrayList<PedidoModelo> listaPedidos) {

		if (listaClientes.size() == 0) {
			System.out.println("N?o existe cliente cadastrado");
			System.out.println("--------------------------------------");
			ClienteServico.CadastroCliente(listaClientes);
		}

		if (listaProdutos.size() == 0) {
			System.out.println("N?o existe produto cadastrado");
			System.out.println("--------------------------------------");
			ProdutoServico.CadastroProduto(listaProdutos);
		}

		if (listaFuncionarios.size() == 0) {
			System.out.println("N?o existe funcion?rio cadastrado");
			System.out.println("--------------------------------------");
			FuncionarioServico.CadastroFuncionario(listaFuncionarios);
		}

		var ped = new PedidoModelo(0, null, null, null, 0, 0, null, null, null);

		ped.setCodigoPedido(listaPedidos.size() + 1);

		System.out.println("Digite o c?digo do Cliente para este pedido: ");

		for (ClienteModelo cliente : listaClientes) {
			System.out.println("(" + cliente.getCodigo() + ") " + cliente.getNome());
		}
		var codigoCliente = (teclado.nextInt() - 1);

		ClienteModelo cliRef = listaClientes.get(codigoCliente);

		ped.setCliente(cliRef);

		System.out.println("Digite o c?digo do Funcion?rio para este pedido: ");

		for (FuncionarioModelo funcionario : listaFuncionarios) {
			System.out.println("(" + funcionario.getCodigoFuncionario() + ") " + funcionario.getNomeFuncionario());
		}
		var codigoFuncionario = (teclado.nextInt() - 1);

		FuncionarioModelo funRef = listaFuncionarios.get(codigoFuncionario);

		ped.setFuncionario(funRef);

		System.out.println("Quantos produtos deseja cadastrar neste pedido: ");
		var qtdProduto = teclado.nextInt();

		for (int i = 0; i < qtdProduto; i++) {

			System.out.println("Digite o c?digo do Produto para este pedido: ");

			for (ProdutoModelo produto : listaProdutos) {
				System.out.println("(" + produto.getCodigoProduto() + ") " + produto.getNomeProduto());
			}
			var codigoProduto = (teclado.nextInt() - 1);

			ProdutoModelo prodRef = listaProdutos.get(codigoProduto);

			ped.getListaProdutosCliente().add(prodRef);

			System.out.println("Digite a quantidade de produto: ");

			ped.getListaQtdProdutos().add(teclado.nextInt());

			ped.getListaValorTotal()
					.add(ped.getListaQtdProdutos().get(i) * ped.getListaProdutosCliente().get(i).getValorProduto());
		}

		listaPedidos.add(ped);

		System.out.println("--------------------------------------");
		System.out.println("Pedido cadastrado com sucesso !!!");
		System.out.println("--------------------------------------");
	}

	public static void RelatorioPedido(ArrayList<PedidoModelo> listaPedidos) {
		double valorTotalPedido = 0;
		for (PedidoModelo pe : listaPedidos) {

			System.out.println("--------------------------------------");
			System.out.println("Codigo: " + pe.getCodigoPedido());
			System.out.println("Cliente: " + pe.getCliente().getNome());
			System.out.println("Funcion?rio: " + pe.getFuncionario().getNomeFuncionario());
			System.out.println("///////////////////////////////////////");

			for (int i = 0; i < pe.getListaProdutosCliente().size(); i++) {
				System.out.println("Produto: " + pe.getListaProdutosCliente().get(i).getNomeProduto());
				System.out.println("Quantidade: " + pe.getListaQtdProdutos().get(i));
				System.out.println("Valor unit?rio: R$" + pe.getListaProdutosCliente().get(i).getValorProduto());
				System.out.println("Valor Total: R$" + pe.getListaValorTotal().get(i));
				System.out.println("--------------------------------------");
				valorTotalPedido += pe.getListaValorTotal().get(i);
			}
			System.out.println("Valor Total do pedido: R$" + valorTotalPedido);
			System.out.println("--------------------------------------");
		}
	}
}
