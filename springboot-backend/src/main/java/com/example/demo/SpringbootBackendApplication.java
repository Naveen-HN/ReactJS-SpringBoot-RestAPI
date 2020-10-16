package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception{
		this.userRepository.save(new User("Tony","Stark","Tony@stark.com"));
		this.userRepository.save(new User("Tom","Hardy","tom@hardy.com"));
		this.userRepository.save(new User("Peter","Parker","PP@spidey.com"));
	}

}
