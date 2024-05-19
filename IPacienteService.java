package com.citas.service;

import java.util.*;

import com.citas.model.*;

public interface IPacienteService {
	Paciente registrarPaciente(String nombre, String apellidos, Date fechaNacimiento, String nif, List<Usuario> usuarios);
}
