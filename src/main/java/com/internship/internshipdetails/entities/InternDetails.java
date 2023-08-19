package com.internship.internshipdetails.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class InternDetails {
    @Id
    private int regNo;
    private String Name;
    private String role;
    private String startDate;
    private String endDate;
    private String AwardedOn;
    private String CollegeName;
    private String gender;
    private String performance;

    public InternDetails() {
    }

    public InternDetails(int regNo, String name, String role, String startDate, String endDate, String awardedOn,
                         String collegeName, String gender, String performance) {
        this.regNo = regNo;
        Name = name;
        this.role = role;
        this.startDate = startDate;
        this.endDate = endDate;
        AwardedOn = awardedOn;
        CollegeName = collegeName;
        this.gender = gender;
        this.performance = performance;
    }

    public int getRegNo() {
        return regNo;
    }

    public String getName() {
        return Name;
    }

    public String getRole() {
        return role;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getAwardedOn() {
        return AwardedOn;
    }

    public String getCollegeName() {
        return CollegeName;
    }

    public String getGender() {
        return gender;
    }

    public String getPerformance() {
        return performance;
    }
}
