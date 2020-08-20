package com.bai.scanner;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("使用next方式接受");

        if(sc.hasNext()==true){
            String str =sc.next();
            System.out.println("输入的内容为："+str);
        }
        sc.close();

    }
}
