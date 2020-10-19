package com.techsharezone.elasticsearch;/*
 * @created 19/10/2020 -12:21
 * @project elasticsearch
 * @author  saurabhshcs
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class SpringBootConfig {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootConfig.class, args);            // it wil start application
    }
}
