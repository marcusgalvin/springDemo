package com.example.demo.service;

import com.example.demo.model.Person;
import com.example.demo.dao.PersonDao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
//spring imports
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//service
@Service
public class PersonService {
	//insert a new person
	
	private final PersonDao personDao;
	//autowire annotation
	@Autowired
	public PersonService(@Qualifier("postgres")PersonDao personDao) {
		this.personDao = personDao;
	}
	
	
	
	public int addPerson(Person person) {
		return personDao.insertPerson(person);
	}
	
	public List<Person> getAllPeople() {
		return personDao.selectAllPeople();
	}
	
	
	public Optional<Person> getPersonById(UUID id) {
		return personDao.selectPersonById(id);
	}
	
	public int deletePerson(UUID id) {
		return personDao.deleteById(id);
	}
	
	public int updatePerson(UUID id, Person newPerson) {
		return personDao.updatePersonById(id, newPerson);
	}
	

}
