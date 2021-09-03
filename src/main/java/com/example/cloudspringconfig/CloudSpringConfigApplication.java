package com.example.cloudspringconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CloudSpringConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudSpringConfigApplication.class, args);
    }

}
