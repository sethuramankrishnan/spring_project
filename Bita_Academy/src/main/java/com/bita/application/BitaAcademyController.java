package com.bita.application;

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
import com.bita.dao.UserDTO;
import com.bita.entity.UserEntity;
import com.bita.service.BitaAcademyService;

@RestController
@RequestMapping("/bita")
public class BitaAcademyController {

	@Autowired
	BitaAcademyService betaService;

	@GetMapping("/test")
	public String getEmployeeById() {
		return "Application is Running";
	}

	@GetMapping("/user/{id}")
	public Optional<UserEntity> getUser(@PathVariable Long id) {

		return betaService.getUser(id);

	}

	@PostMapping("/user/create")
	public UserEntity createUserDeatils(@RequestBody UserEntity uentity) {

		return betaService.createUserDetails(uentity);

	}

	@DeleteMapping("/user/{id}")
	public String deleteUserDetails(@PathVariable Long id) {
		betaService.deleteUserDetails(id);
		return "sucess";
	}

	@PutMapping("user/update")
	public UserEntity updateUserDetails(@RequestBody UserEntity userentity) {

		return betaService.updateUserDetails(userentity);

	}

}