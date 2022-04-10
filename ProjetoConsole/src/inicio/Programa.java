package inicio;

import java.util.ArrayList;
import java.util.Scanner;
import modelos.ClienteModelo;
import modelos.FuncionarioModelo;
import modelos.PedidoModelo;
import modelos.ProdutoModelo;
import servicos.ClienteServico;
import servicos.FuncionarioServico;
import servicos.PedidoServico;
import servicos.ProdutoServico;

public class Programa {

	public static void main(String[] args) {

		// Criação da variavel teclado para atribuir a opção escolhida do menu inicial
		Scanner teclado = new Scanner(System.in);

		// Criação de listas para cada um dos objetos do projeto
		ArrayList<ClienteModelo> listaClientes = new ArrayList<ClienteModelo>();
		ArrayList<ProdutoModelo> listaProdutos = new ArrayList<ProdutoModelo>();
		ArrayList<FuncionarioModelo> listaFuncionarios = new ArrayList<FuncionarioModelo>();
		ArrayList<PedidoModelo> listaPedidos = new ArrayList<PedidoModelo>();

		int opcao = 0;

		do {
			System.out.println("=====Cadastro e Geração de Pedidos=====");
			System.out.println(":::::::::::::::::::::::::::::::::::::::");
			System.out.println("1 - Cadastrar Cliente");
			System.out.println("2 - Cadastrar Produto");
			System.out.println("3 - Cadastrar Funcionários");
			System.out.println("4 - Cadastrar Pedidos");
			System.out.println("5 - Relátorio de Clientes");
			System.out.println("6 - Relátorio de Produtos");
			System.out.println("7 - Relátorio de Funcionários");
			System.out.println("8 - Relátorio de Pedidos");
			System.out.println("0 - Sair");
			System.out.println(":::::::::::::::::::::::::::::::::::::::");
			System.out.println("Digite a opção desejada: ");

			opcao = teclado.nextInt();

			switch (opcao) {
			case 1: {
				System.out.println("=====Cadastro de Clientes=====");
				ClienteServico.CadastroCliente(listaClientes);
				break;
			}
			case 2: {
				System.out.println("=====Cadastro de Produtos=====");
				ProdutoServico.CadastroProduto(listaProdutos);
				break;
			}
			case 3: {
				System.out.println("=====Cadastro de Funcionários=====");
				FuncionarioServico.CadastroFuncionario(listaFuncionarios);
				break;
			}
			case 4: {
				System.out.println("=====Cadastro de Pedidos=====");
				PedidoServico.CadastroPedido(listaClientes, listaProdutos, listaFuncionarios, listaPedidos);
				break;
			}

			case 5: {
				System.out.println("=====Relatorio de Clientes=====");
				ClienteServico.RelatorioCliente(listaClientes);
				break;
			}

			case 6: {
				System.out.println("=====Relatorio de Produtos=====");
				ProdutoServico.RelatorioProduto(listaProdutos);
				break;
			}

			case 7: {
				System.out.println("=====Relatorio de Funcionários=====");
				FuncionarioServico.RelatorioFuncionario(listaFuncionarios);
				break;
			}

			case 8: {
				System.out.println("=====Relatorio de Pedidos=====");
				PedidoServico.RelatorioPedido(listaPedidos);
				break;
			}

			case 0: {
				System.out.println("Sair");
				break;
			}
			default:
				System.out.println("Opção inválida");
				break;
			}

		} while (opcao != 0);

		teclado.close();
	}
}
