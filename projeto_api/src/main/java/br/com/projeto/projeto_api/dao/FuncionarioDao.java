package br.com.projeto.projeto_api.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.projeto.projeto_api.models.Funcionario;

public interface FuncionarioDao extends CrudRepository<Funcionario, Integer> {

}

