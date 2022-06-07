package com.example.springbootcachesample;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "employees")
@Entity
public class Employee implements Serializable {
    @Id
    @Column(name = "emp_no")
    private Integer id;
    String firstName;
    String lastName;
}
