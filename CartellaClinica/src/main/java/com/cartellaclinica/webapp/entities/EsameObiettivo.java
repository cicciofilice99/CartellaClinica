package com.cartellaclinica.webapp.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CC_ESAME_OBIETTIVO")
public class EsameObiettivo implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID_ESA_OBIETT")
	private Integer IdEsameObiettivo;
	@Column(name = "FK_CART_CLIN")
	private Integer FkCartellaClinica;
	@Column(nullable = true, name = "FK_REPARTO")
	private Integer FkReparto;
	@Column(nullable = true, name = "DATA_ESAME_OB")
	private Date DataEsameObiettivo;
	@Column(nullable = true, name = "ESAME_OBIETTIVO_DESC")
	private String EsameObiettivoDesc;
	@Column(nullable = true, name = "PUBBLICA")
	private String Pubblica;
	@Column(nullable = true, name = "FLAG_ANNULLATO")
	private String FlagAnnullato;

	public int getIdEsameObiettivo() {
		return IdEsameObiettivo;
	}

	public void setIdEsameObiettivo(Integer idEsameObiettivo) {
		IdEsameObiettivo = idEsameObiettivo;
	}

	public Integer getFkCartellaClinica() {
		return FkCartellaClinica;
	}

	public void setFkCartellaClinica(Integer fkCartellaClinica) {
		FkCartellaClinica = fkCartellaClinica;
	}

	public int getFkReparto() {
		return FkReparto;
	}

	public void setFkReparto(Integer fkReparto) {
		FkReparto = fkReparto;
	}

	public Date getDataEsameObiettivo() {
		return DataEsameObiettivo;
	}

	public void setDataEsameObiettivo(Date dataEsameObiettivo) {
		DataEsameObiettivo = dataEsameObiettivo;
	}

	public String getEsameObiettivoDesc() {
		return EsameObiettivoDesc;
	}

	public void setEsameObiettivoDesc(String esameObiettivoDesc) {
		EsameObiettivoDesc = esameObiettivoDesc;
	}

	public String getPubblica() {
		return Pubblica;
	}

	public void setPubblica(String pubblica) {
		Pubblica = pubblica;
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

	public EsameObiettivo() {
		// TODO Auto-generated constructor stub
	}
}
