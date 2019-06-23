package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import java.util.List;

@Entity
@Table(schema="public",name="sucursal")

public class Sucursal {

	@Id
	@GeneratedValue(generator="sucursal_s_codigo_seq",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="sucursal_s_codigo_seq",sequenceName="public.sucursal_s_codigo_seq",allocationSize = 1)
	@Column(name="s_codigo")
	private Integer sCodigo;
	
	@Column(name="s_nombre")
	private String sNombre;
	
	@Column(name="s_ubicacion")
	private String ubicacion;
	
	@Column(name="s_horarioa")
	private String horarioa;
	
	@Column(name="s_horarioc")
	private String horarioc;
	
	@Column(name="s_nmesas")
	private Integer nmesas;
	
	@Column(name="s_nomgerente")
	private String gerente;
	
	@OneToMany(mappedBy="sucursal", fetch=FetchType.EAGER)
	private List<Empleado> empleados;
	
	public Sucursal() {
	}
	
	public List<Empleado> getempleados() {
		return empleados;
	}

	public void setEmployeesList(List<Empleado> empleados) {
		this.empleados = empleados;
	}


	public Integer getsCodigo() {
		return sCodigo;
	}

	public void setsCodigo(Integer sCodigo) {
		this.sCodigo = sCodigo;
	}

	public String getsNombre() {
		return sNombre;
	}

	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}
	
	public String getubicacion() {
		return ubicacion;
	}

	public void setubicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	

	public String gethorarioa() {
		return horarioa;
	}

	public void sethorarioa(String horarioa) {
		this.horarioa = horarioa;
	}
	
	public String gethorarioc() {
		return horarioc;
	}

	public void sethorarioc(String horarioc) {
		this.horarioc = horarioc;
	}
	
	public Integer getsnmesas() {
		return nmesas;
	}

	public void setnmesas(Integer nmesas) {
		this.nmesas = nmesas;
	}

	public String getgerente() {
		return gerente;
	}

	public void setgerente(String gerente) {
		this.gerente= gerente;
	}
}
