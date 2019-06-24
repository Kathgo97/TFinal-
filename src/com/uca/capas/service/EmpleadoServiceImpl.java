package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Empleado;
import com.uca.capas.repositories.EmpleadoRepository;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	EmpleadoRepository empleadoRepository;
	
	@Override
	public List<Empleado> findAllEmpleados() {
		// TODO Auto-generated method stub
		return empleadoRepository.findAll() ;
	}

	@Override
	public Empleado findEmpleadoById(Integer id) {
		// TODO Auto-generated method stub
		return  empleadoRepository.findOne(id);
	}

}
