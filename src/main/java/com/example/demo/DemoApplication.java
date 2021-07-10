package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(e-> {if(!e.startsWith("org")) System.out.println(e);});
    }


    @Override
    public void run(String... args) throws Exception {
    }


}
