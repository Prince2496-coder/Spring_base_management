package org.example.config;

import org.example.database.databaseconection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class appconfig {

    @Bean(initMethod = "init" , destroyMethod = "cleanup")
    public databaseconection dbconection (){
        return new databaseconection();
    }

}