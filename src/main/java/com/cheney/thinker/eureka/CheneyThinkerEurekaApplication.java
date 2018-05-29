package com.cheney.thinker.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * description
 * author CheneyThinker
 * date 2018-05-29
 */
@SpringBootApplication
@EnableEurekaServer
public class CheneyThinkerEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CheneyThinkerEurekaApplication.class, args);
        StringBuffer buffer = new StringBuffer();
        buffer.append("--------------------------------------------------\n");
        buffer.append("|                                                |\n");
        buffer.append("|                                                |\n");
        buffer.append("|   CheneyThinkerEurekaApplication is Running!   |\n");
        buffer.append("|                                                |\n");
        buffer.append("|                                                |\n");
        buffer.append("--------------------------------------------------\n");
        System.err.println(buffer.toString());
    }

}
