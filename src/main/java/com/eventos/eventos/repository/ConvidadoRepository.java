package com.eventos.eventos.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventos.eventos.models.Convidado;
import com.eventos.eventos.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String> {
	Iterable<Convidado> findByEvento(Evento evento);
	Convidado findByRg(String rg);
}
