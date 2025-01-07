package com.eazybites.accounts.service;

import com.eazybites.accounts.dto.CustomerDto;

public interface IAccountsService {


    void createAccount(CustomerDto customerDto);

    CustomerDto fetchAccount(String mobileNumber);

    boolean updateAccount(CustomerDto customerDto);

    boolean deleteAccount(String accountNumber);
}
