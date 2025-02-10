package com.demo.campeonato.entities;

//CREATE TABLE tb_championship (
//	    championship_id SERIAL PRIMARY KEY,
//	    name VARCHAR(100) NOT NULL UNIQUE,
//	    start_date VARCHAR(10) NOT NULL,
//	    end_date VARCHAR(10) NOT NULL
//	);

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tb_championship")
public class CampeonatoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @JsonProperty(value = "name")
	private String name;
    
    @JsonProperty(value = "start_date")
	private String start_date;
    
    @JsonProperty(value = "end_date")
   	private String end_date;
}

