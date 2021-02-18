package com.crok.pessoa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crok.pessoa.model.Pessoa;

@Repository
public interface PessoaDao extends JpaRepository<Pessoa, Integer> {

}
