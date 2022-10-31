package com.PerformHere.API.controllerTests;

import com.PerformHere.API.controllers.VotesController;
import com.PerformHere.API.entities.Votes;
import com.PerformHere.API.services.VotesService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.Mockito.*;

@WebMvcTest(VotesController.class)
public class VotesControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @MockBean
    private VotesService votesService;


    @Test
    public void getAllVotesTest() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.get("/votes/all")
        );
        verify(votesService, times(1)).getAllVotes();
    }

    @Test
    public void getVotesByUserTest() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.get("/votes/test@test.com")
        );
        verify(votesService, times(1)).getAllVotesByUser("test@test.com");
    }

    @Test
    public void getVotesForArtist() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.get("/votes/artistName")
        );
        verify(votesService, times(1)).getAllVotesForArtist("artistName");
    }

    @Test
    public void addVote() throws Exception {
//        Votes v = new Votes(1, "test@test.com", "testName", "test", "test", "test");
//
//        mockMvc.perform(
//                MockMvcRequestBuilders.post("/votes/add")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(objectMapper.writeValueAsString(v))
//        );
//        verify(votesService, times(1)).saveVote(v);
    }
}
