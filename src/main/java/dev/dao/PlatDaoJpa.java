package dev.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dev.entite.Plat;

@Repository
@Profile("jpa")
public class PlatDaoJpa implements IPlatDao{
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Plat> listerPlats() {
		return em.createQuery("FROM Plat", Plat.class).getResultList();
	}

	@Override
	@Transactional
	public void ajouterPlat(String nom, Integer prix) {
		em.persist(new Plat(nom, prix));
	}

}