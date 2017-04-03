package ru.job4j.condition;

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

public class TriangleTest {
    /**
     * класс для тестирования калькулятора.
     */
    @Test

/**.
 * Метод, проверяющий принадлежность точки прямой.
 */
    public void forCheckAreaTriangle() {
            Point a = new Point(1, 3);
            Point b = new Point(10, 10);
            Point c = new Point(3, 3);
            Triangle abc = new Triangle(a, b, c);
            double result = abc.area(1, 3, 10, 10, 3, 3);
            double expected = 24.5;
            assertThat(result, is(expected));
        }
    }


