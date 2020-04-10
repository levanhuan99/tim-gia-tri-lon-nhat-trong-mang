package com.codewithme;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int size;
        int[] array;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("enter your size: ");
            size=scanner.nextInt();
            if (size>10){
                System.out.println("to many");
            }
        }while(size>10);

        array=new int[size];
        int i=0;
        while (i< array.length){
            System.out.println("enter element "+(i+1));
            array[i]=scanner.nextInt();
            i++;
        }
        System.out.println("your array is "+Arrays.toString(array));
        int maxValue=array[0];
       for (int j =1;j<array.length;j++){
           if (array[j]>maxValue){
               maxValue=array[j];
           }
       }

        System.out.println("your max value is "+ maxValue);

    }

//    public static int findMaxNUmber(String arrays[],int number){
//        int maxValue=arrays[0];
//        for (int i=0; i<arrays.length; i++){
//            if (number == arrays[i]){
//
//            }
//
//        }
//    }
}
