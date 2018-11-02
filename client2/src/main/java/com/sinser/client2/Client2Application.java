package com.sinser.client2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Description :
 *
 * @author : zhang
 * @date : 2018/11/2 9:35
 */
@SpringBootApplication
@EnableEurekaClient
public class Client2Application {
    public static void main(String[] args) {
        SpringApplication.run(Client2Application.class, args);
    }
}
