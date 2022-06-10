package Database;

import Components.Account;
import Components.CreditAccount;
import Components.DebitAccount;
import Components.SavingAccount;

import java.sql.*;
import java.util.ArrayList;

public class DBManager {
    private static Connection connection;

    public DBManager() {
    }
    public static void addDebit(DebitAccount debitAccount) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO debits (id, balance, dateOfCreation, firstname, lastname, address, phoneNumber, annualMaintenance) " +
                            "VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            if (debitAccount != null) {
                System.out.println("The debit account has been added");
                statement.setLong(1, debitAccount.getId());
                statement.setDouble(2, debitAccount.getBalance());
                statement.setDate(3, debitAccount.getDateOfCreation());
                statement.setString(4, debitAccount.getFirstname());
                statement.setString(5, debitAccount.getLastname());
                statement.setString(6, debitAccount.getAddress());
                statement.setString(7, debitAccount.getPhone_number());
                statement.setDouble(8, debitAccount.getAnnualMaintenance());
            }
            statement.executeUpdate();
            statement.close();
        } catch (Exception var2) {
            var2.printStackTrace();
        }
    }

    public static void addCredit(CreditAccount creditAccount) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO credits (id, balance, dateOfCreation, firstname, lastname, address, phoneNumber, interestRate, maturityDate) " +
                            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            if (creditAccount != null) {
                System.out.println("The credit account has been added");
                statement.setLong(1, creditAccount.getId());
                statement.setDouble(2, creditAccount.getBalance());
                statement.setDate(3, creditAccount.getDateOfCreation());
                statement.setString(4, creditAccount.getFirstname());
                statement.setString(5, creditAccount.getLastname());
                statement.setString(6, creditAccount.getAddress());
                statement.setString(7, creditAccount.getPhone_number());
                statement.setInt(8, creditAccount.getInterestRate());
                statement.setDate(9, creditAccount.getMaturityDate());
            }
            statement.executeUpdate();
            statement.close();
        } catch (Exception var2) {
            var2.printStackTrace();
        }
    }

    public static void addSaving(SavingAccount savingAccount) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO debits (id, balance, dateOfCreation, firstname, lastname, address, phoneNumber, interestRate, storageData) " +
                            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            if (savingAccount != null) {
                System.out.println("The saving account has been added");
                statement.setLong(1, savingAccount.getId());
                statement.setDouble(2, savingAccount.getBalance());
                statement.setDate(3, savingAccount.getDateOfCreation());
                statement.setString(4, savingAccount.getFirstname());
                statement.setString(5, savingAccount.getLastname());
                statement.setString(6, savingAccount.getAddress());
                statement.setString(7, savingAccount.getPhone_number());
                statement.setDouble(8, savingAccount.getInterestRate());
                statement.setDate(9, savingAccount.getStorageDate());
            }
            statement.executeUpdate();
            statement.close();
        } catch (Exception var2) {
            var2.printStackTrace();
        }
    }
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/catalog?useUnicode=true&serverTimezone=UTC", "root", "Noname52484sl");
        } catch (Exception var1) {
            var1.printStackTrace();
        }
    }
}

