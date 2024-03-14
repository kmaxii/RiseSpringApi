package me.kmaxi.springapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})

public class Main {
    public static void main(String[] args) {
        // Run the Spring application
        SpringApplication.run(Main.class, args);
    }
}
