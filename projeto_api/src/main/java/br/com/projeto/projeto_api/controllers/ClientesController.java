package br.com.projeto.projeto_api.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.projeto_api.dao.ClienteDao;
import br.com.projeto.projeto_api.models.Cliente;

@CrossOrigin
@RestController // Sinaliza que trata-se de um controlador
public class ClientesController {

	@Autowired // cria instancia do ClienteDao para abrir comunicação com banco de dados
	private ClienteDao clienteDao;

/*
	@GetMapping("/cliente") //cadastro via get (parametros na barra de navegação)
	public Cliente cadastraCliente(String nomeCliente, String telefoneCliente, String cpfCliente, String emailCliente) {
		var c = new Cliente();
		c.setNomeCliente(nomeCliente);
		c.setCpfCliente(cpfCliente);
		c.setTelefoneCliente(telefoneCliente);
		c.setEmailCliente(emailCliente);
		clienteDao.save(c);
		return c;
		
		//http://localhost:8080/cliente?nomeCliente=Jaqueline&telefoneCliente=11974369468&cpfCliente=33152402805&emailCliente=jaque@gmail.com
	}
*/
	//Cadastrar Cliente
	@PostMapping("/cliente") //cadastro via Post parametros no body do navegador
	public Cliente criacaoCliente(@RequestBody Cliente cliente) {
		clienteDao.save(cliente);
		return cliente;
	}
	
	//Deletar Cliente
	@DeleteMapping("/cliente/{id}")
	public ResponseEntity<Cliente> deletaCliente(@PathVariable int id) {
		var cliente =  clienteDao.findById(id).orElse(null);
		if (cliente == null) {
			return ResponseEntity.status(404).build();
		}
		clienteDao.delete(cliente);
		return ResponseEntity.status(204).build();	
	}
	//Update de Cliente
	  @PatchMapping("/cliente/{id}")
	  public ResponseEntity<Cliente> updateNome(@PathVariable int id, @RequestBody Cliente cli){
	    if(!clienteDao.existsById(id)) return ResponseEntity.status(404).build();
	    Cliente clienteDb = clienteDao.findById(id).get();
	    clienteDb.setNomeCliente(cli.getNomeCliente());
	    clienteDb.setTelefoneCliente(cli.getTelefoneCliente());
	    clienteDb.setCpfCliente(cli.getCpfCliente());
	    clienteDb.setEmailCliente(cli.getEmailCliente());
	    clienteDao.save(clienteDb);
	    return ResponseEntity.ok(clienteDb);
	  }
	
	//Listar todos clientes
	@GetMapping("/clientes")
	public ArrayList<Cliente> listaDeClientes(String nomeCliente, String telefoneCliente, String cpfCliente,
			String emailCliente) {
		var listaClientes = clienteDao.findAll();
		return (ArrayList<Cliente>) listaClientes;
	}

	//Buscar um único cliente
	@GetMapping("/cliente/{codigoCliente}")
	public Cliente selecionaId(@PathVariable int codigoCliente) {
		return clienteDao.findById(codigoCliente).orElse(null);
	}
}