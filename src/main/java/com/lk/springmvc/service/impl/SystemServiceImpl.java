package com.lk.springmvc.service.impl;

import com.lk.springmvc.service.SystemService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/5/24.
 */
@Service
public class SystemServiceImpl implements SystemService {
    public void shoutdownApp() {
        System.out.println("关闭应用");
    }
}
