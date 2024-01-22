package com.javastudies.javastudiesdemo;

import com.javastudies.javastudiesdemo.env.Environment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavastudiesApplication {

    public static void main(String[] args) {
        Environment.main(args);
        SpringApplication.run(JavastudiesApplication.class, args);
    }

}
