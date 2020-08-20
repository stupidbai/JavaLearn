package com.bai.scanner;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("使用nextLine方式接受");

        if(sc.hasNextLine()==true){
            String str =sc.nextLine();
            System.out.println("输入的内容为："+str);
        }
        sc.close();
    }
}
