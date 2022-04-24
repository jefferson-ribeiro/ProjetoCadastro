package br.com.projeto.projeto_api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Sinaliza que trata-se de um controlador
public class HomeController {

	// Define a rota principal (index)
	@GetMapping("/")
	public String index() {
		return "Projeto Cadastro";
	}

	// todo objeto que tem propriedades (serializable)
}
