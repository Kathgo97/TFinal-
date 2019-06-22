package com.uca.capas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Usuario;
import com.uca.capas.service.UsuarioService;

@Controller
public class MainController {


	@Autowired
	UsuarioService usuarioService;

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

	@PostMapping(value = "/validate")
	public ModelAndView validate(@RequestParam(value = "Username") String username,
			@RequestParam(value = "Password") String password) {
		ModelAndView mav = new ModelAndView();
		Usuario usuarioLogin = usuarioService.findUsuarioLogin(username, password);
		if (usuarioLogin != null) {
			if (usuarioLogin.getuName() != null) {
				if (usuarioLogin.getuName().equals(username)) {
					if (usuarioLogin.getuPass().equals(password)) {
						mav.setViewName("home");
						return new ModelAndView("redirect:/home");
					}
				}
			}
		}
		return new ModelAndView("redirect:/main");
	}
}