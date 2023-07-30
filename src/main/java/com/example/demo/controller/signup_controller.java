package com.example.demo.controller;

import java.util.List;
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

import com.example.demo.models.signup;
import com.example.demo.service.signup_service;
@RestController
@RequestMapping("/api/v1")
public class signup_controller {
	@Autowired
	signup_service sin;
	@PostMapping("/insert")
	public signup addusers(@RequestBody signup s) {
		return sin.addsignup(s);
	}
	
	@PutMapping("/update")
	public signup update(@RequestBody signup up) {
		return sin.update(up);
	}
	@DeleteMapping("/delete/{id}")
	public String dele(@PathVariable int id) {
		return sin.dele(id);
	}
	@GetMapping("/getall")
	public List<signup>getall(){
		return sin.getall();
	}
	@GetMapping("/getbyid/{id}")
	public Optional<signup>getbyid(@PathVariable int id){
		return sin.getbyid(id);
	}
	@GetMapping("/getbyname/{name}")
	public Optional<signup> getbyname(@PathVariable String name) {
		return sin.getbyname(name);
	}
}
