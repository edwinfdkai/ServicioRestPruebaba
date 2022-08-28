package com.clientes.usuarios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String  pNombre;
	private String  sNombre;
	private String  pApellido;
	private String  sApellido;
	private Integer telefono;
	private String  direccion;
	private String  ciudad;
	
	public Usuario(Integer id, String pNombre, String sNombre, String pApellido, String sApellido, Integer telefono,
			String direccion, String ciudad) {
		super();
		this.id = id;
		this.pNombre = pNombre;
		this.sNombre = sNombre;
		this.pApellido = pApellido;
		this.sApellido = sApellido;
		this.telefono = telefono;
		this.direccion = direccion;
		this.ciudad = ciudad;
	}
	
	

	public Usuario() {
		super();
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getpNombre() {
		return pNombre;
	}



	public void setpNombre(String pNombre) {
		this.pNombre = pNombre;
	}



	public String getsNombre() {
		return sNombre;
	}



	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}



	public String getpApellido() {
		return pApellido;
	}



	public void setpApellido(String pApellido) {
		this.pApellido = pApellido;
	}



	public String getsApellido() {
		return sApellido;
	}



	public void setsApellido(String sApellido) {
		this.sApellido = sApellido;
	}



	public Integer getTelefono() {
		return telefono;
	}



	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getCiudad() {
		return ciudad;
	}



	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	
	
	
}
