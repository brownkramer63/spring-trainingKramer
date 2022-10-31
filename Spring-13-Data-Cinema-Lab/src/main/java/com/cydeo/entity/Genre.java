package com.cydeo.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
//@Data
@Getter
@Setter
public class Genre extends BaseEntity {

    private String name;

}
