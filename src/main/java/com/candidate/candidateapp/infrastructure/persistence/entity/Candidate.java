package com.candidate.candidateapp.infrastructure.persistence.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(schema = "mysql", name = "candidate")
public class Candidate {
    public Candidate(){

    }

    public Candidate(Integer id, String name, String email, String gender, String salaryExpected) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.salaryExpected = salaryExpected;
    }

    public Candidate(String name, String email, String gender, String salaryExpected) {

        this.name = name;
        this.email = email;
        this.gender = gender;
        this.salaryExpected = salaryExpected;
    }

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "gender")
    private String gender;

    @Column(name = "salaryexpected")
    private String salaryExpected;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSalaryExpected() {
        return salaryExpected;
    }

    public void setSalaryExpected(String salaryExpected) {
        this.salaryExpected = salaryExpected;
    }
}
