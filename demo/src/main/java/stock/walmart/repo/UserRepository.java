package stock.walmart.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import stock.walmart.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	
	@Query("select U from User U where U.userName=:userName and U.password=:password")
	public User validateUser(String userName, String password);
}