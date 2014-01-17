package com.neerajb.main;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("MainClass.main()");
		
		RestTemplate restTemplate = new RestTemplate();
		Map<String, String> params = new HashMap<String, String>();
		params.put("issn", "1526-0542");
//		String str = restTemplate.getForObject("https://secure-qa.jbs.elsevierhealth.com/ae/ecomm/getSubscriptionPrices", String.class, params);
		
//		UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromPath("https://secure-qa.jbs.elsevierhealth.com/ae/ecomm/getSubscriptionPrices");
//		uriBuilder.queryParam("issn", "1526-0542");		
//		System.out.println(uriBuilder.build().encode().toUri()); 
		
		UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromPath("https:////secure-qa.jbs.elsevierhealth.com/ae/ecomm/getSubscriptionPrices");
		uriBuilder.queryParam("issn", "1526-0542");
		
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<String> requestEntity = new HttpEntity<String>("");
		
		HttpEntity<String> response = restTemplate.exchange(uriBuilder.build().encode().toUri(), HttpMethod.GET, requestEntity, String.class);
		System.out.println(response);
		
	}
}
