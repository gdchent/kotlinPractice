package com.gdchent.kotlin.day5;

public class JavaJiecheng {
    public static void main(String ...args){
         long res=getNFactorial(5);

         System.out.println("res="+res);
    }
    public static long getNFactorial(int n){
        if(n==0){
            return 1l;
        }
        return n*getNFactorial(n-1);
    }
}
