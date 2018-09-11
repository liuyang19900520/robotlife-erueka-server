package com.liuyang19900520.robotlife.erueka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RobotlifeEruekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RobotlifeEruekaServerApplication.class, args);
    }
}
