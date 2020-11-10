package com.sprinboot.servicios.app.empresa.constructores.dto;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

public class LibroDiarioDetDto {
	
    private Integer numAsiento;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern ="yyyy-MM-dd")
	private Date fechaAsiento;

	
	private Integer idPeriodo;
	
	private String anio;
	
	private Integer codMes;
	
	
	private String codOrigen ;

	private String codPlan;
	
	private String nomPlan;
	
	private BigDecimal debe;
	
	private BigDecimal haber;
	
	private String abreNomMoneda;
	
	private String tipoCambio;
	
	private BigDecimal equivalente;
	
	private String codDocumento;
	
	private String serieNumero;
	
	private String codRuc;
	
	private String razonSocial;
	
	private String codUnidadNegocio;
	
	private String glosario;
	
	@DateTimeFormat(pattern ="yyyy-MM-dd")
	private Date fechaEmision;
	
	@DateTimeFormat(pattern ="yyyy-MM-dd")
	private Date fechaVencimiento;
	
	private String codTipoDoc;
	
	private String nomUnidadNegocio;
	
	private Integer estadoVoucher;

 
	public String getCodPlan() {
		return codPlan;
	}

	public void setCodPlan(String codPlan) {
		this.codPlan = codPlan;
	}

	public String getNomPlan() {
		return nomPlan;
	}

	public void setNomPlan(String nomPlan) {
		this.nomPlan = nomPlan;
	}

	public BigDecimal getDebe() {
		return debe;
	}

	public void setDebe(BigDecimal debe) {
		this.debe = debe;
	}

	public BigDecimal getHaber() {
		return haber;
	}

	public void setHaber(BigDecimal haber) {
		this.haber = haber;
	}

	public String getAbreNomMoneda() {
		return abreNomMoneda;
	}

	public void setAbreNomMoneda(String abreNomMoneda) {
		this.abreNomMoneda = abreNomMoneda;
	}

	public String getTipoCambio() {
		return tipoCambio;
	}

	public void setTipoCambio(String tipoCambio) {
		this.tipoCambio = tipoCambio;
	}

	public BigDecimal getEquivalente() {
		return equivalente;
	}

	public void setEquivalente(BigDecimal equivalente) {
		this.equivalente = equivalente;
	}

	public String getCodDocumento() {
		return codDocumento;
	}

	public void setCodDocumento(String codDocumento) {
		this.codDocumento = codDocumento;
	}

	public String getSerieNumero() {
		return serieNumero;
	}

	public void setSerieNumero(String serieNumero) {
		this.serieNumero = serieNumero;
	}

	public String getCodRuc() {
		return codRuc;
	}

	public void setCodRuc(String codRuc) {
		this.codRuc = codRuc;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getCodUnidadNegocio() {
		return codUnidadNegocio;
	}

	public void setCodUnidadNegocio(String codUnidadNegocio) {
		this.codUnidadNegocio = codUnidadNegocio;
	}

	public String getGlosario() {
		return glosario;
	}

	public void setGlosario(String glosario) {
		this.glosario = glosario;
	}

	public Date getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getCodTipoDoc() {
		return codTipoDoc;
	}

	public void setCodTipoDoc(String codTipoDoc) {
		this.codTipoDoc = codTipoDoc;
	}

	public Integer getEstadoVoucher() {
		return estadoVoucher;
	}

	public void setEstadoVoucher(Integer estadoVoucher) {
		this.estadoVoucher = estadoVoucher;
	}

	public String getCodOrigen() {
		return codOrigen;
	}

	public void setCodOrigen(String codOrigen) {
		this.codOrigen = codOrigen;
	}

	public Integer getNumAsiento() {
		return numAsiento;
	}

	public void setNumAsiento(Integer numAsiento) {
		this.numAsiento = numAsiento;
	}

	public Date getFechaAsiento() {
		return fechaAsiento;
	}

	public void setFechaAsiento(Date fechaAsiento) {
		this.fechaAsiento = fechaAsiento;
	}

	public Integer getIdPeriodo() {
		return idPeriodo;
	}

	public void setIdPeriodo(Integer idPeriodo) {
		this.idPeriodo = idPeriodo;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public Integer getCodMes() {
		return codMes;
	}

	public void setCodMes(Integer codMes) {
		this.codMes = codMes;
	}

	public String getNomUnidadNegocio() {
		return nomUnidadNegocio;
	}

	public void setNomUnidadNegocio(String nomUnidadNegocio) {
		this.nomUnidadNegocio = nomUnidadNegocio;
	}

	
}
