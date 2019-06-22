package com.uca.capas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Usuario;
import com.uca.capas.repositories.UserRepository;

@Controller
public class MainController {

	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/")
	public ModelAndView initMain() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		return mav;
	}
	
	@RequestMapping("/main")
	public ModelAndView main(@RequestParam String User, @RequestParam String Password) {
		ModelAndView mav = new ModelAndView();
		Usuario login = userRepository.findByTuser(User);
		String mensaje;
		if(login != null) {
			if(login.getUser().equals("User")) {
				if(login.getPassword().equals(Password)) {
					mav.addObject("session", login);
					mav.setViewName("principal");	
				}else {
					mensaje="El password es Incorrecto";
					mav.addObject("mensaje", mensaje);
					mav.setViewName("main");
				}		
		}else {
			mensaje = "El usuario es Invalido";
			mav.addObject("mensaje", mensaje);
			mav.setViewName("main");
		}
	}
		return mav;
}
	
}
