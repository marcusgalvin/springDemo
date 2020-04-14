package com.example.demo.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.demo.model.Person;

//person interface to db
public interface PersonDao {
	
	//insert person to mach db
	int insertPerson(UUID id, Person person);
	
	default int insertPerson(Person person) {
		//random id
		UUID id = UUID.randomUUID();
		return insertPerson(id, person);
	}

	List<Person> selectAllPeople();
	
	Optional<Person> selectPersonById(UUID id);

	int i = 10;
	
	int deleteById(UUID id);
	
	int updatePersonById(UUID id, Person person);
	
	
}
