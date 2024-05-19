package com.citas.service;

import com.citas.model.Usuario;

public interface IUsuarioService {
	boolean autenticarUsuario(String nif, String password);
	Usuario registrarUsuario(String nif, String password);
}
