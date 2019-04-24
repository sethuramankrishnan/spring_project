package com.bita.service;

import java.util.Optional;

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

	public Optional<UserEntity> getUser(Long id) {

//		UserDTO userdto = new UserDTO();
//		UserEntity bitauser = userRepository.getUser(id);
//		userdto.setUserName(bitauser.getUserName());
//		userdto.setActiveflag(bitauser.getActiveFlag());
//		userdto.setUserId(bitauser.getUserId());

		return userRepository.findById(id);
	}

	public UserEntity createUserDetails(UserEntity uentity) {

//	UserEntity uentity = new UserEntity();
//		uentity.setUserName(userdto.getUserName());
//		//uentity.setUserId(userdto.getUserId());
//		uentity.setActiveFlag(userdto.getActiveflag());
//		userRepository.save(uentity);
//		uentity
//		
//		return userdto;

		return userRepository.save(uentity);
//
	}

	public void deleteUserDetails(Long id) {
		userRepository.deleteById(id);

	}

	public UserEntity updateUserDetails(UserEntity userentity) {
		return userRepository.save(userentity);
	}

}
