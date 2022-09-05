package com.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.learn.models.User;
import com.learn.repo.UserRepository;

@SpringBootApplication
public class SpringBootSecurityLearnApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityLearnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User user = new User();
		user.setEmail("bikki@gmail.com");
		user.setUsername("bikki");
		user.setPassword(this.bCryptPasswordEncoder.encode("bikki"));
		user.setRole("ROLE_NORMAL");

		this.userRepository.save(user);

		User user1 = new User();
		user1.setEmail("faizi@gmail.com");
		user1.setUsername("faizi");
		user1.setPassword(this.bCryptPasswordEncoder.encode("faizi"));
		user1.setRole("ROLE_ADMIN");

		this.userRepository.save(user1);

	}

}
