package com.projeto.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Collections;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.projeto.service.MovimentoManualService;

@WebMvcTest(MovimentoManualController.class)
public class MovimentoManualControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MovimentoManualService service;

    @Test
    public void testGetAllMovimentos() throws Exception {
        when(service.findAll()).thenReturn(Collections.emptyList());

        mockMvc.perform(MockMvcRequestBuilders.get("/movimentos"))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$").isEmpty());
    }
}
