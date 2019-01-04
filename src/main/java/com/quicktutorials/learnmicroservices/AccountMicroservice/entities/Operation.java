package com.quicktutorials.learnmicroservices.AccountMicroservice.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table (name="operations")
@NoArgsConstructor @AllArgsConstructor
public class Operation {

    @Id
    @Column(name="ID")
    @Getter @Setter
    @NotEmpty @NotBlank @NotNull
    private String id;

    @Column(name="DATE")
    @Getter @Setter
    @NotNull
    private Date date;

    @Column(name="VALUE")
    @Getter @Setter
    private Double value;

    @Column(name="DESCRIPTION")
    @Getter @Setter
    private String description;

    @Column(name="FK_ACCOUNT1")
    @Getter @Setter
    @NotEmpty @NotBlank @NotNull
    private String fkAccount1;

    @Column(name="FK_ACCOUNT2")
    @Getter @Setter
    private String fkAccount2;

    @PrePersist
    void getTimeOpertion(){
        this.date = new Date();
    }
}
