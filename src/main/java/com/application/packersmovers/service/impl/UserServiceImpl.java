package com.application.packersmovers.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.packersmovers.model.HouseHoldItems;
import com.application.packersmovers.repository.HouseHoldItemsRepository;
import com.application.packersmovers.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	HouseHoldItemsRepository houseHoldItemsRepository;

	@Override
	public List<HouseHoldItems> loadusrItem() {
		return houseHoldItemsRepository.findAll();
	}
}
