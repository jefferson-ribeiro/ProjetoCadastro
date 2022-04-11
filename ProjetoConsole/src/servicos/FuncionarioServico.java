package servicos;

import java.util.ArrayList;
import java.util.Scanner;

import modelos.FuncionarioModelo;

public class FuncionarioServico {
	static Scanner teclado = new Scanner(System.in);

	public static void CadastroFuncionario(ArrayList<FuncionarioModelo> listaFuncionarios) {
		var f = new FuncionarioModelo(0, null, null, null);

		f.setCodigoFuncionario(listaFuncionarios.size() + 1);

		System.out.println("Digite o nome deste funcion�rio: ");
		f.setNomeFuncionario(teclado.next());

		System.out.println("Digite a data de nascimento deste funcion�rio: ");
		f.setNascFuncionario(teclado.next());

		System.out.println("Digite o endere�o deste funcion�rio: ");
		f.setEndFuncionario(teclado.next());

		listaFuncionarios.add(f);

		System.out.println("--------------------------------------");
		System.out.println("Funcion�rio cadastrado com sucesso !!!");
		System.out.println("--------------------------------------");
	}

	public static void RelatorioFuncionario(ArrayList<FuncionarioModelo> listaFuncionarios) {
		for (FuncionarioModelo f : listaFuncionarios) {
			System.out.println("--------------------------------------");
			System.out.println("Codigo: " + f.getCodigoFuncionario());
			System.out.println("Nome: " + f.getNomeFuncionario());
			System.out.println("Nascimento: " + f.getNascFuncionario());
			System.out.println("Endere�o: " + f.getEndFuncionario());
			System.out.println("--------------------------------------");
		}
	}
}
