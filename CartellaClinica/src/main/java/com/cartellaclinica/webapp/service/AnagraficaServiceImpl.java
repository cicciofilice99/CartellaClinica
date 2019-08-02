package com.cartellaclinica.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cartellaclinica.webapp.dao.AnagraficaDao;
import com.cartellaclinica.webapp.entities.Anagrafica;

@Service("anagraficaService")
@Transactional
public class AnagraficaServiceImpl implements AnagraficaService {

	@Autowired
	private AnagraficaDao anagraficaRepository;

	@Override
	public List<Anagrafica> SelTutti() {
		return anagraficaRepository.SelTutti();
	}

	@Override
	public Anagrafica SelPazienteByFilter(Integer id) {
		return anagraficaRepository.SelPazienteByFilter(id);
	}

}
