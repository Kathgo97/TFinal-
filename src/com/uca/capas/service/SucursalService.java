package com.uca.capas.service;

import java.util.List;

import com.uca.capas.domain.Sucursal;

public interface SucursalService {
	
	public List<Sucursal> getAllSucursales();
	
	public Sucursal getSucursalBySCodigo(int sCodigo);
	
	public void deleteSucursal(int sCodigo);
	
	public Sucursal saveSucursal(Sucursal sucursal);
	
}

