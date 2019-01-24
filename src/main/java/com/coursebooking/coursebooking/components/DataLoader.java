package com.coursebooking.coursebooking.components;

import com.coursebooking.coursebooking.models.Booking;
import com.coursebooking.coursebooking.models.Course;
import com.coursebooking.coursebooking.models.Customer;
import com.coursebooking.coursebooking.models.StarRatingType;
import com.coursebooking.coursebooking.repositories.BookingRepository;
import com.coursebooking.coursebooking.repositories.CourseRepository;
import com.coursebooking.coursebooking.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;


    public DataLoader(){

    }

    public void run(ApplicationArguments args) {
        Customer laura = new Customer("Laura", "Inverness", 33);
        customerRepository.save(laura);
        Customer cat = new Customer("Cat", "Glasgow", 30);
        customerRepository.save(cat);

        Course codeClan = new Course("CodeClan", "Edinburgh", StarRatingType.FIVE);
        courseRepository.save(codeClan);
        Course pirateStudies = new Course("Pirate Studies", "Sydney", StarRatingType.ONE);
        courseRepository.save(pirateStudies);

        Booking lauraCodeclan = new Booking("22-05-2029", codeClan, laura);
        bookingRepository.save(lauraCodeclan);
        Booking catPirate = new Booking("24-08-2029", pirateStudies, cat);
        bookingRepository.save(catPirate);


        cat.addBooking(catPirate);
        customerRepository.save(cat);

        laura.addBooking(lauraCodeclan);
        customerRepository.save(laura);

        catPirate.addCustomer(cat);
        bookingRepository.save(catPirate);

        lauraCodeclan.addCustomer(laura);
        bookingRepository.save(lauraCodeclan);

    }
}
