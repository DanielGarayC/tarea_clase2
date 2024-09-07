package com.example.tarea2_20212591_20212474.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name="jobs")
public class Job {

    @Id
    @Column(name="job_id",nullable = false)
    private Integer job_id;

    @Column(name="job_title",nullable = false,length = 35)
    private Integer job_title;
}
