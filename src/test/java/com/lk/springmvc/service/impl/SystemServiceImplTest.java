package com.lk.springmvc.service.impl;

import com.lk.springmvc.service.SystemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/5/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class SystemServiceImplTest {

    @Autowired
    private SystemService systemService;

    @Test
    public void shoutdownApp() throws Exception {
        assertNotNull(systemService);
        systemService.shoutdownApp();
    }
}
