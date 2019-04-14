package com.bita.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bita.dao.UserDTO;
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
	public UserDTO getUser(@PathVariable Long id) {

		return betaService.getUser(id);

	}

	@PostMapping("/user/create")
	public UserDTO createUserDeatils(@RequestBody UserDTO userdto) {

		return null;

	}

}