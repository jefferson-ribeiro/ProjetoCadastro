package br.com.projeto.projeto_api.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.projeto.projeto_api.models.Pedido;

public interface PedidoDao extends CrudRepository<Pedido, Integer> {

}
