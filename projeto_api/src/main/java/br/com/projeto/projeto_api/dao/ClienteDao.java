package br.com.projeto.projeto_api.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.projeto.projeto_api.models.Cliente;

public interface ClienteDao extends CrudRepository<Cliente, Integer> {

}

