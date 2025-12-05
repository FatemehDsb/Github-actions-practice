package org.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CalculatorWithLogger {

    private final Logger logger ;

    public CalculatorWithLogger(Logger logger){
        this.logger = logger;
    }

    public int  add (int a, int b){
        int result = a + b ;
        logger.log(Level.INFO, "Adding " + a + " + " + b + " = " + result);
        return result;
    }

    public double divide( int a , int b){
        if ( a == 0 | b == 0){
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        double result = a / b;
        logger.log(Level.INFO, a + " / " + b + " = " + result );
        return result;
    }

}
