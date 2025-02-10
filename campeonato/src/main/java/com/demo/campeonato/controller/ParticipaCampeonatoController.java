package com.demo.campeonato.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.campeonato.service.ParticipaCampeonatoService;
import com.demo.campeonato.entities.ParticipaCampeonatoEntity;

@RestController
@RequestMapping("/participaCampeonato")
public class ParticipaCampeonatoController {
	private final ParticipaCampeonatoService participaCampeonatoService;
	
	public ParticipaCampeonatoController(ParticipaCampeonatoService participaCampeonatoService) {
		this.participaCampeonatoService = participaCampeonatoService;
	}
	
	@GetMapping
	public List<ParticipaCampeonatoEntity> buscarTodos() {
		return participaCampeonatoService.buscarTodos();
	}
}