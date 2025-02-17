package com.demo.campeonato.service;

import java.util.Optional;
import java.util.List;
import org.springframework.stereotype.Service;
import com.demo.campeonato.repository.campeonatoRepository;
import com.demo.campeonato.entities.CampeonatoEntity;

@Service
public class campeonatoService {
	private final campeonatoRepository campeonatoRepository;

    public campeonatoService(campeonatoRepository campeonatoRepository) {
        this.campeonatoRepository = campeonatoRepository;
    }

    public List<CampeonatoEntity> buscarTodos() {
        return campeonatoRepository.findAll();
    }

    public Optional<CampeonatoEntity> buscarPorId(Integer id) {
        return campeonatoRepository.findById(id);
    }

    public List<CampeonatoEntity> buscarPorNome(String name) {
        return campeonatoRepository.findByNameContainingIgnoreCase(name);
    }
    
    public CampeonatoEntity criarCampeonato(CampeonatoEntity campeonatoEntity) {
    	return campeonatoRepository.save(campeonatoEntity);
    }
}