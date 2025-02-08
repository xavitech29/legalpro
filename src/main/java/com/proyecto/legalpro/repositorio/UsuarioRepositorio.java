package com.proyecto.legalpro.repositorio;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.legalpro.modelo.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

	public Optional<Usuario> findByUsername(String username);
}
