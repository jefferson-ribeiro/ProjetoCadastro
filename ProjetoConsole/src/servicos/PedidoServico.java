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
			System.out.println("Não existe cliente cadastrado");
			System.out.println("--------------------------------------");
			ClienteServico.CadastroCliente(listaClientes);
		}

		if (listaProdutos.size() == 0) {
			System.out.println("Não existe produto cadastrado");
			System.out.println("--------------------------------------");
			ProdutoServico.CadastroProduto(listaProdutos);
		}
		
		if (listaFuncionarios.size() == 0) {
			System.out.println("Não existe funcionário cadastrado");
			System.out.println("--------------------------------------");
			FuncionarioServico.CadastroFuncionario(listaFuncionarios);
		}

		var ped = new PedidoModelo(0, null, null, null, 0, 0.0);

		ped.setCodigoPedido(listaPedidos.size() + 1);

		System.out.println("Digite o código do Cliente para este pedido: ");

		for (ClienteModelo cliente : listaClientes) {
			System.out.println("(" + cliente.getCodigo() + ") " + cliente.getNome());
		}
		var codigoCliente = (teclado.nextInt() - 1);

		ClienteModelo cliRef = listaClientes.get(codigoCliente);

		ped.setCliente(cliRef);

		System.out.println("Digite o código do Funcionário para este pedido: ");

		for (FuncionarioModelo funcionario : listaFuncionarios) {
			System.out.println("(" + funcionario.getCodigoFuncionario() + ") " + funcionario.getNomeFuncionario());
		}
		var codigoFuncionario = (teclado.nextInt() - 1);

		FuncionarioModelo funRef = listaFuncionarios.get(codigoFuncionario);

		ped.setFuncionario(funRef);

		System.out.println("Quantos produtos deseja cadastrar neste pedido: ");
		var qtdProduto = teclado.nextInt();

		for (int i = 0; i < qtdProduto; i++) {

			System.out.println("Digite o código do Produto para este pedido: ");

			for (ProdutoModelo produto : listaProdutos) {
				System.out.println("(" + produto.getCodigoProduto() + ") " + produto.getNomeProduto());
			}
			var codigoProduto = (teclado.nextInt() - 1);

			ProdutoModelo prodRef = listaProdutos.get(codigoProduto);

			ped.setProduto(prodRef);

			System.out.println("Digite a quantidade de produto: ");
			ped.setQuantidade(teclado.nextInt());

			ped.setValorTotal(ped.getQuantidade() * ped.getProduto().getValorProduto());
			listaPedidos.add(ped);
		}
		System.out.println("--------------------------------------");
		System.out.println("Pedido cadastrado com sucesso !!!");
		System.out.println("--------------------------------------");
	}

	public static void RelatorioPedido(ArrayList<PedidoModelo> listaPedidos) {
		for (PedidoModelo pe : listaPedidos) {
			System.out.println("--------------------------------------");
			System.out.println("Codigo: " + pe.getCodigoPedido());
			System.out.println("Cliente: " + pe.getCliente().getNome());
			System.out.println("Funcionário: " + pe.getFuncionario().getNomeFuncionario());
			System.out.println("///////////////////////////////////////");
			System.out.println("Produto: " + pe.getProduto().getNomeProduto());
			System.out.println("Quantidade: " + pe.getQuantidade());
			System.out.println("Valor unitário: R$" + pe.getProduto().getValorProduto());
			System.out.println("Valor Total: R$" + pe.getValorTotal());
			System.out.println("--------------------------------------");
		}

	}

}
