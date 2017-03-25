package ru.job4j.calculator;

/**.
 *package for program Calculator.
 *
 * @author Anastasia Pavlova (mailto: a-pavlova-1986@yandex.ru)
 * @version $Id$
 * since 0.1
 */


public class Calculator {
/**
* Класс Calculate для вычисления математических операций.
*/
	private double result;

/**
* метод для сложения.
*@param first первый агрумент.
*@param second второй аргумент.
*/

    public void add(double first, double second) {
        this.result = first + second;
    }

/**
* метод для вычитания.
*@param first первый агрумент.
*@param second второй аргумент.
*/

    public void subtraction(double first, double second) {
        this.result = first - second;
    }

/**
* Метод для умножения.
*@param first первый аргумент.
*@param second второй аргумент.
*/
    public void multiplication(double first, double second) {
        this.result = first * second;
    }

/**
* метод для деления.
*@param first первый аргумент.
*@param second второй аргумент.
*/
    public void segmentation(double first, double second) {
        this.result = first / second;
    }

/**
* метод для возвращения результата.
*@return результат.
*/

    public double getResult() {
        return this.result;
    }
}