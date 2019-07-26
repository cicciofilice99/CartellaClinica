package com.cartellaclinica.webapp.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RUOLI")
public class Ruoli implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_RUOLO")
	private Integer IdRuolo;
	@Column(nullable = true, name = "RUOLO_DESC")
	private String RuoloDesc;
	@Column(nullable = true, name = "FLAG_ANNULLATO")
	private String FlagAnnullato;

	public Ruoli() {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdRuolo() {
		return IdRuolo;
	}

	public void setIdRuolo(Integer idRuolo) {
		IdRuolo = idRuolo;
	}

	public String getRuoloDesc() {
		return RuoloDesc;
	}

	public void setRuoloDesc(String ruoloDesc) {
		RuoloDesc = ruoloDesc;
	}

	public String getFlagAnnullato() {
		return FlagAnnullato;
	}

	public void setFlagAnnullato(String flagAnnullato) {
		FlagAnnullato = flagAnnullato;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
