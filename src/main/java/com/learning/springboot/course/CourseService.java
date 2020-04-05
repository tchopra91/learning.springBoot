package com.learning.springboot.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(String topicId) {
        List<Course> topics = new ArrayList<>();
        this.courseRepository.findByTopicId(topicId).forEach(topics::add);
        return topics;
    }

    public Course getCourse(String id) {
        return this.courseRepository.findById(id).orElse(null);
    }

    public void addCourse(Course course) {
        this.courseRepository.save(course);
    }

    public void updateCourse(Course course) {
        this.courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        this.courseRepository.deleteById(id);
    }
}