package com.sprinboot.servicios.app.empresa.sis.service;

import java.math.BigDecimal;
import java.util.List;

import com.sprinboot.servicios.app.empresa.sis.dto.PersonaDto;
import com.sprinboot.servicios.empresa.commons.entity.Asiento;
import com.sprinboot.servicios.empresa.commons.entity.Comprobante;
import com.sprinboot.servicios.empresa.commons.services.IObjectService;

public interface ComprobanteServiceInterface extends IObjectService<Comprobante>  {
	public List<Asiento> comprobantesSinRegistrar(String anio);
	public List<Asiento> listarAsientosPorNumComprobante(Integer numComprobante , String anio) ;
	public BigDecimal sumaAsientos(List<Asiento> lista,String caja , String bancos);
	public Comprobante saveGuardarComprobante(Comprobante request) throws Exception ;
	public PersonaDto getDatosPersonales(String codigoRuc);
	public Comprobante getComprobante(String anio,Integer numcomprobante);
	public List<Comprobante> listarComprobante(String anio);
	public List<Comprobante> ultimaFecha(Integer numcomprobante, String anio);
}
