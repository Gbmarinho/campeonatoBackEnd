package com.demo.campeonato.controller;

import com.demo.campeonato.service.clubeService;
import com.demo.campeonato.entities.ClubeEntity;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/clube")
public class clubeController {
	private final clubeService clubeService;
	
	public clubeController(clubeService clubeService) {
		this.clubeService = clubeService;
	}
	
	@GetMapping
	public List<ClubeEntity> buscarTodos() {
		return clubeService.buscarTodos();
	}
	
	
}