package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name="employees")
@NoArgsConstructor
@Data
public class Employee extends BaseEntity{
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate hireDate;

}
