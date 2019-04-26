package com.quicktutorials.learnmicroservices.AccountMicroservice.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account")
@NoArgsConstructor @AllArgsConstructor
public class Account {

    @Id
    @Column(name="ID")
    @Getter @Setter
    private String id;

    @Column(name="FK_USER")
    @Getter @Setter
    private String fkUser;

    @Column(name="TOTAL")
    @Getter @Setter
    private Double total;

/*
    public Account() {
    }

    public Account(String id, String fkUser, Double total) {
        this.id = id;
        this.fkUser = fkUser;
        this.total = total;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFkUser() {
        return fkUser;
    }

    public void setFkUser(String fkUser) {
        this.fkUser = fkUser;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", fk_user='" + fkUser + '\'' +
                ", total=" + total +
                '}';
    }
*/
}
