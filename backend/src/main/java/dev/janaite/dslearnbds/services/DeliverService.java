package dev.janaite.dslearnbds.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dev.janaite.dslearnbds.dto.DeliverRevisionDTO;
import dev.janaite.dslearnbds.entities.Deliver;
import dev.janaite.dslearnbds.repositories.DeliverRepository;

@Service
public class DeliverService {

	@Autowired
	private DeliverRepository repository;
	
	@PreAuthorize("hasAnyRole('ADMIN','INSTRUCTOR')")
	@Transactional
	public void saveRevision(Long idDelivery, DeliverRevisionDTO dto) {
		Deliver deliver = repository.getOne(idDelivery);
		deliver.setStatus(dto.getStatus());
		deliver.setFeedback(dto.getFeedback());
		deliver.setCorrectCount(dto.getCorrectCount());
		repository.save(deliver);
	}
}
