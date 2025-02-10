package com.demo.campeonato.service;

import com.demo.campeonato.repository.clubeRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.demo.campeonato.entities.ClubeEntity;

@Service
public class clubeService {
	private final clubeRepository clubeRepository;
	
	public clubeService(clubeRepository clubeRepository) {
		this.clubeRepository = clubeRepository;
	}
	
	public List<ClubeEntity> buscarTodos() {
		return clubeRepository.findAll();
	}
	
	public Optional<ClubeEntity> buscarPorId(Integer id) {
		return clubeRepository.findById(id);
	}
	
	public List<ClubeEntity> buscarPorNome(String name) {
		if(name == null) {
			return null;
		}
		return clubeRepository.findByNameContainingIgnoreCase(name);
	}
}