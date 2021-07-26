package com.melichallenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.melichallenge.model.Country;
import com.melichallenge.model.Fixer;
import com.melichallenge.model.Rates;

@Service
public class CountryService {
	
	public Country getIpInfo(String ip){
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity response =restTemplate.getForEntity("https://api.ip2country.info/ip?"+ip,Country.class);
		Country country = (Country) response.getBody();
		return country;
	}

	public Fixer getRatesByEUR(String symbol){
		RestTemplate restTemplate = new RestTemplate();
		String api_key = "88ea968c79bb0a8cc1db1b3b55a47477";
		String url = "http://data.fixer.io/api/latest?access_key="+api_key+"&symbols="+symbol;
		ResponseEntity response =restTemplate.getForEntity(url,Object.class);
		System.out.println(response.getBody().toString());
		return null;
	}
	
	public Fixer getCountryInfo(String symbol){
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://restcountries.eu/rest/v2/alpha/"+symbol;
		ResponseEntity response = restTemplate.getForEntity(url,Object.class);
		System.out.println(response.getBody().toString());
		return null;
	}


}
