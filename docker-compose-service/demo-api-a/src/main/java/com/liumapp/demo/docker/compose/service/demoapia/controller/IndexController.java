package com.liumapp.demo.docker.compose.service.demoapia.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileOutputStream;
import java.io.IOException;


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

    /**
     * docker运行在虚拟环境下
     * 所以文件的写入操作还是在虚拟机上执行
     * @return String
     * @throws IOException ioException
     */
    @RequestMapping("write")
    public String writeSth () throws IOException {
        filePath = "/Volumes/";
        String filename = "demo-api-a.txt";
        String info = "hello there , this is demo api a , and activeInfo is : " + activeInfo;
        FileOutputStream out = new FileOutputStream(filePath + filename);
        out.write(info.getBytes());
        out.close();
        return "write success , the file path is : " + filePath + filename;
    }

}
