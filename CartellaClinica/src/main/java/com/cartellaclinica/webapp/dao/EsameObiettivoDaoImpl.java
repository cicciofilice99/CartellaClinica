package com.cartellaclinica.webapp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cartellaclinica.webapp.entities.EsameObiettivo;

@Repository
public class EsameObiettivoDaoImpl extends AbstractDao<EsameObiettivo, Integer> implements EsameObiettivoDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<EsameObiettivo> SelEsameObiettivoByFilter(Integer id) {
		List<EsameObiettivo> retVal = null;

		String JQPL = "SELECT e FROM EsameObiettivo e " + " INNER JOIN CartellaClinica cc "
				+ " ON e.FkCartellaClinica = cc.IdCartella " + " INNER JOIN Anagrafica a "
				+ " ON a.IdAnagrafica = cc.FkAnagrafica " + " WHERE a.IdAnagrafica = :id";

		retVal = entityManager.createQuery(JQPL).setParameter("id", id).getResultList();
		return retVal;
	}

}
