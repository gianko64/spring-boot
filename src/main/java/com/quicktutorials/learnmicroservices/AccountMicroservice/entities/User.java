package com.quicktutorials.learnmicroservices.AccountMicroservice.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "users")
@AllArgsConstructor @NoArgsConstructor
public class User {

    @Id
    @Column(name = "ID")
    @NotNull @NotEmpty @NotBlank
    @Getter @Setter
    private String id;

    @Column(name = "USERNAME")
    @Getter @Setter
    private String username;

    @Column(name = "PASSWORD")
    @Getter @Setter
    private String password;

    @Column(name = "PERMISSION")
    @Getter @Setter
    private String permission;
/*
    public User() {
    }

    public User(String id, String username, String password, String permission) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.permission = permission;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
*/
}
