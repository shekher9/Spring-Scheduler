package com.ri.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ri.entity.PersonEntity;
@Repository(value = "personrepository")
public interface PersonRepository extends JpaRepository<PersonEntity, Integer> {

}
