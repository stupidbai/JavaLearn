package com.bai.net.lesson02;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerDemo01 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            Socket socket =serverSocket.accept();

            InputStream is=socket.getInputStream();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
