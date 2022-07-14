package com.traxcrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.traxcrm.entities.Contact;

public interface Contactrepository extends JpaRepository<Contact, Long> {

}
