package com.traxcrm.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.traxcrm.entities.Contact;
import com.traxcrm.services.ContactService;





@Controller
public class ContactController {
	@Autowired
	private   ContactService  contactService;
	
	@RequestMapping("listcontacts")
    public String listAllcontacts(ModelMap modelMap) {
		List<Contact> contacts = contactService.listAll();
       modelMap.addAttribute("contacts", contacts);
	return "contact_search_result";
	}
	
	

  
}
