package com.liumapp.demo.docker.compose.service.demoapia.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author liumapp
 * @file IndexController.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/21/18
 */
@RestController
@RequestMapping("/")
public class IndexController {

    @Value("${custom.activeInfo}")
    private String activeInfo;

    @Value("${custom.filePath}")
    private String filePath;

    @RequestMapping("")
    public String index () {
        return "hello , this is demo api a , and activeInfo is : " + activeInfo;
    }

    @RequestMapping("write")
    public String writeSth () {
        String filename = "demo-api-a.txt";

        return "write success , the file path is : " + filePath + filename;
    }

}
