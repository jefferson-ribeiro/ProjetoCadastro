package inicio;

import java.util.ArrayList;
import java.util.Scanner;

import modelos.ClienteModelo;
import modelos.FuncionarioModelo;
import modelos.ProdutoModelo;

public class Programa {

	public static void main(String[] args) {

		// Cria��o da variavel teclado para atribuir a op��o escolhida do menu inicial
		Scanner teclado = new Scanner(System.in);

		// Cria��o de listas para cada um dos objetos do projeto
		ArrayList<ClienteModelo> listaClientes = new ArrayList<ClienteModelo>();

		ArrayList<ProdutoModelo> listaProdutos = new ArrayList<ProdutoModelo>();
		
		ArrayList<FuncionarioModelo> listaFuncionarios = new ArrayList<FuncionarioModelo>();


		int opcao = 0;

		do {
			System.out.println("=====Cadastro e Gera��o de Pedidos=====");
			System.out.println(":::::::::::::::::::::::::::::::::::::::");
			System.out.println("1 - Cadastrar Cliente");
			System.out.println("2 - Cadastrar Produto");
			System.out.println("3 - Cadastrar Funcion�rios");
			System.out.println("4 - Cadastrar Pedidos");
			System.out.println("5 - Rel�torio de Clientes");
			System.out.println("6 - Rel�torio de Produtos");
			System.out.println("7 - Rel�torio de Funcion�rios");
			System.out.println("8 - Rel�torio de Pedidos");
			System.out.println("0 - Sair");
			System.out.println(":::::::::::::::::::::::::::::::::::::::");
			System.out.println("Digite a op��o desejada: ");

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

				var p = new ProdutoModelo(0, null, null,0.0);

				p.setCodigoProduto(listaProdutos.size() + 1);

				System.out.println("Digite o nome deste produto: ");
				p.setNomeProduto(teclado.next());

				System.out.println("Digite a descri��o deste produto: ");
				p.setDescricaoProduto(teclado.next());

				System.out.println("Digite o valor deste produto: ");
				p.setValorProduto(teclado.nextDouble());

				listaProdutos.add(p);

				System.out.println("Produto cadastrado com sucesso !!!");
			}
			case 3: {
				
				System.out.println("=====Cadastro de Funcion�rios=====");

				var f = new FuncionarioModelo(0, null, null, null);

				f.setCodigoFuncionario(listaFuncionarios.size()+1);

				System.out.println("Digite o nome deste funcion�rio: ");
				f.setNomeFuncionario(teclado.next());

				System.out.println("Digite a data de nascimento deste funcion�rio: ");
				f.setNascFuncionario(teclado.next());

				System.out.println("Digite o endere�o deste funcion�rio: ");
				f.setEndFuncionario(teclado.next());

				listaFuncionarios.add(f);

				System.out.println("Funcion�rio cadastrado com sucesso !!!");
				break;
			}
			case 4: {
				System.out.println("Pedidos");
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
					System.out.println("Descri��o: " + p.getDescricaoProduto());
					System.out.println("Valor: " + p.getValorProduto());
					System.out.println("--------------------------------------");
				}
				break;
			}
			
			case 7: {
				System.out.println("=====Relatorio de Funcion�rios=====");
				for (FuncionarioModelo f : listaFuncionarios) {
					System.out.println("--------------------------------------");
					System.out.println("Codigo: " + f.getCodigoFuncionario());
					System.out.println("Nome: " + f.getNomeFuncionario());
					System.out.println("Nascimento: " + f.getNascFuncionario());
					System.out.println("Endere�o: " + f.getEndFuncionario());
					System.out.println("--------------------------------------");
				}
				break;
			}
			
			case 8: {
				System.out.println("=====Relatorio de Pedidos=====");

					System.out.println("--------------------------------------");
					System.out.println("--------------------------------------");
				break;
			}

			case 0: {
				System.out.println("Sair");
				break;
			}
			default:
				System.out.println("Op��o inv�lida");
				break;
			}

		} while (opcao != 0);

	}
}
