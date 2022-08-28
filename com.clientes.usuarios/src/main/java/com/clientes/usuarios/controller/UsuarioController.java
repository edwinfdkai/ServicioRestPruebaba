package com.clientes.usuarios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.clientes.usuarios.model.Usuario;
import com.clientes.usuarios.servicio.UsuarioServicio;

@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioServicio servicio;
	
	@GetMapping("/usuario")
	public List<Usuario> listarusuarios(){
		return servicio.listaUsuarios();
	}
	
	@GetMapping("/usuario/{id}")
	public ResponseEntity<Usuario>  obtenerUsuario(@PathVariable Integer id) {
		
		try {
			Usuario usuario = servicio.obtenerUsuario(id);
			return new ResponseEntity<Usuario>(usuario,HttpStatus.OK);

		}catch(Exception excepcion) {
			return new ResponseEntity<Usuario>(HttpStatus.NOT_FOUND);
			
		}
	}
	
}
