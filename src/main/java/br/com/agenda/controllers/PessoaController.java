package br.com.agenda.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.agenda.daos.PessoaDao;
import br.com.agenda.model.Pessoa;

@Controller
@RequestMapping("/pessoas")
public class PessoaController {

	@Autowired
	private PessoaDao dao;

	@RequestMapping(value="/cadastro", method=RequestMethod.GET)
	public String formNovo(Pessoa pessoa) {
		return "pessoas/cadastro";
	}

	@RequestMapping(value = "/cadastro/salvar", method = RequestMethod.POST)
	@Transactional
	public String formSalva(Pessoa pessoa) {
		dao.save(pessoa);
		return "pessoas/cadastro";
	}

}
