package com.proyecto.legalpro.servicio;

import com.proyecto.legalpro.modelo.Usuario;

public interface UsuarioServicio {
	
	public Usuario guardarUsuario(Usuario usuario);
    public Usuario obtenerUsuarioPorUsername(String username);

}
