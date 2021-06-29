package dev.janaite.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.janaite.dslearnbds.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
