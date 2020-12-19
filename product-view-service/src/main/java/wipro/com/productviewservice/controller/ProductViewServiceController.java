package wipro.com.productviewservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RefreshScope
public class ProductViewServiceController {

	private static final Logger logger = LoggerFactory.getLogger(ProductViewServiceController.class);
	/*
	 * @Autowired EurekaClient eurekaClient;
	 * 
	 * 
	 * @Autowired RestTemplateBuilder restTemplateBuilder;
	 * 
	 * 
	 * @RequestMapping(value = "/") public String invokeService() { RestTemplate
	 * restTemplate = restTemplateBuilder.build();
	 * 
	 * //Using Eureka-Server
	 * 
	 * InstanceInfo instanceInfo =
	 * eurekaClient.getNextServerFromEureka("product-service", false); String
	 * baseUrl = instanceInfo.getHomePageUrl(); baseUrl = baseUrl +
	 * "/product/message"; return restTemplate.getForObject(baseUrl, String.class);
	 * 
	 * 
	 * //Using Zuul-Gateway InstanceInfo instanceInfo =
	 * eurekaClient.getNextServerFromEureka("zuul-gateway", false); String baseUrl =
	 * instanceInfo.getHomePageUrl(); baseUrl = baseUrl + "/api/product/message";
	 * return restTemplate.getForObject(baseUrl, String.class);
	 * 
	 * 
	 * 
	 * }
	 */
	
	@Autowired
	RestTemplate restTemplate;
	
	
	@Value("${product-service.application.name:product-service}")
	String productServiceAppName; 
	
	@HystrixCommand(fallbackMethod = "getAllProductsFB")
	@RequestMapping(value = "/allProducts")
	public String getAllProducts() {
		System.out.println("Inside product-view-service : getAllProducts");
		logger.info("logger ->Inside product-view-service : getAllProducts");
		String message = this.restTemplate.getForObject("http://" +productServiceAppName+"/allProducts", String.class);
		return String.format("%s", message);
	}
	
	public String getAllProductsFB() {
		return "Product Service is Down!";
	}

}
