package com.berke.atmproject.dto;

import com.berke.atmproject.model.Account;
import com.berke.atmproject.model.Role;

import java.util.ArrayList;
import java.util.Collection;

public class UserDto {

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private Collection<Account> accounts;

    private Collection<Role> roles;

    public UserDto(String firstName, String lastName, String email, String password, Collection<Account> accounts, Collection<Role> roles) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.accounts = accounts;
        this.roles = roles;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Collection<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Collection<Account> accounts) {
        this.accounts = new ArrayList<>(accounts);
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = new ArrayList<>(roles);
    }


}
