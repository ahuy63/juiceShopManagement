/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4_juiceshopmanagement.model;

/**
 *
 * @author ahuy96
 */
public class Staff {

    private int AccountID;
    private String IDCardNumber;
    private boolean IsAdmin;

    private Account account;

    public Staff() {
    }

    public Staff(int AccountID, String IDCardNumber, boolean IsAdmin) {
        this.AccountID = AccountID;
        this.IDCardNumber = IDCardNumber;
        this.IsAdmin = IsAdmin;
    }

    public int getAccountID() {
        return AccountID;
    }

    public void setAccountID(int AccountID) {
        this.AccountID = AccountID;
    }

    public String getIDCardNumber() {
        return IDCardNumber;
    }

    public void setIDCardNumber(String IDCardNumber) {
        this.IDCardNumber = IDCardNumber;
    }

    public boolean isIsAdmin() {
        return IsAdmin;
    }

    public void setIsAdmin(boolean IsAdmin) {
        this.IsAdmin = IsAdmin;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

}
