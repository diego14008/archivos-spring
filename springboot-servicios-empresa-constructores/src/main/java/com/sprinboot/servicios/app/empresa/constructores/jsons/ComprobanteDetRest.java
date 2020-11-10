package com.sprinboot.servicios.app.empresa.constructores.jsons;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComprobanteDetRest {

	@JsonProperty("id")
    private Integer id;	
	
	@JsonProperty("estado")
	private Integer estado;
	
	@JsonProperty("username")
	private String username;
	
	@JsonProperty("comprobanteId")
	private Integer comprobanteId;
	
	@JsonProperty("asientoId")
	private Integer asientoId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getComprobanteId() {
		return comprobanteId;
	}

	public void setComprobanteId(Integer comprobanteId) {
		this.comprobanteId = comprobanteId;
	}

	public Integer getAsientoId() {
		return asientoId;
	}

	public void setAsientoId(Integer asientoId) {
		this.asientoId = asientoId;
	}
	
	
}
