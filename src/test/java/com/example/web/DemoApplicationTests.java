package com.example.web;

import com.sun.org.apache.xpath.internal.operations.String;
import io.rebloom.client.Client;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

@SpringBootTest
class DemoApplicationTests {
//
    @Resource
    RedisTemplate<String,Object> redisTemplate;

    @Autowired
    Client client;

    @Test
    void contextLoads() throws IOException {

//        System.out.println(Files.readAllLines(Paths.get("C:\\Users\\black_2.txt")));
        System.out.println(client.exists("blacklist","13337716585"));


    }

}
