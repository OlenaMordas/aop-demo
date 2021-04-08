package com.example.aopdemo;

import com.example.aopdemo.business.Business1;
import com.example.aopdemo.business.Business2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AopDemoApplication  implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(AopDemoApplication.class);
	@Autowired
	Business1 business1;

	@Autowired
	Business2 business2;

	public static void main(String[] args) {
		SpringApplication.run(AopDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// this would be run as soon as the app is launched

		logger.info(business1.caculateSomethig());
		logger.info(business2.caculateSomethig());

	}
}
