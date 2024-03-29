package com.expensecal.expensecal.dto;

import java.util.List;

public class Person {
    private Long id;
    private String name;
    private String userName;
    private String pwd;
    private List<String> expenses;

    // Constructors
    public Person() {}

    public Person(Long id, String name, String userName, String pwd, List<String> expenses) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.pwd = pwd;
        this.expenses = expenses;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public List<String> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<String> expenses) {
        this.expenses = expenses;
    }
}
