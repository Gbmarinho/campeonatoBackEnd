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
	
	public List<ClubeEntity> buscarClubes(String name, String city, String country, String stadium) {
		return clubeRepository.searchClubs(name, city, country, stadium);
	}
	
	public ClubeEntity criarClube(ClubeEntity clubeEntity) {
		return clubeRepository.save(clubeEntity);
	}
}