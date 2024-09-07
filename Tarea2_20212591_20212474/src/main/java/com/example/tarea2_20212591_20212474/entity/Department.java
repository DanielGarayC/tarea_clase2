package com.example.tarea2_20212591_20212474.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name="departments")
public class Department {

    @Id
    @Column(name="department_id",nullable = false)
    private Integer department_id;

    @Column(name="department_name",nullable = false,length = 30)
    private Integer department_name;

    @Column(name="location_id")
    private Integer location_id;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;
}
