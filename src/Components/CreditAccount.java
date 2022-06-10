package Components;

import java.sql.Date;
import java.util.ArrayList;

public class CreditAccount extends Account{
    private int interestRate;
    private Date maturityDate;

    public CreditAccount() {
    }

    public CreditAccount(Long id, double balance, Date dateOfCreation, int interestRate, Date maturityDate) {
        super(id, balance, dateOfCreation);
        this.interestRate = interestRate;
        this.maturityDate = maturityDate;
    }

    public CreditAccount(Account account) {
        super(account);
        this.interestRate = 10;
        this.maturityDate = (Date)null;
    }

    public CreditAccount(Date dateOfCreation, String firstname, String lastname, String address, String phone_number, int interestRate, Date maturityDate) {
        super(dateOfCreation, firstname, lastname, address, phone_number);
        this.interestRate = interestRate;
        this.maturityDate = maturityDate;
    }

    public CreditAccount(Long id, double balance, Date dateOfCreation, String firstname, String lastname, String address, String phone_number, int interestRate, Date maturityDate) {
        super(id, balance, dateOfCreation, firstname, lastname, address, phone_number);
        this.interestRate = interestRate;
        this.maturityDate = maturityDate;
    }

    public CreditAccount(Long id, double balance,
                         int creationDay, int creationMonth, int creationYear,
                         String firstname, String lastname, String address, String phone_number, int interestRate,
                         int matDay, int matMonth, int matYear) {
        super(id, balance, creationDay, creationMonth, creationYear, firstname, lastname, address, phone_number);
        this.interestRate = interestRate;
        this.maturityDate = new Date(matYear, matMonth, matDay);
    }

    public CreditAccount(Long id, double balance, Date dateOfCreation, String firstname, String lastname, String address, String phone_number) {
        super(id, balance, dateOfCreation, firstname, lastname, address, phone_number);
    }

    public String toString() {
        return super.toString() +
                " CreditAccount{" + "interestRate=" + interestRate + ", maturityDate=" + maturityDate + '}';
    }
    @Override
    public boolean equals(Object obj){
        return super.equals(obj);
    }
    @Override
    public int compareTo(Account account){
        int result = this.getId().compareTo(account.getId());
        if(result == 0)
            result = this.getFirstname().compareTo(account.getFirstname());
        return result;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public Date getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(Date maturityDate) {
        this.maturityDate = maturityDate;
    }

    public void deposit(double amount){
        super.setBalance(getBalance() - amount);
    }
}
