package dev.janaite.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.janaite.dslearnbds.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
