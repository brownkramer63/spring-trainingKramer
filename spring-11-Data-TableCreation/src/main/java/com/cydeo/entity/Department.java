package com.cydeo.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Department extends BaseEntity{

    private String department;
    private String division;




}
