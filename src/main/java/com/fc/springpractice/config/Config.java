package com.fc.springpractice.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//Spring 전용 Configuration
@Configuration
//이 곳을 기준으로 모든 Bean들을 SCAN할 것
@ComponentScan("com.fc.springpractice")

@EnableWebMvc
public class Config {

}
