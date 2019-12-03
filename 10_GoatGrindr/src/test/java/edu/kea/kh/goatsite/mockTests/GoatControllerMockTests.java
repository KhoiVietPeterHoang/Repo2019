/*
package edu.kea.kh.goatsite.mockTests;

import edu.kea.kh.goatsite.controller.api.GoatApiController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.web.servlet.function.RequestPredicates.contentType;

@RunWith(SpringRunner.class)
@WebMvcTest(GoatApiController.class)
public class GoatControllerMockTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void canWeGetGoats() throws Exception {

        mockMvc.perform(get("/"));
            .contentType(MediaType.APPLICATION_JSON)
            .andExpect(status().isOk())

    }

}

 */

