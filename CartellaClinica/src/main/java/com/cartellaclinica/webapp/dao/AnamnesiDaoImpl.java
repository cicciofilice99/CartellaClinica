package com.cartellaclinica.webapp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cartellaclinica.webapp.entities.Anamnesi;

@Repository
public class AnamnesiDaoImpl extends AbstractDao<Anamnesi, Integer> implements AnamnesiDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Anamnesi> SelAnamnesiByFilter(Integer id) {
		List<Anamnesi> retVal = null;
		String JQPL1 = "SELECT anamnesi FROM Anamnesi anamnesi " + "	INNER JOIN CartellaClinica cc "
				+ "	ON cc.IdCartella = anamnesi.FkCartellaClinica" + "	INNER JOIN Anagrafica a "
				+ "	ON a.IdAnagrafica = cc.FkAnagrafica" + "	WHERE a.IdAnagrafica = :id";
		retVal = entityManager.createQuery(JQPL1).setParameter("id", id).getResultList();
		return retVal;
	}

}
