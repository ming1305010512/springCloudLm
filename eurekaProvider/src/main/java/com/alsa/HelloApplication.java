package com.alsa;

import com.netflix.discovery.DiscoveryClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2021/1/5
 * @Time: 18:59
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class HelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class,args);
    }

}
