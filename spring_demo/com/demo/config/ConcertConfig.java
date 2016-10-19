package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.demo.config.aspect.Audience;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan({ "com.demo.config", "com.demo.config.aspect" })
public class ConcertConfig {

	@Bean
	public Audience audience(){
		return new Audience();
	}

}
