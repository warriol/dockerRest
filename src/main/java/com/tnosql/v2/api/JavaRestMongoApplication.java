package com.tnosql.v2.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class JavaRestMongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaRestMongoApplication.class, args);
    }

}
