package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)

class CalculatorUnitTest {




    @Test
    public void addShouldLogMessage(){
        Logger loggerMock = mock(Logger.class);
        CalculatorWithLogger calc = new CalculatorWithLogger(loggerMock);

        int result = calc.add(1, 2);
        assertEquals(3, result);
        verify(loggerMock).log(Level.INFO, "Adding 1 + 2 = 3");
    }


    @Test
    public void subtract(){
    Calculator calc = new Calculator();
    int result = calc.substract(5 , 2);
    assertEquals(3, result);
    }

    @Test
    public void divide() {
        Calculator calc = new Calculator();
        double result = calc.divide(4, 2);
        assertEquals(2, result);
    }

    @Test
    public void divideByZeroThrowException(){
    Calculator calc = new Calculator();
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class, () -> calc.divide(4, 0));
        assertEquals("Cannot divide by zero",exception.getMessage());
    }




@Test
    public void divideShouldLog(){
        Logger mockedLogger = mock(Logger.class);
        CalculatorWithLogger calc = new CalculatorWithLogger(mockedLogger);

        double result = calc.divide( 4, 2);
        assertEquals(2, result);
        verify(mockedLogger).log(Level.INFO, "4 / 2 = 2.0");
}


@Test
    public void divideOnNollThrowException(){
        Logger mockedLogger = mock(Logger.class);
        CalculatorWithLogger calc = new CalculatorWithLogger(mockedLogger);

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class, () -> calc.divide(4, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
}


//3. Multiplikation ska hantera noll korrekt

    @Test
    public void multiplyShouldHandleNollCorrect(){
        Calculator calc = new Calculator();
        int result = calc.multiply(5, 0);
        assertEquals(0, result);
    }

    @Test
    public void divideShouldCorrectResult(){
        Calculator calc = new Calculator();
        int result = calc.divide(10, 5);
        assertEquals(2, result);
    }

    @Test
    public void divideByNollException(){
        Calculator calc = new Calculator();
        ArithmeticException exception = assertThrows(
                ArithmeticException.class, ()-> calc.divide(10, 0)
        );
        assertEquals("cannot divide by noll", exception.getMessage());
    }

    @Test
    public void absoluteValueShouldReturnPositive(){
        Calculator cal= new Calculator();
        int result = cal.absoluteValue(5);
        assertEquals(5, result);
    }

    @Test
    public void isEvenShouldControlled(){
        Calculator calc = new Calculator();
        boolean result = calc.isEven(5);
        assertFalse(result);
    }









}