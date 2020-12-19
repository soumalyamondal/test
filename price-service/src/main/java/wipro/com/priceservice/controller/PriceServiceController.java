package wipro.com.priceservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import wipro.com.priceservice.entity.Price;
import wipro.com.priceservice.service.PriceService;


@RestController
@RefreshScope
public class PriceServiceController {
	
	@Autowired
	PriceService priceService;

	@PostMapping(value="/updatePrice")
	public ResponseEntity<HttpStatus>  updatePrice(@RequestBody Price price)
	{
		   return priceService.updatePrice(price);
	}
	
}
