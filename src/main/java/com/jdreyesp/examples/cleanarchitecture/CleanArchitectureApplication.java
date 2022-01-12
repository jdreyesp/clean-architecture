package com.jdreyesp.examples.cleanarchitecture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(
        basePackages = "com.jdreyesp.examples.cleanarchitecture",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ASPECTJ,
                pattern = "com.example.jdreyesp.cleanarchitecture.entity"))
public class CleanArchitectureApplication {
    public static void main(String[] args) {
        SpringApplication.run(CleanArchitectureApplication.class);
    }
}
