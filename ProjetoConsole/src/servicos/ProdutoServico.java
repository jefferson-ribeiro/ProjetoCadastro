package servicos;

import java.util.ArrayList;
import java.util.Scanner;
import modelos.ProdutoModelo;

public class ProdutoServico {

	static Scanner teclado = new Scanner(System.in);

	public static void CadastroProduto(ArrayList<ProdutoModelo> listaProdutos) {
		var p = new ProdutoModelo(0, null, null, 0);

		p.setCodigoProduto(listaProdutos.size() + 1);

		System.out.println("Digite o nome deste produto: ");
		p.setNomeProduto(teclado.nextLine());

		System.out.println("Digite a descrição deste produto: ");
		p.setDescricaoProduto(teclado.nextLine());

		System.out.println("Digite o valor deste produto: ");
		var valorProdutoSrt = teclado.nextLine();
		Double valorProduto = Double.valueOf(valorProdutoSrt);
		p.setValorProduto(valorProduto);

		listaProdutos.add(p);

		System.out.println("--------------------------------------");
		System.out.println("Produto cadastrado com sucesso !!!");
		System.out.println("--------------------------------------");
	}

	public static void RelatorioProduto(ArrayList<ProdutoModelo> listaProdutos) {
		for (ProdutoModelo p : listaProdutos) {
			System.out.println("--------------------------------------");
			System.out.println("Codigo: " + p.getCodigoProduto());
			System.out.println("Nome: " + p.getNomeProduto());
			System.out.println("Descrição: " + p.getDescricaoProduto());
			System.out.println("Valor: R$ " + p.getValorProduto());
			System.out.println("--------------------------------------");
		}
	}
}
