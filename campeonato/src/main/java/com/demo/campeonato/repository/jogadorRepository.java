package com.demo.campeonato.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.campeonato.entities.JogadorEntity;

@Repository
public interface jogadorRepository extends JpaRepository<JogadorEntity, Integer> {
	public List<JogadorEntity> findJogadorByName(String name);
}