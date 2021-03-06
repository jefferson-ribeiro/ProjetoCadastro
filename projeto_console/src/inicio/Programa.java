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

		// Cria??o da variavel teclado para atribuir a op??o escolhida do menu inicial
		Scanner teclado = new Scanner(System.in);

		// Cria??o de listas para cada um dos objetos do projeto
		ArrayList<ClienteModelo> listaClientes = new ArrayList<ClienteModelo>();
		ArrayList<ProdutoModelo> listaProdutos = new ArrayList<ProdutoModelo>();
		ArrayList<FuncionarioModelo> listaFuncionarios = new ArrayList<FuncionarioModelo>();
		ArrayList<PedidoModelo> listaPedidos = new ArrayList<PedidoModelo>();

		int opcao = 0;

		do {
			System.out.println("=====Programa para Cadastro e Relat?rios=====");
			System.out.println(":::::::::::::::::::::::::::::::::::::::");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Rel?torio");
			System.out.println("0 - Sair");
			System.out.println(":::::::::::::::::::::::::::::::::::::::");
			System.out.println("Digite a op??o desejada: ");

			opcao = teclado.nextInt();

			switch (opcao) {
			case 1: {
				int opcao2 = 0;
				do {

					System.out.println("=====Cadastros=====");
					System.out.println(":::::::::::::::::::::::::::::::::::::::");
					System.out.println("1 - Cadastrar Cliente");
					System.out.println("2 - Cadastrar Produto");
					System.out.println("3 - Cadastrar Funcion?rios");
					System.out.println("4 - Cadastrar Pedidos");
					System.out.println("0 - Voltar");
					System.out.println(":::::::::::::::::::::::::::::::::::::::");
					System.out.println("Digite a op??o desejada: ");
					opcao2 = teclado.nextInt();

					switch (opcao2) {
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
						System.out.println("=====Cadastro de Funcion?rios=====");
						FuncionarioServico.CadastroFuncionario(listaFuncionarios);
						break;

					}
					case 4: {
						System.out.println("=====Cadastro de Pedidos=====");
						PedidoServico.CadastroPedido(listaClientes, listaProdutos, listaFuncionarios, listaPedidos);
						break;
					}

					case 0: {
						System.out.println("Voltar");
						break;
					}

					default:
						System.out.println("Op??o inv?lida");
						break;

					}
				} while (opcao2 != 0);
				break;
			}
			case 2: {
				int opcao3 = 0;

				do {
					System.out.println("=====Relat?rios=====");
					System.out.println(":::::::::::::::::::::::::::::::::::::::");
					System.out.println("1 - Rel?torio de Clientes");
					System.out.println("2 - Rel?torio de Produtos");
					System.out.println("3 - Rel?torio de Funcion?rios");
					System.out.println("4 - Rel?torio de Pedidos");
					System.out.println("0 - Voltar");
					System.out.println(":::::::::::::::::::::::::::::::::::::::");
					System.out.println("Digite a op??o desejada: ");
					opcao3 = teclado.nextInt();

					switch (opcao3) {
					case 1: {
						System.out.println("=====Relatorio de Clientes=====");
						ClienteServico.RelatorioCliente(listaClientes);
						break;
					}

					case 2: {
						System.out.println("=====Relatorio de Produtos=====");
						ProdutoServico.RelatorioProduto(listaProdutos);
						break;
					}

					case 3: {
						System.out.println("=====Relatorio de Funcion?rios=====");
						FuncionarioServico.RelatorioFuncionario(listaFuncionarios);
						break;
					}

					case 4: {
						System.out.println("=====Relatorio de Pedidos=====");
						PedidoServico.RelatorioPedido(listaPedidos);
						break;
					}

					case 0: {
						System.out.println("Voltar");
						break;
					}
					default:
						System.out.println("Op??o inv?lida");
						break;
					}
				} while (opcao3 != 0);
				break;
			}

			case 0: {
				System.out.println("Sair");
				break;
			}
			default:
				System.out.println("Op??o inv?lida");
				break;
			}

		} while (opcao != 0);

		teclado.close();
	}
}
