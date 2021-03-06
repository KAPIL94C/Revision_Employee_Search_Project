package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

@EnableOAuth2Sso
@EnableZuulProxy 
@EnableDiscoveryClient
@SpringBootApplication
public class GatewayServiceDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServiceDemoApplication.class, args);
	}

}
