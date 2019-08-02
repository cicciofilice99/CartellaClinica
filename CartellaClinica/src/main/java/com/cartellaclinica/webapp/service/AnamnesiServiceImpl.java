package com.cartellaclinica.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cartellaclinica.webapp.dao.AnamnesiDao;
import com.cartellaclinica.webapp.entities.Anamnesi;

@Service("anamnesiService")
@Transactional
public class AnamnesiServiceImpl implements AnamnesiService {

	@Autowired
	private AnamnesiDao anamnesiDao;

	@Override
	public List<Anamnesi> SelAnamnesiByFilter(Integer id) {
		return anamnesiDao.SelAnamnesiByFilter(id);
	}

}
