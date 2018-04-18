package com.liumapp.demo.docker.compose.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author liumapp
 * @file Gateway.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/21/18
 */
@EnableZuulProxy
@SpringCloudApplication
public class Gateway {

    public static void main(String[] args) {
        SpringApplication.run(Gateway.class , args);
    }

}
