/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4_juiceshopmanagement.model;

import java.util.Date;

/**
 *
 * @author ahuy96
 */
public class Customer {

    private int accountID;
    private Date doB;
    private String address;

    private Account account;

    public Customer() {
    }

    public Customer(int accountID, Date doB, String address, Account account) {
        this.accountID = accountID;
        this.doB = doB;
        this.address = address;
        this.account = account;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public Date getDoB() {
        return doB;
    }

    public void setDoB(Date doB) {
        this.doB = doB;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    
    

}
