package com.application.packersmovers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.packersmovers.model.HouseHoldItems;

@Repository
public interface HouseHoldItemsRepository extends JpaRepository<HouseHoldItems, Long>{

}
