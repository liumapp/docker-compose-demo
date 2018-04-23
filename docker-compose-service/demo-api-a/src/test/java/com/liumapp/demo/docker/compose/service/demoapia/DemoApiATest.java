package com.liumapp.demo.docker.compose.service.demoapia;

import junit.framework.TestCase;
import org.junit.Ignore;
import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author liumapp
 * @file DemoApiATest.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/23/18
 */
public class DemoApiATest extends TestCase {

    @Ignore
    @Test
    public void testWrite () throws IOException {
        if (false) {
            String filename = "/usr/local/tomcat/project/docker-compose-demo/demo-api-a.txt";
            String info = "hello there";
            FileOutputStream out = new FileOutputStream(filename);
            out.write(info.getBytes());
            out.close();
        }
    }

}
