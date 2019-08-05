package com.stackroute;

import org.jboss.logging.Property;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("application-prod.properties")
public class TrackServiceApplication {

    public static void main(String[] args) { SpringApplication.run(TrackServiceApplication.class, args);
    }
}

