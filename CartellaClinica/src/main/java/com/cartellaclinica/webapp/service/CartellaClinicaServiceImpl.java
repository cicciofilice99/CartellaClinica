package com.cartellaclinica.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cartellaclinica.webapp.dao.CartellaClinicaDao;
import com.cartellaclinica.webapp.entities.CartellaClinica;

@Service("cartellaClinicaService")
@Transactional
public class CartellaClinicaServiceImpl implements CartellaClinicaService {

	@Autowired
	private CartellaClinicaDao cartellaClinicaRepository;

	@Override
	public List<CartellaClinica> SelTutti() {
		return cartellaClinicaRepository.SelTutti();
	}

	@Override
	public CartellaClinica SelCartellaClinicaPazienteByFilter(Integer id) {
		return cartellaClinicaRepository.SelCartellaClinicaPazienteByFilter(id);
	}

}
