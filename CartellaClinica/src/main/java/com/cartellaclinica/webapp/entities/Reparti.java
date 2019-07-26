package com.cartellaclinica.webapp.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REPARTI")
public class Reparti implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_REPARTO")
	private Integer IdReparto;
	@Column(nullable = true, name = "REPARTO_DESC")
	private String RepartoDesc;
	@Column(nullable = true, name = "FK_STRUTTURA")
	private Integer FkStruttura;
	@Column(nullable = true, name = "NUM_REPARTO")
	private Integer NumReparto;
	@Column(nullable = true, name = "FLAG_ANNULLATO")
	private String FlagAnnullato;
	@Column(nullable = true, name = "COD_REPARTO")
	private String CodReparto;

	public Reparti() {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdReparto() {
		return IdReparto;
	}

	public void setIdReparto(Integer idReparto) {
		IdReparto = idReparto;
	}

	public String getRepartoDesc() {
		return RepartoDesc;
	}

	public void setRepartoDesc(String repartoDesc) {
		RepartoDesc = repartoDesc;
	}

	public Integer getFkStruttura() {
		return FkStruttura;
	}

	public void setFkStruttura(Integer fkStruttura) {
		FkStruttura = fkStruttura;
	}

	public Integer getNumReparto() {
		return NumReparto;
	}

	public void setNumReparto(Integer numReparto) {
		NumReparto = numReparto;
	}

	public String getFlagAnnullato() {
		return FlagAnnullato;
	}

	public void setFlagAnnullato(String flagAnnullato) {
		FlagAnnullato = flagAnnullato;
	}

	public String getCodReparto() {
		return CodReparto;
	}

	public void setCodReparto(String codReparto) {
		CodReparto = codReparto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
