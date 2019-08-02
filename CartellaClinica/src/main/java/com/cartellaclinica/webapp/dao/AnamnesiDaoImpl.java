package com.cartellaclinica.webapp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cartellaclinica.webapp.entities.Anamnesi;

@Repository
public class AnamnesiDaoImpl extends AbstractDao<Anamnesi, Integer> implements AnamnesiDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Anamnesi> SelAnamnesiByFilter(Integer id) {
		List<Anamnesi> retVal;
		String JQPL = "SELECT an FROM Anamnesi an " + " INNER JOIN CartellaClinica cc "
				+ " ON cc.IdCartella == an.FkCartellaClinica" + " INNER JOIN Anagrafica a "
				+ " ON a.IdAnagrafica = cc.FkAnagrafica " + "WHERE a.IdAnagrafica = :id";

		retVal = entityManager.createQuery(JQPL).setParameter("id", id).getResultList();
		return retVal;
	}

}
