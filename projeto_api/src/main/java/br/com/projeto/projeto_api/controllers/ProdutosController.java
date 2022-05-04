package br.com.projeto.projeto_api.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.projeto_api.dao.ProdutoDao;
import br.com.projeto.projeto_api.models.Produto;

@CrossOrigin
@RestController // Sinaliza que trata-se de um controlador
public class ProdutosController {

	@Autowired // cria instancia do ClienteDao para abrir comunicação com banco de dados
	private ProdutoDao produtoDao;

	@PostMapping("/produto")
	public Produto criacaoProduto(@RequestBody Produto produto) {
		produtoDao.save(produto);
		return produto;
	}

	@GetMapping("/produtos")
	public ArrayList<Produto> listaDeProdutos(String nomeFuncionario, String nascFuncionario,  String endFuncionario ) {
		var listaProdutos = produtoDao.findAll();
		return (ArrayList<Produto>) listaProdutos;
	}

}
