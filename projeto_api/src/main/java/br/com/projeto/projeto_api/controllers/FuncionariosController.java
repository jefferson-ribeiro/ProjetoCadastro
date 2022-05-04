package br.com.projeto.projeto_api.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.projeto_api.dao.FuncionarioDao;
import br.com.projeto.projeto_api.models.Funcionario;

@CrossOrigin
@RestController // Sinaliza que trata-se de um controlador
public class FuncionariosController {

	@Autowired // cria instancia do ClienteDao para abrir comunicação com banco de dados
	private FuncionarioDao funcionarioDao;

	@PostMapping("/funcionario")
	public Funcionario criacaoFuncionario(@RequestBody Funcionario funcionario) {
		funcionarioDao.save(funcionario);
		return funcionario;
	}

	@GetMapping("/funcionarios")
	public ArrayList<Funcionario> listaDeFuncionarios(String nomeFuncionario, String nascFuncionario,  String endFuncionario ) {
		var listaFuncionarios = funcionarioDao.findAll();
		return (ArrayList<Funcionario>) listaFuncionarios;
	}

}
