package com.example.demo.service;

import com.example.demo.model.Anime;
import com.example.demo.repository.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {

    @Autowired
    AnimeRepository animeRepository;

    public List<Anime> getAll() {
        List<Anime> all = animeRepository.findAll();
        return all;
    }

    // Тип   переменная
    public Anime addAnime(Anime anime) {
        return animeRepository.save(anime);
    }

    public Anime incrementSeason(int animeId) {
        Anime foundAnime = animeRepository.findById(animeId).get();
        int nextSeason = foundAnime.getCurrentSeason();
        foundAnime.setCurrentSeason(++nextSeason);
        return animeRepository.save(foundAnime);
    }

    public Anime incrementSeries(int animeId) {
        Anime foundAnime = animeRepository.findById(animeId).get();
        int nextSeries = foundAnime.getCurrentSeries();
        foundAnime.setCurrentSeries(++nextSeries);
        return animeRepository.save(foundAnime);
    }

    public Anime decrementSeason(int animeId) {
        Anime foundAnime = animeRepository.findById(animeId).get();
        int nextSeason = foundAnime.getCurrentSeason();
        foundAnime.setCurrentSeason(--nextSeason);
        return animeRepository.save(foundAnime);
    }

    public Anime decrementSeries(int animeId) {
        Anime foundAnime = animeRepository.findById(animeId).get();
        int nextSeries = foundAnime.getCurrentSeries();
        foundAnime.setCurrentSeries(--nextSeries);
        return animeRepository.save(foundAnime);
    }

}

