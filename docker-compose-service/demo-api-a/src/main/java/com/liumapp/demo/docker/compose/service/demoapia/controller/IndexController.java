package com.liumapp.demo.docker.compose.service.demoapia.controller;

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

    @RequestMapping("")
    public String index () {
        return "hello , this is demo api a";
    }

}
