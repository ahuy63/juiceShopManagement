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
public class Invoice {

    private int ID;
    private int AccountID;
    private Date IssuedDate;
    private Float Total;

    private Account buyer_Account;

    public Invoice() {
    }

    public Invoice(int ID, int AccountID, Date IssuedDate, Float Total, Account buyer_Account) {
        this.ID = ID;
        this.AccountID = AccountID;
        this.IssuedDate = IssuedDate;
        this.Total = Total;
        this.buyer_Account = buyer_Account;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAccountID() {
        return AccountID;
    }

    public void setAccountID(int AccountID) {
        this.AccountID = AccountID;
    }

    public Date getIssuedDate() {
        return IssuedDate;
    }

    public void setIssuedDate(Date IssuedDate) {
        this.IssuedDate = IssuedDate;
    }

    public Float getTotal() {
        return Total;
    }

    public void setTotal(Float Total) {
        this.Total = Total;
    }

    public Account getBuyer_Account() {
        return buyer_Account;
    }

    public void setBuyer_Account(Account buyer_Account) {
        this.buyer_Account = buyer_Account;
    }

}
