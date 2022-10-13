package com.PerformHere.API.controllers;

import com.PerformHere.API.entities.Votes;
import com.PerformHere.API.services.VotesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("votes")
public class VotesController {

    public VotesService votesService;

    public VotesController(VotesService votesService) {
        this.votesService = votesService;
    }

    @GetMapping("all")
    public List<Votes> getAllVotes() {
        return this.votesService.getAllVotes();
    }

    @GetMapping("user/{userId}")
    public List<Votes> getVotesByUser(@PathVariable("userId") String userId) {
        return this.votesService.getAllVotesByUser(userId);
    }

    @GetMapping("artist/{artistName}")
    public List<Votes> getVotesForArtist(@PathVariable("artistName") String artistName) {
        return this.votesService.getAllVotesForArtist(artistName);
    }

    @PostMapping("add")
    public Votes saveVote(@RequestBody Votes vote) {
        return this.votesService.saveVote(vote);
    }

}
