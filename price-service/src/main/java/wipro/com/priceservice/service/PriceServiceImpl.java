package wipro.com.priceservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import wipro.com.priceservice.entity.Price;
import wipro.com.priceservice.repo.PriceRepo;

@Service
public class PriceServiceImpl implements PriceService {

	@Autowired
	PriceRepo priceRepo;
	
		@Override
	public ResponseEntity<HttpStatus> updatePrice(Price price) {
		// TODO Auto-generated method stub
		priceRepo.save(price);
		return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
	}

}
