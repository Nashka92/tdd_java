package org.exemple.Gradingcalculator;


import org.example.gradingcalculator.GradingCalculator;
import org.junit.Assert;
import org.junit.Test;

public class GradingCalculatorTest {

    // instanciation
    private GradingCalculator calculator;

    @Test
    public void whenGetGrade_95_90_Then_A() {
        // Arrange
        calculator = new GradingCalculator(95, 90);

        // Act
        char result = calculator.getGrade();

        // Assert
        Assert.assertEquals('A', result);

    }

    @Test
    public void whenGetGrade_85_90_Then_B() {
        // Arrange
        calculator = new GradingCalculator(85, 90);


        // Act
        char result = calculator.getGrade();


        // Assert
        Assert.assertEquals('B', result);


    }

    @Test
    public void whenGetGrade_65_90_Then_C() {
        // Arrange
        calculator = new GradingCalculator(65, 90);


        // Act
        char result = calculator.getGrade();


        // Assert
        Assert.assertEquals('C', result);

    }

    @Test
    public void whenGetGrade_95_65_Then_B() {
        // Arrange
        calculator = new GradingCalculator(95, 65);


        // Act
        char result = calculator.getGrade();


        // Assert
        Assert.assertEquals('B', result);


    }

    @Test
    public void whenGetGrade_95_55_Then_F() {
        // Arrange
        calculator = new GradingCalculator(95, 55);


        // Act
        char result = calculator.getGrade();


        // Assert
        Assert.assertEquals('F', result);

    }

    @Test
    public void whenGetGrade_65_55_Then_F() {
        // Arrange
        calculator = new GradingCalculator(65, 55);


        // Act
        char result = calculator.getGrade();


        // Assert
        Assert.assertEquals('F', result);

    }

    @Test
    public void whenGetGrade_50_90_Then_F() {
        // Arrange
        calculator = new GradingCalculator(50, 90);


        // Act
        char result = calculator.getGrade();


        // Assert
        Assert.assertEquals('F', result);
    }
}