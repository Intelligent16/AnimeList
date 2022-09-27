package com.example.demo.controller;

import com.example.demo.model.Anime;
import com.example.demo.service.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimeController {
    @Autowired
    AnimeService service;
    @GetMapping
    public List<Anime> getAll() {
        return service.getAll();
    }

    // Тип   переменная
    @PostMapping
    public Anime addAnime(Anime anime) {
        return service.addAnime(anime);
    }
    @PostMapping("/incSeas/{animeId}")
    public Anime incrementSeason(@PathVariable int animeId) {
        return service.incrementSeason(animeId);
    }
    @PostMapping("/incSer/{animeId}")
    public Anime incrementSeries(@PathVariable int animeId) {
        return service.incrementSeries(animeId);
    }
    @PostMapping("/decSeas/{animeId}")
    public Anime decrementSeason(@PathVariable int animeId) {
        return service.decrementSeason(animeId);
    }
    @PostMapping("/decSer/{animeId}")
    public Anime decrementSeries(@PathVariable int animeId) {
        return service.decrementSeries(animeId);
    }

}
