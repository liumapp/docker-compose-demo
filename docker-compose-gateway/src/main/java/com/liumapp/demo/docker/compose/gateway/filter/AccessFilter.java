package com.liumapp.demo.docker.compose.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author liumapp
 * @file AccessFilter.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/21/18
 */
public class AccessFilter extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger(AccessFilter.class);

    /**
     *  pre : before
     *  routing : while routing
     *  post : after routing and error
     *  error : catch exception
     * @return String
     */
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        log.info("this is access filter");
        return null;
    }

}
