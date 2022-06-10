package com.company;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public Server() {
    }

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            while(true) {
                System.out.println("Waiting");
                Socket socket = serverSocket.accept();
                System.out.println("Connected");
                ServerThread st = new ServerThread(socket);
                st.start();
            }
        } catch (Exception var4) {
            var4.printStackTrace();
        }
    }
}