package com.sprinboot.servicios.app.empresa.constructores.solid;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.transaction.annotation.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.sprinboot.servicios.app.empresa.constructores.dao.RegistroLibrosDao;
import com.sprinboot.servicios.app.empresa.constructores.exceptions.ClaseException;
import com.sprinboot.servicios.app.empresa.constructores.jsons.RegistrosCabRest;
import com.sprinboot.servicios.app.empresa.constructores.jsons.RegistrosDetRest;
import com.sprinboot.servicios.app.empresa.constructores.service.RegistrosSistemaServiceInterface;
import com.sprinboot.servicios.empresa.commons.entity.RegistroLibros;

@Primary
@Service("SolesMensualFecha")
public class SolesMensualFecha implements OpcionReporte{
	Logger logger = LoggerFactory.getLogger(SolesMensualFecha.class);
	
	private RegistroLibrosDao dao;
	private RegistrosSistemaServiceInterface service;
	
	@Autowired
	public SolesMensualFecha(RegistroLibrosDao dao, RegistrosSistemaServiceInterface service) {
		this.dao = dao;
		this.service = service;
	}
	
	
	@Override
	@Transactional
	public RegistrosCabRest proceso(Integer idperiodo, String anio, Integer codmes , String codLibro, String codPlanParametro) {
		List<RegistroLibros> lstRegLibros = dao.listarRegistroSistemaMensualFecha(idperiodo, codmes, anio, codLibro, codPlanParametro);
		RegistrosCabRest cab = new RegistrosCabRest();
		List<RegistrosDetRest> listDet= new ArrayList<RegistrosDetRest>();
		cab.setLstRegistrosDetRest(listDet);
		
		if (lstRegLibros.size()>0) {
			 cab = service.getRegistroCabRest(lstRegLibros,"S");
			 cab.setLstRegistrosDetRest(
					 cab.getLstRegistrosDetRest().stream().map(r->{
					        if(r.getMoneda().compareTo("D")==0) {
					        	try {
									r = service.getDolaresToSoles(r, 2);
								} catch (ClaseException e) {
									logger.info("Error al convertir dolares a soles - "+e.getMessage());
								}
					        }
						    return r;
					 }).collect(Collectors.toList())
	         ); 
		}
	  return cab;
	}

	

}
