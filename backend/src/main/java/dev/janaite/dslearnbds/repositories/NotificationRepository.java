package dev.janaite.dslearnbds.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import dev.janaite.dslearnbds.entities.Notification;
import dev.janaite.dslearnbds.entities.User;

public interface NotificationRepository extends JpaRepository<Notification, Long>{
	
	Page<Notification> findByUser(User user, Pageable pageable);

}
