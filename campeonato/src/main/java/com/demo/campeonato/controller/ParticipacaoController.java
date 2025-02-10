package com.demo.campeonato.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.campeonato.service.ParticipacaoService;
import com.demo.campeonato.entities.ParticipacaoEntity;

@RestController
@RequestMapping("/participacao")
public class ParticipacaoController {
	private final ParticipacaoService participacaoService;
	
	public ParticipacaoController(ParticipacaoService participacaoService) {
		this.participacaoService = participacaoService;
	}
	
	@GetMapping
	public List<ParticipacaoEntity> buscarTodos() {
		return participacaoService.buscarTodos();
	}
}