package com.bai.array;

public class ArrayDemo02 {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};

        for (int a: array) {
            System.out.println(a);
        }

        System.out.println(reverse(array));;
    }

    //反转数组
    public static int[] reverse(int[] arrays){
        int[] result =new int[arrays.length];
        for (int i = 0,j=result.length-1; i <arrays.length ; i++,j--) {
            result[j]=arrays[i];
        }


        return result;
    }
}
