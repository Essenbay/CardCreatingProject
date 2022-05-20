package Components;

import java.sql.Date;
import java.util.ArrayList;

public class SavingAccount extends Account{
    private int interestRate;
    private Date storageDate;

    public SavingAccount(){

    }
    public SavingAccount(Long id, double balance, Date dateOfCreation, int interestRate, Date storageDate) {
        super(id, balance, dateOfCreation);
        this.interestRate = interestRate;
        this.storageDate = storageDate;
    }

    public SavingAccount(Date dateOfCreation, String firstname, String lastname, String address, String phone_number, int interestRate, Date storageDate) {
        super(dateOfCreation, firstname, lastname, address, phone_number);
        this.interestRate = interestRate;
        this.storageDate = storageDate;
    }

    public SavingAccount(Long id, double balance, Date dateOfCreation, String firstname, String lastname, String address, String phone_number, int interestRate, Date storageDate) {
        super(id, balance, dateOfCreation, firstname, lastname, address, phone_number);
        this.interestRate = interestRate;
        this.storageDate = storageDate;
    }

    public SavingAccount(double balance, Date dateOfCreation, String firstname, String lastname, String address, String phone_number) {
        super(balance, dateOfCreation, firstname, lastname, address, phone_number);
    }

    public SavingAccount(Long id, double balance, Date dateOfCreation, String firstname, String lastname, String address, String phone_number) {
        super(id, balance, dateOfCreation, firstname, lastname, address, phone_number);
    }

    public String toString() {
        return super.toString() +
                " SavingAccount{" + "interestRate=" + interestRate + ", storageDate=" + storageDate + '}';
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public Date getStorageDate() {
        return storageDate;
    }

    public void setStorageDate(Date storageDate) {
        this.storageDate = storageDate;
    }


    public void deposit(double amount){
        super.setBalance(super.getBalance() + amount);
    }
    public void withdraw(double amount){
        super.setBalance(super.getBalance() - amount);
    }
}
