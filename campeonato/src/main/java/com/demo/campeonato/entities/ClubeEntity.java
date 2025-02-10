package com.demo.campeonato.entities;

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
@Table(name = "tb_club")
public class ClubeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @JsonProperty(value = "name")
	private String name;
    
    @JsonProperty(value = "founded_date")
	private String founded_date;
    
    @JsonProperty(value = "city")
   	private String city;
    
    @JsonProperty(value = "country")
   	private String country;
    
    @JsonProperty(value = "stadium")
   	private String stadium;
    
    @JsonProperty(value = "capacity")
   	private int capacity;
    
    @JsonProperty(value = "championships_won")
   	private int championships_won;

}

