package com.neerajb.main;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.neerajb.client.RestClient;
import com.neerajb.contants.WebServiceUrl;

public class MainClass {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=null;
		try{
			Map<String, String> queryParams = new HashMap<String, String>();
			queryParams.put("issn", "0016-5085");
			
			context = new ClassPathXmlApplicationContext("spring-config.xml");
			RestClient restClient = context.getBean("restClient", RestClient.class);
			String response = restClient.execute(WebServiceUrl.GET_SUBSCRIPTION_PRICES, null, queryParams);
			
			
			System.out.println(response);
		}finally{
			if(context!=null){
				context.close();
			}
		}
		
	}
}
