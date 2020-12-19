package wipro.com.priceservice.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import wipro.com.priceservice.entity.Price;


@Repository
@Transactional
public interface PriceRepo extends JpaRepository<Price, Long>{

	
	// CRUD - All / ById Update / Delete -- read / create
	

}
