package com.liumapp.demo.docker.compose.service.demoapib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author liumapp
 * @file DemoApiB.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/21/18
 */
@EnableDiscoveryClient
@SpringBootApplication
public class DemoApiB {

    public static void main(String[] args) {
        SpringApplication.run(DemoApiB.class , args);
    }

}
