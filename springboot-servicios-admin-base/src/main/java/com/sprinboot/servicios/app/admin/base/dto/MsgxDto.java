package com.sprinboot.servicios.app.admin.base.dto;

public class MsgxDto {
	String retorno;
	String descripcion;
	Boolean isValido; //false: error  true:valido
	public String getRetorno() {
		return retorno;
	}
	public void setRetorno(String retorno) {
		this.retorno = retorno;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Boolean getIsValido() {
		return isValido;
	}
	public void setIsValido(Boolean isValido) {
		this.isValido = isValido;
	}
	
	
	
}
