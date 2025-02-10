package com.demo.campeonato.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.campeonato.entities.HistoricoEntity;
import com.demo.campeonato.service.HistoricoService;

@RestController
@RequestMapping("/historico")
public class HistoricoController {
	private final HistoricoService historicoService;
	
	public HistoricoController(HistoricoService historicoService) {
		this.historicoService = historicoService;
	}
	
	@GetMapping
	public List<HistoricoEntity> buscarTodos() {
		return historicoService.buscarTodos();
	}
	
	
}