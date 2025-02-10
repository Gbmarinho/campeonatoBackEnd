package com.demo.campeonato.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.campeonato.entities.ParticipaCampeonatoEntity;

@Repository
public interface ParticipaCampeonatoRepository extends JpaRepository<ParticipaCampeonatoEntity, Integer> {
	public List<ParticipaCampeonatoEntity> findByClubeId(Integer id);
}