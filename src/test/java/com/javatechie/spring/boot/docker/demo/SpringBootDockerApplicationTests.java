package com.javatechie.spring.boot.docker.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDockerApplicationTests {
	public static Logger logger = LoggerFactory.getLogger(SpringBootApplication.class);
	@Test
	public void contextLoads() {
		logger.info("test case executedd");
		assertEquals(true,true);
	}

}

