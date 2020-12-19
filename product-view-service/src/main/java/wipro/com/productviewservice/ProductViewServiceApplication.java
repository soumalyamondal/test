package wipro.com.productviewservice;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//import wipro.com.productviewservice.controller.ProductViewServiceController;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class ProductViewServiceApplication {

	//private static final Logger logger = LoggerFactory.getLogger(ProductViewServiceApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ProductViewServiceApplication.class, args);
	}

	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
