package dev.janaite.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.janaite.dslearnbds.entities.Resource;

public interface ResourceRepository extends JpaRepository<Resource, Long>{

}
