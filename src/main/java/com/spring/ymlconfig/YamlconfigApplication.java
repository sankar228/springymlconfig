package com.spring.ymlconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YamlconfigApplication implements CommandLineRunner{

    @Autowired
    LoadConfig loadConfig;

    public static void main(String[] args) {
        SpringApplication.run(YamlconfigApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        loadConfig.loadconfig();
    }
}
