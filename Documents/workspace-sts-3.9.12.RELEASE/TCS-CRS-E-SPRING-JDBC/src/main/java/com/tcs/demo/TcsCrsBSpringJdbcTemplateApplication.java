package com.tcs.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan({ "com.tcs.*" })
@EnableAutoConfiguration
@EnableWebMvc
public class TcsCrsBSpringJdbcTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(TcsCrsBSpringJdbcTemplateApplication.class, args);

	}

}
