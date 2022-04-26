package br.com.projeto.projeto_api.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.projeto.projeto_api.models.Produto;

public interface ProdutoDao extends CrudRepository<Produto, Integer> {

}

