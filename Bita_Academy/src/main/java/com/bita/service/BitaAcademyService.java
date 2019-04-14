package com.bita.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bita.dao.UserDTO;
import com.bita.entity.UserEntity;
import com.bita.repo.SubscriptionRepository;
import com.bita.repo.UserRepository;


@Service
public class BitaAcademyService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private SubscriptionRepository subscriptionRepository;

	public UserDTO getUser(Long id) {

		UserDTO userdto = new UserDTO();
		UserEntity bitauser = userRepository.getUser(id);
		userdto.setUserName(bitauser.getUserName());
		userdto.setActiveflag(bitauser.getActiveFlag());
		userdto.setUserId(bitauser.getUserId());

		return userdto;
	}
	
	public UserDTO createUserDetails(UserDTO userdto) {
		
		
		
		return null;
	}

}
