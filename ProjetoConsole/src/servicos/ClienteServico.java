package servicos;

import java.util.ArrayList;
import java.util.Scanner;
import modelos.ClienteModelo;

public class ClienteServico {

	static Scanner teclado = new Scanner(System.in);

	public static void CadastroCliente(ArrayList<ClienteModelo> listaClientes) {
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
	}

	public static void RelatorioCliente(ArrayList<ClienteModelo> listaClientes) {
		for (ClienteModelo c : listaClientes) {
			System.out.println("--------------------------------------");
			System.out.println("Codigo: " + c.getCodigo());
			System.out.println("Nome: " + c.getNome());
			System.out.println("Telefone: " + c.getTelefone());
			System.out.println("CPF: " + c.getCpf());
			System.out.println("E-mail: " + c.getEmail());
			System.out.println("--------------------------------------");
		}
	}
}
