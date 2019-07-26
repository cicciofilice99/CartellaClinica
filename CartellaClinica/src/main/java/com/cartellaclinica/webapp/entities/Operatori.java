package com.cartellaclinica.webapp.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OPERATORI")
public class Operatori implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID_OPERATORE")
	private Integer IdOperatore;
	@Column(name = "FK_DIPENDENTE")
	private Integer FkDipendente;
	@Column(name = "PASSWORD")
	private String Password;
	@Column(name = "STATO")
	private String Stato;
	@Column(name = "DATA_INIZIO_VAL")
	private Date DataInizioVal;
	@Column(nullable = true, name = "DATA_FINE_VAL")
	private Date DataFineVal;
	@Column(name = "USERNAME")
	private String Username;
	@Column(name = "DATA_INI_VAL_PWD")
	private Date DataIniValPwd;
	@Column(name = "GG_ATTIVI")
	private Integer GgAttivi;
	@Column(nullable = true, name = "FLAG_ANNULLATO")
	private String FlagAnnullato;

	public Operatori() {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdOperatore() {
		return IdOperatore;
	}

	public void setIdOperatore(Integer idOperatore) {
		IdOperatore = idOperatore;
	}

	public Integer getFkDipendente() {
		return FkDipendente;
	}

	public void setFkDipendente(Integer fkDipendente) {
		FkDipendente = fkDipendente;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getStato() {
		return Stato;
	}

	public void setStato(String stato) {
		Stato = stato;
	}

	public Date getDataInizioVal() {
		return DataInizioVal;
	}

	public void setDataInizioVal(Date dataInizioVal) {
		DataInizioVal = dataInizioVal;
	}

	public Date getDataFineVal() {
		return DataFineVal;
	}

	public void setDataFineVal(Date dataFineVal) {
		DataFineVal = dataFineVal;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public Date getDataIniValPwd() {
		return DataIniValPwd;
	}

	public void setDataIniValPwd(Date dataIniValPwd) {
		DataIniValPwd = dataIniValPwd;
	}

	public Integer getGgAttivi() {
		return GgAttivi;
	}

	public void setGgAttivi(Integer ggAttivi) {
		GgAttivi = ggAttivi;
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
