package com.bai.net.lesson02;

import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClientDemo01 {
    public static void main(String[] args) {

        try {
            InetAddress serverIP=InetAddress.getByName("127.0.0.1");

            int port =9999;

            Socket socket = new Socket(serverIP,port);
            OutputStream outputStream= socket.getOutputStream();
            outputStream.write("bai".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
