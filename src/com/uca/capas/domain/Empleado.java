package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema="public",name="empleado")

public class Empleado {
	@Id
	@GeneratedValue(generator="empleado_e_codigo_seq",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="empleado_e_codigo_seq",sequenceName="public.empleado_e_codigo_seq",allocationSize = 1)
	@Column(name="e_codigo")
	private Integer eCodigo;
	
	@Column(name="e_nombre")
	private String eNombre;
	
	@Column(name="e_edad")
	private Integer edad;
	
	@Column(name="e_genero")
	private String genero;
	
	@Column(name="e_estado")
	private Boolean estado;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="s_codigo")
	private Sucursal sucursal;
	
	
	public Empleado(Integer eCodigo, String eNombre, Integer edad, String genero, Boolean estado) {
		super();
		this.eCodigo = eCodigo;
		this.eNombre = eNombre;
		this.edad = edad;
		this.genero = genero;
		this.estado = estado;
	}
	
	public Empleado() {
		super();
	}
	public Sucursal sucursal() {
		return sucursal;
	}
	
	public void setsucursal(Sucursal sucursal) {
		this.sucursal= sucursal; 
	}
	
	
	public Integer geteCodigo() {
		return eCodigo;
	}

	public void seteCodigo(Integer eCodigo) {
		this.eCodigo = eCodigo;
	}

	public String geteNombre() {
		return eNombre;
	}

	public void seteNombre(String eNombre) {
		this.eNombre = eNombre;
	}
	public Integer getedad() {
		return edad;
	}

	public void setedad(Integer edad) {
		this.edad = edad;
	}
	
	public Boolean getestado() {
		return estado;
	}

	public void setestado(Boolean estado) {
		this.estado = estado;
	}

	public String getgenero() {
		return genero;
	}

	public void setgenero(String genero) {
		this.genero = genero;
	}
	
	public String getestadoDelegate() {
		if(this.estado == null) return "";
		else {
			return estado == true ?"Activo":"Inactivo";
		}
	}
}
