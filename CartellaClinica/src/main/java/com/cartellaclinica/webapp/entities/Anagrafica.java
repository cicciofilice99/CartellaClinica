package com.cartellaclinica.webapp.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ANAGRAFICA")
public class Anagrafica implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID_ANAGRAFICA")
	private int IdAnagrafica;
	@Column(name = "COGNOME ")
	private String Cognome;
	@Column(name = "NOME ")
	private String Nome;
	@Column(name = "DT_NASCITA ")
	private Date DataDiNascita;
	@Column(name = "FK_COMUNE_NAS ")
	private int FkComuneNas;
	@Column(name = "SESSO ")
	private String Sesso;
	@Column(name = "CODFISCALE_CALC ")
	private String CodFiscaleCalc;

	@Column(nullable = true, name = "INDIRIZZO_RES ")
	private String IndirizzoRes;
	@Column(nullable = true, name = "FK_COMUNE_RES ")
	private int FkComuneRes;
	@Column(nullable = true, name = "INDIRIZZO_DOM ")
	private String IndirizzoDom;
	@Column(nullable = true, name = "FK_COMUNE_DOM ")
	private int FkComuneDom;
	@Column(nullable = true, name = "TESS_SANITARIA")
	private String TessSanitaria;
	@Column(nullable = true, name = "TELEFONO_ABIT ")
	private String TelefonoAbit;
	@Column(nullable = true, name = "TELEFONO_CELL ")
	private String TelefonoCell;
	@Column(nullable = true, name = "TELEFONO_UFF ")
	private String TelefonoUff;
	@Column(nullable = true, name = "TELEFONO_FAX ")
	private String TelefonoFax;
	@Column(nullable = true, name = "FK_STATO_CIV")
	private int FkStatoCiv;
	@Column(nullable = true, name = "FK_TITOLO_STUDIO ")
	private int FkTitoloStudio;
	@Column(nullable = true, name = "STP")
	private String Stp;
	@Column(nullable = true, name = "CODICE_STP ")
	private String CodiceStp;
	@Column(nullable = true, name = "CODICEFISCALE_FORZ ")
	private String CodFiscaleForz;
	@Column(nullable = true, name = "FLAG_CODFISC_FORZ")
	private String FlagCodFiscForz;
	@Column(nullable = true, name = "FLAG_ANNULLATO")
	private String FlagAnnullato;

	public int getIdAnagrafica() {
		return IdAnagrafica;
	}

	public void setIdAnagrafica(int idAnagrafica) {
		IdAnagrafica = idAnagrafica;
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

	public Date getDataDiNascita() {
		return DataDiNascita;
	}

	public void setDataDiNascita(Date dataDiNascita) {
		DataDiNascita = dataDiNascita;
	}

	public int getFkComuneNas() {
		return FkComuneNas;
	}

	public void setFkComuneNas(int fkComuneNas) {
		FkComuneNas = fkComuneNas;
	}

	public String getSesso() {
		return Sesso;
	}

	public void setSesso(String sesso) {
		Sesso = sesso;
	}

	public String getCodFiscaleCalc() {
		return CodFiscaleCalc;
	}

	public void setCodFiscaleCalc(String codFiscaleCalc) {
		CodFiscaleCalc = codFiscaleCalc;
	}

	public String getIndirizzoRes() {
		return IndirizzoRes;
	}

	public void setIndirizzoRes(String indirizzoRes) {
		IndirizzoRes = indirizzoRes;
	}

	public int getFkComuneRes() {
		return FkComuneRes;
	}

	public void setFkComuneRes(int fkComuneRes) {
		FkComuneRes = fkComuneRes;
	}

	public String getIndirizzoDom() {
		return IndirizzoDom;
	}

	public void setIndirizzoDom(String indirizzoDom) {
		IndirizzoDom = indirizzoDom;
	}

	public int getFkComuneDom() {
		return FkComuneDom;
	}

	public void setFkComuneDom(int fkComuneDom) {
		FkComuneDom = fkComuneDom;
	}

	public String getTessSanitaria() {
		return TessSanitaria;
	}

	public void setTessSanitaria(String tessSanitaria) {
		TessSanitaria = tessSanitaria;
	}

	public String getTelefonoAbit() {
		return TelefonoAbit;
	}

	public void setTelefonoAbit(String telefonoAbit) {
		TelefonoAbit = telefonoAbit;
	}

	public String getTelefonoCell() {
		return TelefonoCell;
	}

	public void setTelefonoCell(String telefonoCell) {
		TelefonoCell = telefonoCell;
	}

	public String getTelefonoUff() {
		return TelefonoUff;
	}

	public void setTelefonoUff(String telefonoUff) {
		TelefonoUff = telefonoUff;
	}

	public String getTelefonoFax() {
		return TelefonoFax;
	}

	public void setTelefonoFax(String telefonoFax) {
		TelefonoFax = telefonoFax;
	}

	public int getFkStatoCiv() {
		return FkStatoCiv;
	}

	public void setFkStatoCiv(int fkStatoCiv) {
		FkStatoCiv = fkStatoCiv;
	}

	public int getFkTitoloStudio() {
		return FkTitoloStudio;
	}

	public void setFkTitoloStudio(int fkTitoloStudio) {
		FkTitoloStudio = fkTitoloStudio;
	}

	public String getStp() {
		return Stp;
	}

	public void setStp(String stp) {
		Stp = stp;
	}

	public String getCodiceStp() {
		return CodiceStp;
	}

	public void setCodiceStp(String codiceStp) {
		CodiceStp = codiceStp;
	}

	public String getCodFiscaleForz() {
		return CodFiscaleForz;
	}

	public void setCodFiscaleForz(String codFiscaleForz) {
		CodFiscaleForz = codFiscaleForz;
	}

	public String getFlagCodFiscForz() {
		return FlagCodFiscForz;
	}

	public void setFlagCodFiscForz(String flagCodFiscForz) {
		FlagCodFiscForz = flagCodFiscForz;
	}

	public String getFlagAnnullato() {
		return FlagAnnullato;
	}

	public void setFlagAnnullato(String flagAnnullato) {
		FlagAnnullato = flagAnnullato;
	}

	public Anagrafica() {
		// TODO Auto-generated constructor stub
	}

}
