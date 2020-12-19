package wipro.com.app.ProductService;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wipro.com.app.ProductService.entity.Product;
import wipro.com.app.ProductService.service.ProductService;


@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class ProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}
}

/*
@RefreshScope
@RestController
class ProductServiceController {

	private static final Logger logger = LoggerFactory.getLogger(ProductServiceController.class);
	
	@Autowired
	private ProductService productService;
	
	@Value("${user.role: Default - Config Server is not working..pelase check}")
	private String role;

	
	@PostMapping(value="/addProduct")
	public ResponseEntity<HttpStatus>  addProduct(@RequestBody Product product)
	{
		   return productService.addProduct(product);
	}
	
	
	@GetMapping(value="/allProducts")
	public ResponseEntity<List<Product>> getAllProducts()
	{
			logger.info("Inside ProductServiceController->getAllProducts");
			return productService.fectAllProducts();
	}
	
	
	@RequestMapping("/role")
	String getRole() {
		return this.role;
	}
	
}*/