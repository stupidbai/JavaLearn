package com.bai.array;

public class ArrayDemo01 {
    public static void main(String[] args) {
        int[] arrays={1,2,3,4,5};
        for (int i = 0; i <arrays.length ; i++) {
            System.out.println(arrays[i]);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        int sum =0;
        for (int i = 0; i <arrays.length ; i++) {
            sum=sum+arrays[i];
        }
        System.out.println("sum="+sum);
    }
}
