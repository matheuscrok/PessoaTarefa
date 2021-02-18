package com.crok.pessoa.rest;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crok.pessoa.dao.PessoaDao;
import com.crok.pessoa.model.Pessoa;

@RestController
@RequestMapping("/rest")
public class PessoaRest {

	@Autowired
	private PessoaDao pessoaDao;
	
	@GetMapping
	public List<Pessoa> get() {
		return pessoaDao.findAll();
	}
	
	@PostMapping
	public void post(@RequestBody Pessoa pessoa) {
		pessoaDao.save(pessoa);
	}
	
	@DeleteMapping("/{id}")
	public void delete(Integer id) {
		pessoaDao.deleteById(id);
	}
	
	
}
