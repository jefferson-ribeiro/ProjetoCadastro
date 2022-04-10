package servicos;

import java.util.ArrayList;
import java.util.Scanner;
import modelos.ProdutoModelo;

public class ProdutoServico {

	static Scanner teclado = new Scanner(System.in);

	public static void CadastroProduto(ArrayList<ProdutoModelo> listaProdutos) {
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
	}

	public static void RelatorioProduto(ArrayList<ProdutoModelo> listaProdutos) {
		for (ProdutoModelo p : listaProdutos) {
			System.out.println("--------------------------------------");
			System.out.println("Codigo: " + p.getCodigoProduto());
			System.out.println("Nome: " + p.getNomeProduto());
			System.out.println("Descrição: " + p.getDescricaoProduto());
			System.out.println("Valor: " + p.getValorProduto());
			System.out.println("--------------------------------------");
		}
	}
}
