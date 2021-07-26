package com.melichallenge.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.melichallenge.service.CountryService;

@SpringBootApplication
public class MelichallengeApplication {
	  @Bean
	    public RestTemplate getresttemplate() {
	        return new RestTemplate();
	    }
	public static void main(String[] args) {
		SpringApplication.run(MelichallengeApplication.class, args);
		CountryService cs = new CountryService();
		cs.getIpInfo("201.244.165.96");
		cs.getRatesByEUR("COP");
		cs.getCountryInfo("IT");
	}

}
