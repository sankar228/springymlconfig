package com.spring.ymlconfig;

import com.spring.ymlconfig.config.AppConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class LoadConfig {

    @Autowired
    AppConfiguration appConfiguration;

    public void loadconfig() {
        Map<String, AppConfiguration.Source> sources = appConfiguration.getSources();
        Map<String, AppConfiguration.Destination> destinations = appConfiguration.getDestinations();

        System.out.println("Source Information");
        sources.forEach((k, v) -> {
            System.out.println(k + " --> " + v.toString());
        });

        System.out.println("Destination Information");
        destinations.forEach((k, v) -> {
            System.out.println(k + " --> " + v.toString());
        });
    }
}
