package com.sprinboot.servicios.app.empresa.constructores.solid;

import java.util.List;

import com.sprinboot.servicios.app.empresa.constructores.exceptions.ClaseException;
import com.sprinboot.servicios.app.empresa.constructores.jsons.LibroMayorSisRest;

public interface OpcionLibroMayorSis {
	List<LibroMayorSisRest> proceso(Integer idperiodo, String anio, Integer codmes,Integer idperiodoanio,String codCuenta)throws ClaseException;

}
