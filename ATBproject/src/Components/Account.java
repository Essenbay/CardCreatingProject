package Components;

import java.util.ArrayList;
import java.sql.Date;

public abstract class Account {
    private Long id;
    private double balance;
    private Date dateOfCreation;
    private String firstname;
    private String lastname;
    private String address;
    private String phone_number;
    public Account() {
    }
    public Account(Account account){
        this.id = account.id;
        this.balance = account.balance;
        this.dateOfCreation = account.dateOfCreation;
        this.firstname = account.firstname;
        this.lastname = account.lastname;
        this.address = account.address;
        this.phone_number = account.phone_number;
    }
    public Account(Long id, double balance, Date dateOfCreation) {
        this.id = id;
        this.balance = balance;
        this.dateOfCreation = dateOfCreation;
    }

    public Account(Date dateOfCreation, String firstname, String lastname, String address, String phone_number) {
        this.dateOfCreation = dateOfCreation;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.phone_number = phone_number;
        this.balance = 0;
    }

    public Account(double balance, Date dateOfCreation, String firstname, String lastname, String address, String phone_number) {
        this.balance = balance;
        this.dateOfCreation = dateOfCreation;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.phone_number = phone_number;
    }
    public Account(Long id, double balance, int day, int month, int year, String firstname, String lastname, String address, String phone_number) {
        this.id = id;
        this.balance = balance;
        this.dateOfCreation = new Date(year, month, day);
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.phone_number = phone_number;
    }

    public Account(Long id, double balance, Date dateOfCreation, String firstname, String lastname, String address, String phone_number) {
        this.id = id;
        this.balance = balance;
        this.dateOfCreation = dateOfCreation;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.phone_number = phone_number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return " Account{" + "id=" + id + ", balance=" + balance + ", dateOfCreation=" + dateOfCreation +
                ", firstname='" + firstname + ", lastname='" + lastname + ", " +
                "address='" + address + ", phone_number='" + phone_number + '}';
    }
}

