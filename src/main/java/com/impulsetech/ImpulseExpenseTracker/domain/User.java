package com.impulsetech.ImpulseExpenseTracker.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name = "USER", indexes = {@Index(columnList = "NAME"), @Index(columnList = "EMAIL_ADR")})
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty(access = Access.READ_ONLY)
    private Long id;

    @Column(name = "NAME", nullable = false, length = 100)
    private String name;

    @Column(name = "EMAIL_ADR", nullable = false, unique = true, length = 100)
    private String emailAddress;

    @Column(name = "PASSWORD", nullable = false, length = 200)
    private String password;

    @Column(name = "IS_ACTIVE", nullable = false)
    private Boolean active = Boolean.TRUE;

    @Column(name = "USER_TYPE", nullable = false)
    private UserType UserType;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<ExpenseItem> expenseItemSet;

    


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
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}