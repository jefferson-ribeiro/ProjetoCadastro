package br.com.projeto.projeto_api.controllers;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.projeto_api.dao.PedidoDao;
import br.com.projeto.projeto_api.models.Cliente;
import br.com.projeto.projeto_api.models.Funcionario;
import br.com.projeto.projeto_api.models.Pedido;
import br.com.projeto.projeto_api.models.Produto;

@CrossOrigin
@RestController // Sinaliza que trata-se de um controlador
public class PedidosController {

	@Autowired // cria instancia do ClienteDao para abrir comunicação com banco de dados
	private PedidoDao pedidoDao;

	@PostMapping("/pedido")
	public Pedido criacaoPedido(@RequestBody Pedido pedido) {
		pedidoDao.save(pedido);
		return pedido;
	}

	@GetMapping("/pedidos")
	public ArrayList<Pedido> listaDePedidos(Cliente cliente, Funcionario funcionario, Produto produto, long quantidade,
			BigDecimal valorTotal) {
		var listaPedidos = pedidoDao.findAll();
		return (ArrayList<Pedido>) listaPedidos;
	}

}
