package com.example.api.project;

public class Job {
    private String id;
    private String title;
    private String location;
    private String companyName;
    private String companyLogo;
    private String date;

    public Job(String id, String title, String location, String companyName, String companyLogo, String date) {
        this.id = id;
        this.title = title;
        this.location = location;
        this.companyName = companyName;
        this.companyLogo = companyLogo;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyLogo() {
        return companyLogo;
    }
    public String getDate() {
        return date;
    }
}
