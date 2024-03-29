package com.uca.capas.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.domain.Empleado;

public interface EmpleadoService {

	public List<Empleado> findAllEmpleados();
	
	public Empleado findEmpleadoById(Integer id);
	
}
