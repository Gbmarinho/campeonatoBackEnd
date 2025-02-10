package com.demo.campeonato.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.demo.campeonato.entities.ClubeEntity;

@Repository
public interface clubeRepository extends JpaRepository <ClubeEntity, Integer>{
	List<ClubeEntity> findByNameContainingIgnoreCase(String name);
}