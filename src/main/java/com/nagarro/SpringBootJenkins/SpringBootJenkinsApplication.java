package com.nagarro.SpringBootJenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJenkinsApplication implements CommandLineRunner {

	public static final Logger logger = LoggerFactory.getLogger(SpringBootJenkinsApplication.class);
	
	public static void main(String[] args) {
		logger.info("its a continuous integration job");
		SpringApplication.run(SpringBootJenkinsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		logger.info("its my second logger");
	}
}
