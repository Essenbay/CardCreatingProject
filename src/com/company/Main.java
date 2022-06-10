package com.company;

import Application.MainFrame;
import Application.PackageData;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Main {
    public static MainFrame frame;
    public Main() {
    }
    public static void connect(PackageData pd) {
        try {
            Socket socket = new Socket("127.0.0.1", 8080);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            if (pd.getOperationType().equals("ADD DEBIT")) {
                outputStream.writeObject(pd);
            } else if (pd.getOperationType().equals("ADD CREDIT")) {
                outputStream.writeObject(pd);
            }
            if (pd.getOperationType().equals("ADD SAVING")) {
                outputStream.writeObject(pd);
            }
            inputStream.close();
            outputStream.close();
            socket.close();
        } catch (Exception var8) {
            var8.printStackTrace();
        }

    }

    public static void main(String[] args) {
        frame = new MainFrame();
        frame.setVisible(true);
    }
}

