package com.subscription.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subscription.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

	
	Role findByName(String name);
}
