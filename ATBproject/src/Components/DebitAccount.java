package Components;

import java.sql.Date;
import java.util.ArrayList;

public class DebitAccount extends Account{
    private int annualMaintenance;

    public DebitAccount() {
    }

    public DebitAccount(double balance, Date dateOfCreation, String firstname, String lastname, String address, String phone_number) {
        super(balance, dateOfCreation, firstname, lastname, address, phone_number);
    }

    public DebitAccount(Long id, double balance, Date dateOfCreation, String firstname, String lastname, String address, String phone_number) {
        super(id, balance, dateOfCreation, firstname, lastname, address, phone_number);
    }

    public DebitAccount(Long id, double balance, Date dateOfCreation, int annualMaintenance) {
        super(id, balance, dateOfCreation);
        this.annualMaintenance = annualMaintenance;
    }

    public DebitAccount(Date dateOfCreation, String firstname, String lastname, String address, String phone_number, int annualMaintenance) {
        super(dateOfCreation, firstname, lastname, address, phone_number);
        this.annualMaintenance = annualMaintenance;
    }

    public DebitAccount(Long id, double balance, Date dateOfCreation, String firstname, String lastname, String address, String phone_number, int annualMaintenance) {
        super(id, balance, dateOfCreation, firstname, lastname, address, phone_number);
        this.annualMaintenance = annualMaintenance;
    }

    public DebitAccount(Long id, double balance, int day, int month, int year, String firstname, String lastname, String address, String phone_number, int annualMaintenance) {
        super(id, balance, day, month, year, firstname, lastname, address, phone_number);
        this.annualMaintenance = annualMaintenance;
    }

    public String toString() {
        return super.toString() +
                " DebitAccount{" + "annualMaintenance=" + annualMaintenance + '}';
    }

    public int getAnnualMaintenance() {
        return annualMaintenance;
    }

    public void setAnnualMaintenance(int annualMaintenance) {
        this.annualMaintenance = annualMaintenance;
    }

    public void deposit(double amount){
        super.setBalance(super.getBalance() + amount);
    }
    public void withdraw(double amount){
        super.setBalance(super.getBalance() - amount);
    }
}
