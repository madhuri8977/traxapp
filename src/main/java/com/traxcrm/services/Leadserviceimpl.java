package com.traxcrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traxcrm.entities.Lead;
import com.traxcrm.repositories.Leadrepository;
@Service
public class Leadserviceimpl implements Leadservice {

	@Autowired
	private Leadrepository leadRepo;
	 
	@Override
	public void saveLead(Lead lead) {
		leadRepo.save(lead);

	}

	@Override
	public Lead getLeadById(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
				return lead;
	}

	@Override
	public void deleteOneLead(long id) {
		leadRepo.deleteById(id);
		
		
	}

	@Override
	public List<Lead> listall() {
	List<Lead> leads= leadRepo.findAll();
		return leads;
	}

}
