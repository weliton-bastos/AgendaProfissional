package br.com.agenda.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.agenda.daos.PaisDao;
import br.com.agenda.model.Pessoa;

@Controller
@RequestMapping("/paises")
public class PaisController {

	@Autowired
	private PaisDao dao;
	
	@RequestMapping(value="/consulta", method=RequestMethod.GET)
	public ModelAndView formNovo(Pessoa pessoa) {
		ModelAndView mv = new ModelAndView("paises/consulta");
		mv.addObject("paises", dao.list());
		System.out.println("paises.list();");
		return mv;
	}
}
