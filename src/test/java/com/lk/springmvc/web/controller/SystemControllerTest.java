package com.lk.springmvc.web.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Created by Administrator on 2017/5/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml", "file:src/main/webapp/WEB-INF/springmvc.xml"})
public class SystemControllerTest {

    @Autowired
    private SystemController systemController;

    @Test
    public void shutdownApp() throws Exception {
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(systemController).build();
        mockMvc.perform(MockMvcRequestBuilders.get("/shutdownApp")).andExpect(MockMvcResultMatchers.view().name("success"));
    }



}
