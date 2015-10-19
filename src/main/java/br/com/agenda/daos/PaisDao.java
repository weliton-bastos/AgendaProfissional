package br.com.agenda.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.agenda.model.Pais;

@Repository
public class PaisDao {

	@PersistenceContext
	private EntityManager manager;
	
	public List<Pais> list() {
		return manager.createQuery("select p from Pais p", Pais.class).getResultList();
	}
}
