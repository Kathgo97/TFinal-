package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uca.capas.domain.Sucursal;
import com.uca.capas.repositories.SucursalRepository;

@Service
public class SucursalServiceImpl implements SucursalService {
	@Autowired
	SucursalRepository sucursalrepository;

	@Override
	public List<Sucursal> getAllSucursales() {
		// TODO Auto-generated method stub
		return sucursalrepository.findAll();
	}

	@Override
	public Sucursal getSucursalBySCodigo(int sCodigo) {
		// TODO Auto-generated method stub
		return sucursalrepository.findOne(sCodigo);
	}

	@Override
	public void deleteSucursal(int sCodigo) {
		// TODO Auto-generated method stub
		sucursalrepository.delete(sCodigo);
	}

	@Override
	public Sucursal saveSucursal(Sucursal sucursal) {
		// TODO Auto-generated method stub
		return sucursalrepository.save(sucursal);
	}
}
	
	
	
