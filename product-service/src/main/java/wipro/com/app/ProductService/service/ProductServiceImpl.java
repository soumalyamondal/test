package wipro.com.app.ProductService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import wipro.com.app.ProductService.entity.Product;
import wipro.com.app.ProductService.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepo productRepo;
	
	@Override
	public ResponseEntity<HttpStatus> addProduct(Product product) {
		// TODO Auto-generated method stub
		productRepo.save(product);
		return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
		
	}

	@Override
	public ResponseEntity<List<Product>> fectAllProducts() {
		// TODO Auto-generated method stub
		return new ResponseEntity<List<Product>>(productRepo.findAll(), HttpStatus.OK) ;
		 
	}

}
