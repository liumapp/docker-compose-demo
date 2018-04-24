package com.liumapp.demo.docker.compose.service.demoapia.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;


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

    @Value("${custom.volumePath}")
    private String volumePath;

    @RequestMapping("")
    public String index () {
        return "hello , this is demo api a , and activeInfo is : " + activeInfo;
    }

    /**
     * docker运行在虚拟环境下
     * 所以文件的写入操作还是在虚拟机上执行
     * 如果要写入宿主机的硬盘上，需要设置Volumes
     * @return String
     * @throws IOException ioException
     */
    @RequestMapping("write")
    public String writeSth () throws IOException {
        String filename = "demo-api-a.txt";
        String info = "hello there , this is demo api a , and activeInfo is : " + activeInfo;
        FileOutputStream out = new FileOutputStream(volumePath + filename);
        out.write(info.getBytes());
        out.close();
        return "write success , the file path is : " + volumePath + filename;
    }

    /**
     * read data from volumes/data.txt
     * and write the data into /Volumes/demo-api-a-data.txt
     * @return String
     */
    @RequestMapping("read")
    public String readAndWrite () throws IOException {
        FileOutputStream out = new FileOutputStream(volumePath + "demo-api-a-data.txt");
        File file = new File(basePath);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = null;
        while((line = reader.readLine()) != null) {
            out.write(line.getBytes());
        }
        out.close();
        reader.close();
        return "read and write success";
    }

}
