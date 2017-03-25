package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Anastasia Pavlova (mailto:a-pavlova-1986@yandex.ru)
 * @version $Id$
 * @since 0.1
 */

public class CalculatorTest {
    /**
     * класс для тестирования калькулятора.
     */
    @Test

    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    /**
     * метод для тестирования операции вычитания.
     */
    public void whenSubtractionOneMinusOneThenZero() {
        Calculator calc1 = new Calculator();
        calc1.subtraction(1D, 1D);
        double result = calc1.getResult();
        double expected = 0D;
        assertThat(result, is(expected));
    }
    /**
     * метод для тестирования операции умножения.
     */
    public void whenMultiplicationOneMultiplyOneThenOne() {
        Calculator calc2 = new Calculator();
        calc2.multiplication(1D, 1D);
        double result = calc2.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }
    /**
     * метод для тестирования операции деления.
     */
    public void whenSegmentationOneDivideOneThenOne() {
        Calculator calc3 = new Calculator();
        calc3.segmentation(1D, 1D);
        double result = calc3.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }

}
