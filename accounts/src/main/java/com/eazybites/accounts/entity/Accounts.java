package com.eazybites.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Accounts extends BaseEntity {


    private Long customerId;

    @Id
    @Column(name="account_number")
    private Long accountNumber;

    @Column(unique = true)
    private String accountType;

    private String branchAddress;


}
