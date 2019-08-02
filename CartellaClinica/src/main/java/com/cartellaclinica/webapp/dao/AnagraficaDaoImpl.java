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
//
		String JPQL = "SELECT a FROM Anagrafica a INNER JOIN CartellaClinica cc ON cc.FkAnagrafica = a.IdAnagrafica ORDER BY a.IdAnagrafica";
		retVal = entityManager.createQuery(JPQL).setFirstResult(0).setMaxResults(100).getResultList();
//
		return retVal;

	}

	@Override
	public Anagrafica SelPazienteByFilter(Integer id) {
		Anagrafica anagrafica = null;

		String JPQL = "SELECT a FROM Anagrafica a INNER JOIN CartellaClinica cc ON cc.FkAnagrafica = a.IdAnagrafica WHERE a.IdAnagrafica = :id";

		anagrafica = (Anagrafica) entityManager.createQuery(JPQL).setParameter("id", id).getSingleResult();

		return anagrafica;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Anagrafica> SelPazientiUltimiInseriti() {
		List<Anagrafica> retVal;
		String JPQL = "SELECT a FROM Anagrafica a INNER JOIN CartellaClinica cc ON cc.FkAnagrafica = a.IdAnagrafica ORDER BY cc.DataInizioVal DESC";
		retVal = entityManager.createQuery(JPQL).setFirstResult(0).setMaxResults(10).getResultList();
		return retVal;
	}
}
