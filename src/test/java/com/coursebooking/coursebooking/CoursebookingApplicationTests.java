package com.coursebooking.coursebooking;

import com.coursebooking.coursebooking.models.Booking;
import com.coursebooking.coursebooking.models.Course;
import com.coursebooking.coursebooking.models.Customer;
import com.coursebooking.coursebooking.models.StarRatingType;
import com.coursebooking.coursebooking.repositories.BookingRepository;
import com.coursebooking.coursebooking.repositories.CourseRepository;
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

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CourseRepository courseRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createCustomerBooking(){
		Customer laura = new Customer("Laura", "Inverness", 33);
		customerRepostitory.save(laura);
		Course codeClan = new Course("CodeClan", "Edinburgh", StarRatingType.FIVE);
		courseRepository.save(codeClan);
		Booking lauraCodeclan = new Booking("22-05-2029", codeClan, laura);
	}

}

