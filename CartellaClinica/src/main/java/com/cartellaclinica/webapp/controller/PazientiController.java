package com.cartellaclinica.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cartellaclinica.webapp.service.AnagraficaService;

@Controller
@RequestMapping("/pazienti")
public class PazientiController {

	@Autowired
	private AnagraficaService anagraficaService;

}
