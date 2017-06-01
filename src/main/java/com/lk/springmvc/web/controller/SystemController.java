package com.lk.springmvc.web.controller;

import com.lk.springmvc.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2017/5/24.
 */
@Controller
public class SystemController {
    @Autowired
    private SystemService systemService;

    @RequestMapping("/shutdownApp")
    public String shutdownApp(){
        systemService.shoutdownApp();
        System.out.println(System.getProperty("user.dir"));
        return "success";
    }

    @RequestMapping(value = "/file", method = RequestMethod.POST)
    @ResponseBody
    public String file(@RequestParam(value = "file", required = false)CommonsMultipartFile file, HttpServletRequest request) throws IOException {
        System.out.println(file);
        System.out.println(request.getParameter("username"));
        InputStream is = file.getInputStream();
        //File file = new File("I:" + File.separator + "testFile.txt");
        int len;
        byte[] b = new  byte[1024];
        StringBuffer sb = new StringBuffer();
        while ((len = is.read(b)) != -1){
            sb.append(new String(b, 0, len, "utf8"));
        }
        System.out.println(sb.toString());
        return "success";
    }
}
