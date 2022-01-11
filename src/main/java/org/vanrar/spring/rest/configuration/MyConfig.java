package org.vanrar.spring.rest.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("org.vanrar.spring.rest")
public class MyConfig {

    //Bean for HttpRequest
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
