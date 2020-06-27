package com.impulsetech.ImpulseExpenseTracker.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name = "EXPENSE_ITEM", indexes = {@Index(columnList = "NAME"), @Index(columnList = "TYPE")})
public class ExpenseItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty(access = Access.READ_ONLY)
    private Long id;

    @Column(name = "NAME", length = 100, nullable = false)
    private String name;

    @Column(name = "TYPE")
    private ExpenseType expenseType;

    @Column(name = "DATE")
    private LocalDate date;

    @Column(name = "IS_ACTIVE", nullable = false)
    private Boolean active = Boolean.TRUE;
    
    @Column(name = "DESCRIPTION", length = 500)
    private String description;

    @ManyToOne(optional = false)
    private User user;


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
    public ExpenseType getExpenseType() {
        return expenseType;
    }
    public void setExpenseType(ExpenseType expenseType) {
        this.expenseType = expenseType;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    
    public void setActive(Boolean active) {
        this.active = active;
    }
    public Boolean isActive() {
        return active;
    }
}