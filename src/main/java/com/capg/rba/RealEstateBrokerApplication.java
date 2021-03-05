package com.capg.rba;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capg.rba.dao.ICustomerRepository;
import com.capg.rba.generator.IdGeneration;
import com.capg.rba.model.Customer;
import com.capg.rba.model.Property;

@SpringBootApplication
public class RealEstateBrokerApplication implements CommandLineRunner {

	@Autowired
	ICustomerRepository r;

	@Override
	public void run(String... args) throws Exception {

		List<Property> p = new ArrayList<Property>();
		Customer c1 = new Customer();
		c1.setCity("Agra");
		c1.setCustName("Amansingh");
		c1.setEmail("mail@gmail.com");
		c1.setMobile("123457896");
		c1.setPassword("45665");
		c1.setRole("c1");
		c1.setProperties(p);
		c1.setCustId(IdGeneration.generateId());

		r.save(c1);
		
	}

	public static void main(String[] args) {
		SpringApplication.run(RealEstateBrokerApplication.class, args);
	}

}
