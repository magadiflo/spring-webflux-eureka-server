package com.magadiflo.webflux.eureka.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringWebfluxEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWebfluxEurekaServerApplication.class, args);
    }

}
