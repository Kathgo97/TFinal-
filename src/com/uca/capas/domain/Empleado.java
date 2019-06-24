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

	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	public Empleado(Integer eCodigo, String eNombre, Integer edad, String genero, Boolean estado, Sucursal sucursal) {
		super();
		this.eCodigo = eCodigo;
		this.eNombre = eNombre;
		this.edad = edad;
		this.genero = genero;
		this.estado = estado;
		this.sucursal = sucursal;
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

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	public String getEstadoDelegate() {
		return this.estado == null ? "" : this.estado == true ? "Activo" : "Inactivo";
	}

}

	
