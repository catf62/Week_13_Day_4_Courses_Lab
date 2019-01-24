package com.coursebooking.coursebooking;

import com.coursebooking.coursebooking.models.Customer;
import com.coursebooking.coursebooking.repositories.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoursebookingApplicationTests {

	@Autowired
	CustomerRepository customerRepostitory;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createCustomer(){
		Customer laura = new Customer("Laura", "Inverness", 33);
		customerRepostitory.save(laura);
	}

}

