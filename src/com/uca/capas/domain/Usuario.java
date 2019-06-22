package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema="public",name="usuario")

public class Usuario {
	@Id
	@GeneratedValue(generator="usuario_id_usuario_seq",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="usuario_id_usuario_seq",sequenceName="public.usuario_id_usuario_seq",allocationSize = 1)
	@Column(name="id_usuario")
	private Integer cUsuario;
	
	@Column(name="u_usuario")
	private String User;
	
	@Column(name="u_password")
	private String Password;
	
	public Usuario(Integer cUsuario, String User, String Password) {
		this.cUsuario = cUsuario;
		this.User = User;
		this.Password = Password;
	}
	

	public Integer getcUsuario() {
		return cUsuario;
	}

	public void setcUsuario(Integer cUsuario) {
		this.cUsuario = cUsuario;
	}

	public String getUser() {
		return User;
	}

	public void setUser(String User) {
		this.User = User;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String Password) {
		this.Password = Password;
	}
}
