package com.clientes.usuarios.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clientes.usuarios.model.Usuario;
import com.clientes.usuarios.repositorio.UsuarioRepositorio;

@Service
public class UsuarioServicio {
	
	@Autowired
	private UsuarioRepositorio repositorio;
	
	public List<Usuario> listaUsuarios(){
		
		return repositorio.findAll();
	}
		
	public Usuario obtenerUsuario (Integer id) {
		return repositorio.findById(id).get();
		
	}
		
	

}
