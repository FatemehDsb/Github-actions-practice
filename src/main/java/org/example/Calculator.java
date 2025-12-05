package org.example;

import java.util.List;

public class Calculator {

    public int add (int a, int b){
        return a + b ;
    }
    public int substract( int a , int b){
        return  a - b ;
    }

    public int divide( int a , int b){
        if ( b == 0 | a == 0){
            throw new ArithmeticException ("cannot divide by noll");
        }
        return a / b;
    }

    public int multiply( int a , int b){
        return a * b;
    }

    public int absoluteValue(int a){
        if(a<0)
        { a = a * -1;
        }
        return a;
    }

    public boolean isEven(int a){
        if(a%2 == 0){
            return true;
        }
        return false;
    }




}
