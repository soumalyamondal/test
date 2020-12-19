package wipro.com.app.ProductService.repo;

import java.util.List;
import java.util.stream.Stream;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import wipro.com.app.ProductService.entity.Product;

@Repository
@Transactional
public interface ProductRepo extends JpaRepository<Product, Long>{

	
	// CRUD - All / ById Update / Delete -- read / create
	

}
