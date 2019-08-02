package com.cartellaclinica.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cartellaclinica.webapp.dao.EsameObiettivoDao;
import com.cartellaclinica.webapp.entities.EsameObiettivo;

@Service("esameObiettivoService")
@Transactional
public class EsameObiettivoServiceImpl implements EsameObiettivoService {

	@Autowired
	private EsameObiettivoDao esameObiettivoDao;

	@Override
	public List<EsameObiettivo> SelEsameObiettivoByFilter(Integer id) {
		return esameObiettivoDao.SelEsameObiettivoByFilter(id);
	}

	@Override
	public List<EsameObiettivo> SelTutti() {
		return esameObiettivoDao.SelTutti();
	}

}
