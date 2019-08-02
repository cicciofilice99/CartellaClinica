package com.cartellaclinica.webapp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cartellaclinica.webapp.entities.CartellaClinica;

@Repository
public class CartellaClinicaDaoImpl extends AbstractDao<CartellaClinica, Integer> implements CartellaClinicaDao {

	@Override
	public CartellaClinica SelCartellaClinicaPazienteByFilter(Integer id) {
		CartellaClinica cartellaClinica = null;
		String JPQL = "SELECT cc FROM CartellaClinica cc " + " INNER JOIN Anagrafica a "
				+ " ON cc.FkAnagrafica = a.IdAnagrafica " + " WHERE a.IdAnagrafica = :id ";
		cartellaClinica = (CartellaClinica) entityManager.createQuery(JPQL).setParameter("id", id).getSingleResult();
		return cartellaClinica;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CartellaClinica> SelTutti() {
		List<CartellaClinica> retVal;
		String JPQL = "SELECT c FROM CartellaClinica c ORDER BY c.IdCartella";
		retVal = entityManager.createQuery(JPQL).getResultList();
		return retVal;
	}

}
