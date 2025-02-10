package com.demo.campeonato.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "tb_participa_campeonato")
public class ParticipaCampeonatoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @JsonProperty(value = "club_id")
    @Column(name = "club_id", insertable = false, updatable = false)
    private Integer clubId;
    
    @ManyToOne
    @JoinColumn(name = "club_id", referencedColumnName = "id", nullable = false)
    @JsonProperty("clube")
    private ClubeEntity clube;
    
    @JsonProperty(value = "championship_id")
    @Column(name = "championship_id", insertable = false, updatable = false)
    private Integer championshipId;
    
    @ManyToOne
    @JoinColumn(name = "championship_id", referencedColumnName = "id", nullable = false)
    @JsonProperty("campeonato")
    private CampeonatoEntity campeonato;
}

