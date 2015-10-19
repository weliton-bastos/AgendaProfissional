package br.com.agenda.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.agenda.model.Pessoa;

@Repository
public class PessoaDao {

	@PersistenceContext
	private EntityManager manager;
	
	public void save(Pessoa pessoa) {
		manager.persist(pessoa);
	}
	

}
