package com.example.demo.service;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.signup;
import com.example.demo.repository.signup_repository;

@Service

public class signup_service {
	@Autowired
	signup_repository repo;
	public signup addsignup(signup s)
	{
		return repo.save(s);
	}
	
	public signup update (signup s) {
		int id = s.getId();
		signup reg = repo.findById(id).get();
		reg.setName(s.getName());
		reg.setEmail(s.getEmail());
		reg.setPassword(s.getPassword());
		return repo.save(s);
	}
	public String dele(int id)
	{
		repo.deleteById(id);
		return "deleted successfull "+id;
	}

	public List<signup> getall(){
		return (List<signup>) repo.findAll();
	}
	public Optional<signup>getbyid(int id){
		return repo.findById(id);
	}
	
	public Optional<signup>getbyname(String name) {
		return repo.findByName(name);
	}
}
