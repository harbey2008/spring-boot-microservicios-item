package com.desarrollo.spring.boot.item;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
	
	@Bean(value="clienteRest")
	public RestTemplate registrarRestTemplate() {
		return new RestTemplate();
	}

}
