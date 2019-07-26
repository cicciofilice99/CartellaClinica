package com.cartellaclinica.webapp.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CARTELLA_CLINICA")
public class CartellaClinica implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID_CART_CLIN")
	private int IdCartella;
	@Column(name = "FK_ANAGRAFICA")
	private int FkAnagrafica;
	@Column(nullable = true, name = "DATA_INIZIO_VAL")
	private Date DataInizioVal;
	@Column(nullable = true, name = "DATA_FINE_VAL")
	private Date DataFineVal;
	@Column(nullable = true, name = "NOTE_CART")
	private String NoteCart;
	@Column(nullable = true, name = "DATA_MODIFICA")
	private Date DataModifica;
	@Column(nullable = true, name = "STATO_CARTELLA")
	private String StatoCartella;
	@Column(nullable = true, name = "FLAG_ANNULLATO")
	private String FlagAnnullato;

	public int getIdCartella() {
		return IdCartella;
	}

	public void setIdCartella(int idCartella) {
		IdCartella = idCartella;
	}

	public int getFkAnagrafica() {
		return FkAnagrafica;
	}

	public void setFkAnagrafica(int fkAnagrafica) {
		FkAnagrafica = fkAnagrafica;
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

	public String getNoteCart() {
		return NoteCart;
	}

	public void setNoteCart(String noteCart) {
		NoteCart = noteCart;
	}

	public Date getDataModifica() {
		return DataModifica;
	}

	public void setDataModifica(Date dataModifica) {
		DataModifica = dataModifica;
	}

	public String getStatoCartella() {
		return StatoCartella;
	}

	public void setStatoCartella(String statoCartella) {
		StatoCartella = statoCartella;
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

	public CartellaClinica() {
		// TODO Auto-generated constructor stub
	}
}
