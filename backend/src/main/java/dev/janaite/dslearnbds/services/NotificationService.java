package dev.janaite.dslearnbds.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dev.janaite.dslearnbds.dto.NotificationDTO;
import dev.janaite.dslearnbds.entities.Notification;
import dev.janaite.dslearnbds.entities.User;
import dev.janaite.dslearnbds.repositories.NotificationRepository;

@Service
public class NotificationService {
	
	@Autowired
	private NotificationRepository repository;
	
	@Autowired
	private AuthService authService;
	
	@Transactional(readOnly = true)
	public Page<NotificationDTO> notificationsForCurrentUser(boolean unreadOnly, Pageable pageable) {
		User user = authService.getCurrentUserAuthenticated();
		Page<Notification> page = repository.find(user, unreadOnly, pageable);
		return page.map(p -> new NotificationDTO(p));
	}

}
