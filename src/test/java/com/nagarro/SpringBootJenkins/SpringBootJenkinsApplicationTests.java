package com.nagarro.SpringBootJenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootJenkinsApplicationTests {
	public static final Logger logger = LoggerFactory.getLogger(SpringBootJenkinsApplication.class);
	@Test
	void contextLoads() {
		logger.info("its a test class");
		assertEquals(true, true);
	}

}
