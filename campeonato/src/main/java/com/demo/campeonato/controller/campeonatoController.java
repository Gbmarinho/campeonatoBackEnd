package com.demo.campeonato.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import com.demo.campeonato.service.campeonatoService;
import com.demo.campeonato.entities.CampeonatoEntity;
import java.util.List;

@RestController
@RequestMapping("/campeonato")
public class campeonatoController {
	
	private final campeonatoService campeonatoService;
	
	public campeonatoController(campeonatoService campeonatoService) {
        this.campeonatoService = campeonatoService;
    }
	
	@GetMapping
	public List<CampeonatoEntity> getCampeonatosAll() {
		return campeonatoService.buscarTodos();
	}
	
	@GetMapping("/busca")
	public Object getCampeonatosBusca( 
			@RequestParam(required = false) String nome
			) {
		
		if(nome == null) {
			return null;
		}
		return campeonatoService.buscarPorNome(nome);
	}
}