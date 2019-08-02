package com.cartellaclinica.webapp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cartellaclinica.webapp.entities.Anagrafica;

@Repository
public class AnagraficaDaoImpl extends AbstractDao<Anagrafica, Integer> implements AnagraficaDao {
	@SuppressWarnings("unchecked")
	@Override
	public List<Anagrafica> SelTutti() {
		// return super.SelTutti();

		List<Anagrafica> retVal;

		String JPQL = "SELECT a FROM Anagrafica a ORDER BY a.IdAnagrafica";

		retVal = entityManager.createQuery(JPQL).getResultList();

		return retVal;
	}

	@Override
	public Anagrafica SelPazienteByFilter(Integer id) {
		Anagrafica anagrafica = null;

		String JPQL = "SELECT a FROM Anagrafica a WHERE a.IdAnagrafica = :id";

		anagrafica = (Anagrafica) entityManager.createQuery(JPQL).setParameter("id", id).getSingleResult();

		return anagrafica;
	}
}
