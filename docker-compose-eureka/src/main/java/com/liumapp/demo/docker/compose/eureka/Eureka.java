package com.liumapp.demo.docker.compose.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author liumapp
 * @file Eureka.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/21/18
 */
@EnableEurekaServer
@SpringBootApplication
public class Eureka {

    public static void main(String[] args) {
        SpringApplication.run(Eureka.class , args);
    }

}
