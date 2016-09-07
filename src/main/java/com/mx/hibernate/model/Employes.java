/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.hibernate.model;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author karlo
 */
@Entity
@Table(name = "tb_employe")
public class Employes implements Serializable{
    
    private static final long serialVersionUID=1L;
    @Id
    @Column(name = "fl_code")
    private Long code;
    
    @Column(name = "fl_name")
    private String name;
    
    @Column(name = "fl_lastName")
    private String lastName;
    
    @Column(name = "fl_bornDate")
    private LocalDate bornDate;
    
    public Employes(){
        
    }

    public Employes(Long code, String name, String lastName, LocalDate bornDate) {
        this.code = code;
        this.name = name;
        this.lastName = lastName;
        this.bornDate = bornDate;
    }
    
    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBornDate() {
        return bornDate;
    }

    public void setBornDate(LocalDate bornDate) {
        this.bornDate = bornDate;
    }

    @Override
    public String toString() {
        return "Employe{" + "code=" + code + ", name=" + name + ", lastName=" + lastName + ", bornDate=" + bornDate + '}';
    }
    
}
