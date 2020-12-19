package wipro.com.app.ProductService.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import wipro.com.app.ProductService.entity.Product;


public interface ProductService {
	public ResponseEntity<HttpStatus>  addProduct(Product product);

	public ResponseEntity<List<Product>> fectAllProducts();
}
