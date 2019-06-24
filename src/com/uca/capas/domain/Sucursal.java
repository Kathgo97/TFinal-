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
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

import java.util.List;

@Entity
@Table(schema="public",name="sucursal")

public class Sucursal {

	@Id
	@GeneratedValue(generator="sucursal_s_codigo_seq",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="sucursal_s_codigo_seq",sequenceName="public.sucursal_s_codigo_seq",allocationSize = 1)
	@Column(name="s_codigo")
	private Integer sCodigo;
	
	@NotNull
	@NotEmpty(message = "Este campo no puede quedar vacio")
	@Column(name="s_nombre")
	private String sNombre;
	
	@NotNull
	@NotEmpty(message = "Este campo no puede quedar vacio")
	@Column(name="s_ubicacion")
	private String ubicacion;
	
	@NotNull
	@NotEmpty(message = "Este campo no puede quedar vacio")
	@Column(name="s_horarioa")
	private String horarioa;
	
	@NotNull
	@NotEmpty(message = "Este campo no puede quedar vacio")
	@Column(name="s_horarioc")
	private String horarioc;
	
	@NotNull
	@Column(name="s_nmesas")
	@Min(value = 0)
	@PositiveOrZero
	private Integer nmesas;
	
	
	@NotNull
	@NotEmpty(message = "Este campo no puede quedar vacio")
	@Column(name="s_nomgerente")
	private String gerente;
	
	@OneToMany(mappedBy="sucursal", fetch=FetchType.EAGER)
	private List<Empleado> empleados;

	public Sucursal() {
		// TODO Auto-generated constructor stub
	}

	public Sucursal(Integer sCodigo, String sNombre, String ubicacion, String horarioa, String horarioc, Integer nmesas,
			String gerente, List<Empleado> empleados) {
		super();
		this.sCodigo = sCodigo;
		this.sNombre = sNombre;
		this.ubicacion = ubicacion;
		this.horarioa = horarioa;
		this.horarioc = horarioc;
		this.nmesas = nmesas;
		this.gerente = gerente;
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

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getHorarioa() {
		return horarioa;
	}

	public void setHorarioa(String horarioa) {
		this.horarioa = horarioa;
	}

	public String getHorarioc() {
		return horarioc;
	}

	public void setHorarioc(String horarioc) {
		this.horarioc = horarioc;
	}

	public Integer getNmesas() {
		return nmesas;
	}

	public void setNmesas(Integer nmesas) {
		this.nmesas = nmesas;
	}

	public String getGerente() {
		return gerente;
	}

	public void setGerente(String gerente) {
		this.gerente = gerente;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	

	
}