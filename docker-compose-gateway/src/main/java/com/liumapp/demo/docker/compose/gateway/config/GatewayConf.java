package com.liumapp.demo.docker.compose.gateway.config;

import com.liumapp.demo.docker.compose.gateway.filter.AccessFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liumapp
 * @file GatewayConf.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/21/18
 */
@Configuration
public class GatewayConf {

    @Bean
    public AccessFilter accessFilter () {
        return new AccessFilter();
    }

}
