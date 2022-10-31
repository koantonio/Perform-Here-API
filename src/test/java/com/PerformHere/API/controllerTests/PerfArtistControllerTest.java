package com.PerformHere.API.controllerTests;

import com.PerformHere.API.controllers.PerfArtistController;
import com.PerformHere.API.services.PerfArtistService;
import com.PerformHere.API.services.PerfUserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@WebMvcTest(PerfArtistController.class)
public class PerfArtistControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @MockBean
    private PerfUserService perfUserService;

    @MockBean
    private PerfArtistService perfArtistService;

    @Test
    public void getAllPerfArtist() throws Exception{
        mockMvc.perform(
                MockMvcRequestBuilders.get("/perfArtists/all")
        );
        verify(perfArtistService, times(1)).getAllArtists();
    }

}
