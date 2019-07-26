package com.cartellaclinica.webapp.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DIPENDENTI")
public class Dipendenti implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID_DIPENDENTE")
	private Integer IdDipendente;
	@Column(nullable = true, name = "COGNOME")
	private String Cognome;
	@Column(nullable = true, name = "NOME")
	private String Nome;
	@Column(nullable = true, name = "FK_RUOLO")
	private Integer FkRuolo;
	@Column(nullable = true, name = "TELEFONO_UFF")
	private String TelefonoUff;
	@Column(nullable = true, name = "TELEFONO_CELL")
	private String TelefonoCell;
	@Column(nullable = true, name = "MAIL")
	private String Mail;
	@Column(nullable = true, name = "SESSO")
	private String Sesso;
	@Column(nullable = true, name = "STATO")
	private String Stato;
	@Column(nullable = true, name = "MATRICOLA")
	private String Matricola;
	@Column(nullable = true, name = "FLAG_ANNULLATO")
	private String FlagAnnullato;

	public Dipendenti() {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdDipendente() {
		return IdDipendente;
	}

	public void setIdDipendente(Integer idDipendente) {
		IdDipendente = idDipendente;
	}

	public String getCognome() {
		return Cognome;
	}

	public void setCognome(String cognome) {
		Cognome = cognome;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Integer getFkRuolo() {
		return FkRuolo;
	}

	public void setFkRuolo(Integer fkRuolo) {
		FkRuolo = fkRuolo;
	}

	public String getTelefonoUff() {
		return TelefonoUff;
	}

	public void setTelefonoUff(String telefonoUff) {
		TelefonoUff = telefonoUff;
	}

	public String getTelefonoCell() {
		return TelefonoCell;
	}

	public void setTelefonoCell(String telefonoCell) {
		TelefonoCell = telefonoCell;
	}

	public String getMail() {
		return Mail;
	}

	public void setMail(String mail) {
		Mail = mail;
	}

	public String getSesso() {
		return Sesso;
	}

	public void setSesso(String sesso) {
		Sesso = sesso;
	}

	public String getStato() {
		return Stato;
	}

	public void setStato(String stato) {
		Stato = stato;
	}

	public String getMatricola() {
		return Matricola;
	}

	public void setMatricola(String matricola) {
		Matricola = matricola;
	}

	public String getFlagAnnullato() {
		return FlagAnnullato;
	}

	public void setFlagAnnullato(String flagAnnullato) {
		FlagAnnullato = flagAnnullato;
	}

}
