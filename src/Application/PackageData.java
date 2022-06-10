package Application;

import Components.*;
import java.io.Serializable;
import java.util.ArrayList;

public class PackageData implements Serializable {
    private String operationType;
    private DebitAccount debitAccount;
    private CreditAccount creditAccount;
    private SavingAccount savingAccount;
    private ArrayList<Account> accounts;
    private ArrayList<DebitAccount> debitAccounts;
    private ArrayList<SavingAccount> savingAccounts;
    private ArrayList<CreditAccount> creditAccounts;
    public PackageData(String operationType, DebitAccount debitAccount) {
        this.operationType = operationType;
        this.debitAccount = debitAccount;
    }

    public PackageData(String operationType, CreditAccount creditAccount) {
        this.operationType = operationType;
        this.creditAccount = creditAccount;
    }

    public PackageData(String operationType, SavingAccount savingAccount) {
        this.operationType = operationType;
        this.savingAccount = savingAccount;
    }

    public PackageData(ArrayList<Account> accounts) {
        this.accounts = getAccounts();
    }
    public PackageData(ArrayList<DebitAccount> debitAccounts, DebitAccount check) {
        this.accounts = getAccounts();
    }
    public PackageData(ArrayList<CreditAccount> creditAccounts, CreditAccount check) {
        this.accounts = getAccounts();
    }
    public PackageData(ArrayList<SavingAccount> savingAccounts, SavingAccount check) {
        this.accounts = getAccounts();
    }

    public PackageData(String operationType) {
        this.operationType = operationType;
    }

    public String getOperationType() {
        return this.operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public DebitAccount getDebitAccount() {
        return debitAccount;
    }

    public void setDebitAccount(DebitAccount debitAccount) {
        this.debitAccount = debitAccount;
    }

    public CreditAccount getCreditAccount() {
        return creditAccount;
    }

    public void setCreditAccount(CreditAccount creditAccount) {
        this.creditAccount = creditAccount;
    }

    public SavingAccount getSavingAccount() {
        return savingAccount;
    }

    public void setSavingAccount(SavingAccount savingAccount) {
        this.savingAccount = savingAccount;
    }

    public ArrayList<Account> getAccounts() {
        ArrayList<Account> allAccounts = new ArrayList<Account>();
        allAccounts.addAll(debitAccounts);
        allAccounts.addAll(creditAccounts);
        allAccounts.addAll(savingAccounts);
        return allAccounts;
    }

    public ArrayList<DebitAccount> getDebitAccounts() {
        return debitAccounts;
    }

    public void setDebitAccounts(ArrayList<DebitAccount> debitAccounts) {
        this.debitAccounts = debitAccounts;
    }

    public ArrayList<SavingAccount> getSavingAccounts() {
        return savingAccounts;
    }

    public void setSavingAccounts(ArrayList<SavingAccount> savingAccounts) {
        this.savingAccounts = savingAccounts;
    }

    public ArrayList<CreditAccount> getCreditAccounts() {
        return creditAccounts;
    }

    public void setCreditAccounts(ArrayList<CreditAccount> creditAccounts) {
        this.creditAccounts = creditAccounts;
    }
}

