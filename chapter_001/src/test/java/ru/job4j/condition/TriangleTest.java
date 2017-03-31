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
        Triangle abc = new Triangle();
        double result = abc.area(1, 3, 10, 10, 3, 3);
        double expected = 24.5;
        assertThat(result, is(expected));
    }
}

