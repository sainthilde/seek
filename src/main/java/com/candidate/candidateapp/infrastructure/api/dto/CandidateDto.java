package com.candidate.candidateapp.infrastructure.api.dto;

public class CandidateDto {

    private Integer id;
    private String name;
    private String email;
    private String gender;
    private String salaryExpected;

    public CandidateDto(Integer id, String name, String email, String gender, String salaryExpected) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.salaryExpected = salaryExpected;
    }

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
