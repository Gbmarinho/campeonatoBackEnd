package com.demo.campeonato.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.demo.campeonato.repository.jogadorRepository;
import com.demo.campeonato.entities.JogadorEntity;
@Service
public class jogadorService {
	private final jogadorRepository jogadorRepository;
	
	public jogadorService(jogadorRepository jogadorRepository) {
		this.jogadorRepository = jogadorRepository;
	}
	
	public List<JogadorEntity> buscarTodos() {
		return jogadorRepository.findAll();
	}
	
	public Optional<JogadorEntity> buscarPorId(Integer id) {
		return jogadorRepository.findById(id);
	}
	
	public List<JogadorEntity> buscarPorNome(String name) {
		if(name == null) {
			return null;
		}
		
		return jogadorRepository.findJogadorByName(name);
	}
	
	public JogadorEntity criarJogador(JogadorEntity jogadorEntity) {
		return jogadorRepository.save(jogadorEntity);
	}
}