package com.cydeo.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id //we are making this the primary key with the id annotation
    private int id;
private String name;



}
