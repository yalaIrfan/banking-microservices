package com.eazybites.accounts.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.springframework.format.annotation.NumberFormat;

@Data
public class CustomerDto {

    @NotEmpty
    @Size(min = 5, max = 30, message = "Name should have at least 2 characters max 30 characters")
    private String name;

    @NotEmpty(message = "Email cannot be empty")
    @Email(message = "Email should be in correct format")
    private String email;

    @NotEmpty
    @Pattern(regexp = "[0-9]{10}", message = "Mobile number should be in correct format")
    private String mobileNumber;

    private AccountsDto accountsDto;
}

