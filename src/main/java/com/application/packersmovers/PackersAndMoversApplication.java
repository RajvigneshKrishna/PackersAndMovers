package com.application.packersmovers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.application.packersmovers.repository.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class PackersAndMoversApplication {

	public static void main(String[] args) {
		SpringApplication.run(PackersAndMoversApplication.class, args);
	}

}
