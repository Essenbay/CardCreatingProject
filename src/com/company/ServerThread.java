package com.company;

import Components.Account;
import Application.PackageData;
import Components.CreditAccount;
import Components.DebitAccount;
import Components.SavingAccount;
import Database.DBManager;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ServerThread extends Thread {
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            DBManager manager = new DBManager();
            ObjectInputStream inputStream = new ObjectInputStream(this.socket.getInputStream());
            PackageData packageData = null;

            while((packageData = (PackageData)inputStream.readObject()) != null) {
                if (packageData.getOperationType().equals("ADD DEBIT")) {
                    DebitAccount debitAccount = packageData.getDebitAccount();
                    DBManager.addDebit(debitAccount);
                } else if (packageData.getOperationType().equals("ADD CREDIT")) {
                    CreditAccount creditAccount = packageData.getCreditAccount();
                    DBManager.addCredit(creditAccount);}
                else if (packageData.getOperationType().equals("ADD SAVING")) {
                    SavingAccount savingAccount = packageData.getSavingAccount();
                    DBManager.addSaving(savingAccount);}
                }
            inputStream.close();
            this.socket.close();
        } catch (Exception var7) {
            var7.printStackTrace();
        }

    }
}

