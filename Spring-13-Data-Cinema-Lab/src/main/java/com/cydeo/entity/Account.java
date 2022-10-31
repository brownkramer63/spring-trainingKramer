package com.cydeo.entity;

import com.cydeo.enums.UserRole;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
//@Data
@Getter
@Setter
@NoArgsConstructor
@Table(name = "account_details")
public class Account extends BaseEntity {

    private String name;
    private String address;
    private String country;
    private String state;
    private String city;
    private Integer age;
    private String postalCode;
    @Enumerated(EnumType.STRING)
    private UserRole userRole;

    @OneToOne(mappedBy = "account") //to avoid multiple foriegn keys
    private User user;
}
