package dev.janaite.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.janaite.dslearnbds.entities.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long>{

}
