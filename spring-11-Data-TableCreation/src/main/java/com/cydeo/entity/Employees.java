package com.cydeo.entity;


import com.cydeo.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Employees extends BaseEntity{

    private String firstName;
    private String lastName;
    private String email;
    @Column(columnDefinition = "Date")
    private LocalDate hireDate;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private int salary;


}
