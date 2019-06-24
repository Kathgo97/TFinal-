package com.uca.capas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

import javax.validation.Valid;

import com.uca.capas.domain.Empleado;
import com.uca.capas.domain.Sucursal;
import com.uca.capas.domain.Usuario;
import com.uca.capas.service.SucursalService;
import com.uca.capas.service.UsuarioService;

@Controller
public class MainController {

	@Autowired
	UsuarioService usuarioService;
	
	@Autowired
	SucursalService sucursalService;

	@GetMapping("/")
	public ModelAndView initLogin() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		return mav;
	}

	@GetMapping("/login")
	public ModelAndView initLoginA() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		return mav;
	}

	@GetMapping("/home")
	public ModelAndView initHome() {
		
		ModelAndView mav = new ModelAndView();
		List<Sucursal> sucursales = null;
		
		try{
			sucursales = sucursalService.getAllSucursales();
		}catch(Exception e) {
			
		}
		mav.addObject("sucursales", sucursales);
		mav.setViewName("home");
		System.out.print(sucursalService.getAllSucursales());
		return mav;
	}
	
	@RequestMapping("/perfil")
	public ModelAndView initPerfil(@RequestParam("id") Integer id) {
		ModelAndView mav = new ModelAndView();
		
		try{
			Sucursal sucursales = new Sucursal();
			List<Empleado> empleados = null; 
			sucursales = sucursalService.getSucursalBySCodigo(id);
			empleados= sucursales.getEmpleados();
			mav.addObject("sucursales", sucursales);
			mav.addObject("empleados", empleados);
			mav.setViewName("perfil");
			
		}catch(Exception e) {
			mav.setViewName("redirect:/home");
		}
	
		return mav;
	}

	@RequestMapping("/agregar")
	public ModelAndView insert() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("sucursal", new Sucursal());
		mav.setViewName("agregar");
		return mav;
	}

	@RequestMapping("/guardar")
	public ModelAndView save(@Valid @ModelAttribute Sucursal sucursal, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		if (result.hasErrors()) {
			mav.setViewName("agregar");
		} else {
			System.out.print(sucursal.getsNombre());
			sucursalService.saveSucursal(sucursal);
			mav.setViewName("redirect:/home");
			return mav;
		}
		return mav;
	}

	@RequestMapping("/editar")
	public ModelAndView edit(@RequestParam("id") Integer id) {
		ModelAndView mav = new ModelAndView();
		Sucursal sucursal = new Sucursal();
		try {
			sucursal = sucursalService.getSucursalBySCodigo(id);
			sucursalService.deleteSucursal(id);
		} catch (Exception e) {
			mav.addObject("message", "No se pudo recuperar la sucursal solicitada");
			mav.setViewName("redirect:/home");
		}
		mav.addObject("sucursal", sucursal);
		mav.setViewName("editar");
		return mav;
	}

	@RequestMapping("/guardarE")
	public ModelAndView saveE(@Valid @ModelAttribute Sucursal sucursal, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		if (result.hasErrors()) {
			mav.setViewName("edit");
		} else {
			sucursalService.saveSucursal(sucursal);
			mav.setViewName("redirect:/home");
			return mav;
		}
		return mav;
	}
	@RequestMapping("/delete")
	public ModelAndView delete(@RequestParam("id") Integer id) {
		
		try {
			sucursalService.deleteSucursal(id);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return initHome();
	}
	
	
	@PostMapping(value = "/validate")
	public ModelAndView validate(@RequestParam(value = "Username") String username,
			@RequestParam(value = "Password") String password) {
		ModelAndView mav = new ModelAndView();
		Usuario usuarioLogin = usuarioService.findUsuarioLogin(username, password);
		if (usuarioLogin != null) {
			if (usuarioLogin.getuName() != null) {
				if (usuarioLogin.getuName().equals(username)) {
					if (usuarioLogin.getuPass().equals(password)) {
						return new ModelAndView("redirect:/home");
					}
				}
			}
		}
		return new ModelAndView("redirect:/login");
	}
}