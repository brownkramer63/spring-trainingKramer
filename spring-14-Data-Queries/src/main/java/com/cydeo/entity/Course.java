package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "COURSES")
@NoArgsConstructor
@Data
public class Course{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long Id;
@Column(name = "NAME")
    private String Name;
@Column(name = "CATEGORY")
    private String Category;
@Column(name = "RATING")
    private int Rating;
@Column(name = "DESCRIPTION")
    private String Description;

}
