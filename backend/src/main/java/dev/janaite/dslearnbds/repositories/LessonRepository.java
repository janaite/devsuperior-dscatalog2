package dev.janaite.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.janaite.dslearnbds.entities.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Long>{

}
