package org.html;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Properties;

@SpringBootApplication
public class ApplicationHtml {
    public static void main(String[] args){
        SpringApplication application = new SpringApplication(ApplicationHtml.class);

        Properties properties = new Properties();
        properties.put("server.port", 8081);
        application.setDefaultProperties(properties);

        application.run(args);
    }
}
