package com.sprinboot.servicios.app.empresa.constructores.solid;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sprinboot.servicios.app.empresa.constructores.dto.ConsistenciaDto;
import com.sprinboot.servicios.empresa.commons.entity.Asiento;

public interface FilaConsistencia{
	List<ConsistenciaDto> proceso(List<ConsistenciaDto> lst,Asiento asiento);
}