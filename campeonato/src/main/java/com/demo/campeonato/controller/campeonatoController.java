package com.demo.campeonato.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import com.demo.campeonato.service.campeonatoService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

import com.demo.campeonato.entities.CampeonatoEntity;

@RestController
@RequestMapping("/campeonato")
public class campeonatoController {
	
	private final campeonatoService campeonatoService;
	
	public campeonatoController(campeonatoService campeonatoService) {
        this.campeonatoService = campeonatoService;
    }
	
	@GetMapping
	public ResponseEntity<?> getCampeonatosAll(
			@RequestParam(required = false) Integer id
	) {
		if(id != null) {
			return ResponseEntity.ok(campeonatoService.buscarPorId(id));
		}
		return ResponseEntity.ok(campeonatoService.buscarTodos());
	}
	
	@GetMapping("/busca")
	public ResponseEntity<?> getCampeonatosBusca( 
	        @RequestParam(required = false) String name
	) {
	    if (name != null) {
	        return ResponseEntity.ok(campeonatoService.buscarPorNome(name));
	    }
	    
	    return ResponseEntity.badRequest().body("É necessário informar pelo menos um parâmetro (name).");
	}
	
	@PostMapping
	public ResponseEntity<CampeonatoEntity> criacaoCampeonato(@RequestBody CampeonatoEntity campeonatoEntity){
		return ResponseEntity.ok(campeonatoService.criarCampeonato(campeonatoEntity));
	}
}