package com.bai.net.lesson03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpClientDemo01 {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket =new DatagramSocket();

        InetAddress serverIP=InetAddress.getByName("127.0.0.1");

        int port =9999;
        String msg="nihao";
        DatagramPacket datagramPacket = new DatagramPacket(msg.getBytes(),0,msg.getBytes().length,serverIP,port);

        socket.send(datagramPacket);

        socket.close();

    }
}
