package com.bai.struct;

public class SwitchDemo02 {
    public static void main(String[] args) {
        String name ="白云飞";

        switch (name){
            case "白云飞":
                System.out.println("白云飞");
                break;
            case "小白":
                System.out.println("小白");
                break;
            default:
                System.out.println("干啥来");
        }
    }
}
