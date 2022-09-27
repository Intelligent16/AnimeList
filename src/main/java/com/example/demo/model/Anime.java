package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Anime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String pathImage;
    private String name;
    private int currentSeason;
    private int allSeasons;
    private int currentSeries;
    private int allSeries;
}
