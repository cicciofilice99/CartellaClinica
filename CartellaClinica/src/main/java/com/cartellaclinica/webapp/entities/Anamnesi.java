package com.cartellaclinica.webapp.entities;

import java.io.Serializable;
import java.sql.Clob;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CC_ANAMNESI")
public class Anamnesi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_ANAMNESI")
	private Integer IdAnamnesi;
	@Column(name = "FK_CART_CLIN")
	private Integer FkCartellaClinica;
	@Column(nullable = true, name = "DATA_ANAMNESI")
	private Date DataAnamnesi;
	@Column(nullable = true, name = "ANAMNESI_DESC_OLD")
	private String AnamnesiDescOld;
	@Column(nullable = true, name = "FK_REPARTO")
	private Integer FkReparto;
	@Column(nullable = true, name = "PUBBLICA")
	private String Pubblica;
	@Column(nullable = true, name = "FLAG_ANNULLATO")
	private String FlagAnnullato;
	@Column(nullable = true, name = "ANAMNESI_DESC")
	private Clob AnamnesiDesc;

	@Override
	public String toString() {
		return "Anamnesi [IdAnamnesi=" + IdAnamnesi + ", FkCartellaClinica=" + FkCartellaClinica + ", DataAnamnesi="
				+ DataAnamnesi + ", AnamnesiDescOld=" + AnamnesiDescOld + ", FkReparto=" + FkReparto + ", Pubblica="
				+ Pubblica + ", FlagAnnullato=" + FlagAnnullato + ", AnamnesiDesc=" + AnamnesiDesc + "]";
	}

	public Integer getIdAnamnesi() {
		return IdAnamnesi;
	}

	public void setIdAnamnesi(Integer idAnamnesi) {
		IdAnamnesi = idAnamnesi;
	}

	public Integer getFkCartellaClinica() {
		return FkCartellaClinica;
	}

	public void setFkCartellaClinica(Integer fkCartellaClinica) {
		FkCartellaClinica = fkCartellaClinica;
	}

	public Date getDataAnamnesi() {
		return DataAnamnesi;
	}

	public void setDataAnamnesi(Date dataAnamnesi) {
		DataAnamnesi = dataAnamnesi;
	}

	public String getAnamnesiDescOld() {
		return AnamnesiDescOld;
	}

	public void setAnamnesiDescOld(String anamnesiDescOld) {
		AnamnesiDescOld = anamnesiDescOld;
	}

	public Integer getFkReparto() {
		return FkReparto;
	}

	public void setFkReparto(Integer fkReparto) {
		FkReparto = fkReparto;
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

	public Clob getAnamnesiDesc() {
		return AnamnesiDesc;
	}

	public void setAnamnesiDesc(Clob anamnesiDesc) {
		AnamnesiDesc = anamnesiDesc;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Anamnesi() {
		// TODO Auto-generated constructor stub
	}
}
