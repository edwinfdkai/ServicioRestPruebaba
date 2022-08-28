package com.clientes.usuarios.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clientes.usuarios.model.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {

}
