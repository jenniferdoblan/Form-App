package com.formapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration //now deployable to web server
@ComponentScan
public class AppConfig {
    public static void main(String[] args){
        //this will run our app
        SpringApplication.run(AppConfig.class, args);
    }
}
