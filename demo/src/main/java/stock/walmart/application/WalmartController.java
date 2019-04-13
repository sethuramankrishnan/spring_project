package stock.walmart.application;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import stock.walmart.dao.UserDTO;
import stock.walmart.entity.Subscription;
import stock.walmart.entity.User;
import stock.walmart.service.WalmartService;

@RestController
@RequestMapping("/walmart")
public class WalmartController {

	@Autowired
	private WalmartService walmartService;

	@GetMapping("/test")
	public String getEmployeeById() {
		return "Application is Running";
	}

	@GetMapping("/users/details")
	public List<User> getAllEmployees() {
		return walmartService.getAllUsers();
	}

	@GetMapping("/users/{id}")
	public Optional<User> getUserDetails(@PathVariable Long id) {
		return walmartService.getUserDetails(id);
	}

	@GetMapping("/login/{userName}/{password}")
	public UserDTO doLogin(@PathVariable String userName, @PathVariable String password) {
		return walmartService.validateLogin(userName, password);
	}

	@PostMapping("/users/create")
	public User createUserDeatils(@RequestBody User user) {
		return walmartService.createUserDetails(user);

	}

	@DeleteMapping("/users/{id}")
	public String deleteUserDetails(@PathVariable Long id) {
		walmartService.deleteUserDetails(id);
		return "sucess";
	}

	@PutMapping("users/update")
	public User updateUserDetails(@RequestBody User user) {

		return walmartService.updateUserDetails(user);

	}
	
	@GetMapping("users/subscription/details")
	public List<Subscription> getSubscriptionDetails() {
		//Subscription s = new Subscription();
		
		return walmartService.getSubscriptionDetails();
		
	}
	
	@PostMapping("/users/subscription/create")
	public Subscription createUserDeatils(@RequestBody Subscription subsuser) {
		return walmartService.createSubsUserDetails(subsuser);

	}

	@DeleteMapping("/users/subscription/{id}")
	public String deleteubsUserDetails(@PathVariable Long id) {
		walmartService.deleteSubsUserDetails(id);
		return "sucess";
	}
	@PutMapping("users/subscription/update")
	public Subscription updateSubsUserDetails(@RequestBody Subscription subsuser) {

		return walmartService.updateSubsUserDetails(subsuser);

	}

	
}