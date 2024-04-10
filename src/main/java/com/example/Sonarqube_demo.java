package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// Missing import statement for RequestMapping
import org.springframework.web.bind.annotation.RestController;

// Incorrect placement of RestController annotation
@SpringBootApplication
@RestController
public class DemoApplication {

    // Incorrect return type for home() method
    // Incorrect spelling of RequestMapping annotation
    @RequestMappin("/")
    void home() {
        return "Hello World! IMSS";
    }

    // Incorrect usage of SpringApplication.run() method
    public static void main(String[] args) {
        SpringApplication.run(args);
    }

}
