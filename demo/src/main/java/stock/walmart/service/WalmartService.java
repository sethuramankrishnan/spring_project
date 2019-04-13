package stock.walmart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

import stock.walmart.dao.UserDTO;
import stock.walmart.entity.Subscription;
import stock.walmart.entity.User;
import stock.walmart.repo.SubscriptionRepository;
import stock.walmart.repo.UserRepository;

@Service
@EnableScheduling
public class WalmartService {

	//RestTemplate rt = new RestTemplate();

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private SubscriptionRepository subscriptionRepository;
	/*
	 * @Value("${walmart.api.key}") private String apikey;
	 * sampleinstance.cilgeqbvjnzx.ap-south-1.rds.amazonaws.com
	 */

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	
	

	public UserDTO validateLogin(String userName, String password) {
		User user = userRepository.validateUser(userName, password);
		
		UserDTO userDTO = new UserDTO();
		userDTO.setUserName(userName);
		if (null != user) {
			userDTO.setUserId(user.getUserId());
			userDTO.setActive(true);
		}
		return userDTO;
	}
//get method
	public Optional<User> getUserDetails(Long user ) {
		return userRepository.findById(user);
	}
		
//post method	
	public User createUserDetails(User user)	{
		return userRepository.save(user);
	}
//delete method
	public void deleteUserDetails( Long id) {
		userRepository.deleteById(id);
		
	}
//put method	
	public User updateUserDetails(User user) {
		return userRepository.save(user);
	}
	
	
	////////anotherrepo
	
	
	public List<Subscription> getSubscriptionDetails() {
		return subscriptionRepository.findAll();
	}
	
	public Subscription createSubsUserDetails(Subscription subsuser)	{
		return subscriptionRepository.save(subsuser);
	}
	
	public void deleteSubsUserDetails( Long id) {
		subscriptionRepository.deleteById(id);
		
	}
	public Subscription updateSubsUserDetails(Subscription subsuser) {
		return subscriptionRepository.save(subsuser);
	}
	
}
