package stock.walmart.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import stock.walmart.entity.Subscription;
@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
	
	

}
