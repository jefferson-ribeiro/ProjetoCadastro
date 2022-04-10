package inicio;

import java.util.ArrayList;
import java.util.Scanner;

import modelos.ClienteModelo;
import modelos.FuncionarioModelo;
import modelos.PedidoModelo;
import modelos.ProdutoModelo;

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

				var c = new ClienteModelo(0, null, null, null, null);

				c.setCodigo(listaClientes.size() + 1);

				System.out.println("Digite o nome deste cliente: ");
				c.setNome(teclado.next());

				System.out.println("Digite o telefone deste cliente: ");
				c.setTelefone(teclado.next());

				System.out.println("Digite o CPF deste cliente: ");
				c.setCpf(teclado.next());

				System.out.println("Digite o e-mail deste cliente: ");
				c.setEmail(teclado.next());

				listaClientes.add(c);

				System.out.println("Cliente cadastrado com sucesso !!!");

				break;
			}
			case 2: {
				System.out.println("=====Cadastro de Produtos=====");

				var p = new ProdutoModelo(0, null, null, 0.0);

				p.setCodigoProduto(listaProdutos.size() + 1);

				System.out.println("Digite o nome deste produto: ");
				p.setNomeProduto(teclado.next());

				System.out.println("Digite a descrição deste produto: ");
				p.setDescricaoProduto(teclado.next());

				System.out.println("Digite o valor deste produto: ");
				p.setValorProduto(teclado.nextDouble());

				listaProdutos.add(p);

				System.out.println("Produto cadastrado com sucesso !!!");
				break;
			}
			case 3: {

				System.out.println("=====Cadastro de Funcionários=====");

				var f = new FuncionarioModelo(0, null, null, null);

				f.setCodigoFuncionario(listaFuncionarios.size() + 1);

				System.out.println("Digite o nome deste funcionário: ");
				f.setNomeFuncionario(teclado.next());

				System.out.println("Digite a data de nascimento deste funcionário: ");
				f.setNascFuncionario(teclado.next());

				System.out.println("Digite o endereço deste funcionário: ");
				f.setEndFuncionario(teclado.next());

				listaFuncionarios.add(f);

				System.out.println("Funcionário cadastrado com sucesso !!!");
				break;
			}
			case 4: {
				System.out.println("=====Cadastro de Pedidos=====");

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
					System.out.println(
							"(" + funcionario.getCodigoFuncionario() + ") " + funcionario.getNomeFuncionario());
				}
				var codigoFuncionario = (teclado.nextInt() - 1);

				FuncionarioModelo funRef = listaFuncionarios.get(codigoFuncionario);

				ped.setFuncionario(funRef);

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

				System.out.println("Pedido cadastrado com sucesso !!!");
				break;
			}

			case 5: {
				System.out.println("=====Relatorio de Clientes=====");
				for (ClienteModelo c : listaClientes) {
					System.out.println("--------------------------------------");
					System.out.println("Codigo: " + c.getCodigo());
					System.out.println("Nome: " + c.getNome());
					System.out.println("Telefone: " + c.getTelefone());
					System.out.println("CPF: " + c.getCpf());
					System.out.println("E-mail: " + c.getEmail());
					System.out.println("--------------------------------------");
				}
				break;
			}

			case 6: {
				System.out.println("=====Relatorio de Produtos=====");
				for (ProdutoModelo p : listaProdutos) {
					System.out.println("--------------------------------------");
					System.out.println("Codigo: " + p.getCodigoProduto());
					System.out.println("Nome: " + p.getNomeProduto());
					System.out.println("Descrição: " + p.getDescricaoProduto());
					System.out.println("Valor: " + p.getValorProduto());
					System.out.println("--------------------------------------");
				}
				break;
			}

			case 7: {
				System.out.println("=====Relatorio de Funcionários=====");
				for (FuncionarioModelo f : listaFuncionarios) {
					System.out.println("--------------------------------------");
					System.out.println("Codigo: " + f.getCodigoFuncionario());
					System.out.println("Nome: " + f.getNomeFuncionario());
					System.out.println("Nascimento: " + f.getNascFuncionario());
					System.out.println("Endereço: " + f.getEndFuncionario());
					System.out.println("--------------------------------------");
				}
				break;
			}

			case 8: {
				System.out.println("=====Relatorio de Pedidos=====");
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

	}
}
