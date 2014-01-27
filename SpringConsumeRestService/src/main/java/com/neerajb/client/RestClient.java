package com.neerajb.client;

import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class RestClient {
	private String domain;
	private RestTemplate restTemplate;
	
	public String execute(String path, Map<String, String> headers, Map<String, String> queryParams){
		
		UriComponentsBuilder uriBuilder = getUriComponentBuilder(path, headers, queryParams);		
		HttpEntity<String> requestEntity = new HttpEntity<String>("");		
		HttpEntity<String> response = getRestTemplate().exchange(uriBuilder.build().encode().toUri(), HttpMethod.GET, requestEntity, String.class);
		
		return response.getBody().toString();
	}
	
	private UriComponentsBuilder getUriComponentBuilder(String path, Map<String, String> headers, Map<String, String> queryParams){
		UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromPath(getDomain()+path);		
		for(String name : queryParams.keySet()){
			uriBuilder.queryParam(name, queryParams.get(name));
		}
		return uriBuilder;
	}
	
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public RestTemplate getRestTemplate() {
		return restTemplate;
	}
	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
}
