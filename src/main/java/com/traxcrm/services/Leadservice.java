package com.traxcrm.services;

import java.util.List;

import com.traxcrm.entities.Lead;

public interface Leadservice {
 
	public void saveLead(Lead lead);
	public Lead getLeadById( long id );
	public void deleteOneLead(long id);
	public List<Lead> listall();
	
}
