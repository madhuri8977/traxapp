package com.traxcrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traxcrm.entities.Contact;
import com.traxcrm.repositories.Contactrepository;


@Service
public class ContactServiceimpl implements ContactService {
	
	@Autowired
	Contactrepository ContactRepo;
	

	@Override
	public void saveContact(Contact contact) {
		ContactRepo.save(contact);
		
	}


	@Override
	public List<Contact> listAll() {
		List<Contact> contacts = ContactRepo.findAll();
		return  contacts;
	}


	@Override
	public Contact findContactByid(long id) {
		Optional<Contact> contactBy = ContactRepo.findById(id);
		Contact contact = contactBy.get();
		return contact; 
	}

}
