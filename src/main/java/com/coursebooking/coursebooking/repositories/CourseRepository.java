package com.coursebooking.coursebooking.repositories;

import com.coursebooking.coursebooking.models.Course;
import com.coursebooking.coursebooking.models.StarRatingType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {


    List<Course> findCoursesByRating(StarRatingType five);
}
