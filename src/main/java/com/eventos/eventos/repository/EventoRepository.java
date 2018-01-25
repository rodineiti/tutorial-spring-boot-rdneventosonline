package com.eventos.eventos.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventos.eventos.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String> {
	Evento findById(long id);
}
