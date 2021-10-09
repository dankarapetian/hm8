package com.company;
public class hm1 {
    public static void main(String[] args) {
        System.out.println(factorial(6));

    }
    static long factorial(int n){


        if (n == 0){
            return 1;
        }


        else{
            return n  * factorial(n - 1);
        }
    }
}
