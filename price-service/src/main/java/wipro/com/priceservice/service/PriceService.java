package wipro.com.priceservice.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import wipro.com.priceservice.entity.Price;


public interface PriceService {
	public ResponseEntity<HttpStatus> updatePrice(Price price);
}
