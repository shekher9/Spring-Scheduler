package com.ri.service;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.ri.entity.PersonEntity;
import com.ri.repository.PersonRepository;

import net.bytebuddy.utility.RandomString;
@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonRepository personrepository;
	
	Logger logger=LoggerFactory.getLogger(PersonServiceImpl.class);

	@Scheduled(fixedRate = 3000)
	@Override
	public void saveNewPerson() {
		PersonEntity entity=new PersonEntity();
		entity.setPersonname("Person " + new RandomString());
		personrepository.save(entity);
		System.out.println("Add service call"+ new Date().toString());

	}

	@Scheduled(cron = "0/15 * * * * *")
	@Override
	public void fechAllPerson() {
		List<PersonEntity> person=personrepository.findAll();
		System.out.println("fecch call in " + new Date().toString());
		System.out.println("no of record found" + person.size());
		logger.info("Person ::" +person);

	}

}
