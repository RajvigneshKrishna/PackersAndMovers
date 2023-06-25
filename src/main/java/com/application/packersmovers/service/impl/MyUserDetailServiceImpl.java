package com.application.packersmovers.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.application.packersmovers.model.MyUserDetails;
import com.application.packersmovers.model.User;
import com.application.packersmovers.repository.UserRepository;

@Service
public class MyUserDetailServiceImpl implements UserDetailsService {

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Optional<User> userOpt = userRepository.findByEmail(email);
		userOpt.orElseThrow(() -> new UsernameNotFoundException("Not Found " + email));
		return userOpt.map(MyUserDetails::new).get();
	}

}
