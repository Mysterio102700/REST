package com.example.demo.repository;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.signup;

public interface signup_repository extends CrudRepository<signup, Integer> {

	Optional<signup> findByName(String name);

	

}
