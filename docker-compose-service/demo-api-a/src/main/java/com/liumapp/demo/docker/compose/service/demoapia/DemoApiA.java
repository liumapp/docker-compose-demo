package com.liumapp.demo.docker.compose.service.demoapia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author liumapp
 * @file DemoApiA.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/21/18
 */
@EnableDiscoveryClient
@SpringBootApplication
public class DemoApiA {

    public static void main(String[] args) {
        SpringApplication.run(DemoApiA.class , args);
    }

}
