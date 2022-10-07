package com.PerformHere.API.controllers;

import com.PerformHere.API.entities.PerfArtist;
import com.PerformHere.API.services.PerfArtistService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("perfArtists")
public class PerfArtistController {

    public PerfArtistService perfArtistService;

    public PerfArtistController(PerfArtistService perfArtistService) {
        this.perfArtistService = perfArtistService;
    }

    @GetMapping("getAll")
    public List<PerfArtist> getAllArtists() {
        return this.perfArtistService.getAllArtists();
    }

    @PostMapping("add")
    public PerfArtist saveArtist(@RequestBody PerfArtist artist) {
        return this.perfArtistService.saveArtist(artist);
    }

}
