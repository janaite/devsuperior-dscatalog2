package dev.janaite.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.janaite.dslearnbds.entities.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long>{

}
