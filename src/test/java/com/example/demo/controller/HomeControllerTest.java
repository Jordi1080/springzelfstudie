package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// aanpassen voor JUnit5 ?
@RunWith(SpringRunner.class)
@WebMvcTest(HomeController.class)
public class HomeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHome() throws Exception{
        mockMvc.perform(get("/"))
                .andExpect(status().is4xxClientError());
        // .andExpect(view().name("home"))
        //.andExpect(content().string(containsString("welkom")));
    }

    @Test
    public void testTest() {
    }
}