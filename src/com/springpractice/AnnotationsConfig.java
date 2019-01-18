package com.springpractice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationsConfig {
	
	@Bean
	public Knowledge startKnowledge() {
		return new Knowledge(startTextBooks());
	}
	
	@Bean
	public TextBooks startTextBooks() {
		return new TextBooks();
	} 
}
