package com.spring.ymlconfig.config;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

import java.util.List;
import java.util.Map;

/*@EnableSpringConfigured annotaion helps map YAML configuration to this POJO
*   name: data-copy-dev
    environment: development
    enabled: true
    sources:
        source1:
            destination:
        source2:
            destination:
    destinations:
        destination1:
        destination2:

* */
@Configuration
@EnableSpringConfigured
@ConfigurationProperties
@Data
public class AppConfiguration {
    private String name;
    private String environment;
    private String enabled;
    private Map<String, Source> sources;
    private Map<String, Destination> destinations;

    @Getter
    @Setter
    @ToString
    public static class Source {
        boolean active;
        String connectionUrl;
        ConnectionURL connection;
        String pass;
        String keyfile;
        String path;
        String validFilesAge;
        List<SrcToDest> srcToDest;
    }

    @Getter
    @Setter
    @ToString
    public static class ConnectionURL {
        String user;
        String ip;
        int port;
        String srcType;
    }

    @Getter
    @Setter
    @ToString
    public static class Destination {
        String name;
        String connectionUrl;
        String user;
        String pass;
    }

    @Getter
    @Setter
    @ToString
    public static class SrcToDest {
        String fileRe;
        String delimiter;
        String destObject;
        String destdsName;
    }

}
