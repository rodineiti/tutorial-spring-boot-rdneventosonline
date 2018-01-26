package com.eventos.eventos.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventos.eventos.models.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String> {
	Usuario findByLogin(String login);
}
