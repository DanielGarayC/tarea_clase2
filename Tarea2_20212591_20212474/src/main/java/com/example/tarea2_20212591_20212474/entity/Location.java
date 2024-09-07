package com.example.tarea2_20212591_20212474.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name="locations")
public class Location {

    @Id
    @Column(name="location_id",nullable = false)
    private Integer location_id;

    @Column(name="city",nullable = false,length = 30)
    private Integer city;
}
