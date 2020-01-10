package com.ri.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "PERSON")
public class PersonEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer personid;
	private String personname;

}
