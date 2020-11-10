package com.sprinboot.servicios.app.empresa.oriana.service;

import java.util.List;

import com.sprinboot.servicios.app.empresa.oriana.dto.CuentaDetalladaDto;
import com.sprinboot.servicios.app.empresa.oriana.dto.LEDMCuentaDto;
import com.sprinboot.servicios.app.empresa.oriana.exceptions.ClaseException;
import com.sprinboot.servicios.app.empresa.oriana.jsons.HojaTrabajoDetRest;
import com.sprinboot.servicios.app.empresa.oriana.jsons.HojaTrabajoPerdidaRest;
import com.sprinboot.servicios.app.empresa.oriana.jsons.HojaTrabajoRest;
import com.sprinboot.servicios.app.empresa.oriana.jsons.HojaTrabajoSumasRest;
import com.sprinboot.servicios.app.empresa.oriana.jsons.HojaTrabajoTotalesRest;
import com.sprinboot.servicios.app.empresa.oriana.solid.OpcionHojaTrabajo;
import com.sprinboot.servicios.empresa.commons.entity.Voucher;

public interface HojaTrabajoServiceInterface {
	public HojaTrabajoRest reporteRegistros(List<OpcionHojaTrabajo> lstOpcion, Integer idperiodo, String anio,
			Integer codmes, Integer idperiodoanio) throws ClaseException;

	public HojaTrabajoDetRest getHojaTrabajoDetPrimeroCuatroColumnas(List<Voucher> lista, String moneda,
			HojaTrabajoDetRest det) throws ClaseException;

	public List<Voucher> filtroDaoMensual(String codcuenta, Integer idperiodo, String anio, Integer codmes)
			throws ClaseException;

	public LEDMCuentaDto getDatosMontosMayor(List<Voucher> listVoucher, String moneda) throws ClaseException;

	public List<CuentaDetalladaDto> filtroCuentasMicroservicioAdministracion(String nivelcuenta, String anio,
			Integer idperiodoanio) throws ClaseException;

	public HojaTrabajoDetRest getHojaTrabajoDetQuintaSextaColumnaInventarios(HojaTrabajoDetRest det, String tipoCuenta)
			throws ClaseException;

	public HojaTrabajoDetRest getHojaTrabajoDetSeptimaOctavaColumnaNaturaleza(HojaTrabajoDetRest det, String tipoCuenta)
			throws ClaseException;
	
	 public HojaTrabajoDetRest getHojaTrabajoDetNovenaDecimaColumnaFuncion(HojaTrabajoDetRest det, String tipoCuenta ) throws ClaseException ;
	 
	 public HojaTrabajoTotalesRest getTotales(List<HojaTrabajoDetRest> list) throws ClaseException;
	 
	 public HojaTrabajoPerdidaRest getPerdidadEjercicio(HojaTrabajoTotalesRest totales) throws ClaseException;
	 
	 public HojaTrabajoSumasRest getSumaIguales(HojaTrabajoTotalesRest totales, HojaTrabajoPerdidaRest perdida) throws ClaseException;
	 
	 public List<Voucher> filtroDaoAcumulado(String codcuenta,String anio,	Integer codmes) throws ClaseException;
}
