package com.niit.somg.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@Import(value={HelloWorldConfiguration.class, HelloDaoConfig.class})
@ComponentScan(basePackages={"com.niit.somg.web"})
public class HelloWorldWebAppConfig {

}
