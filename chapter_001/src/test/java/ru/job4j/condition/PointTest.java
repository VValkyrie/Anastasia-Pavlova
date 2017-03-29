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

public class PointTest {
    /**
     * класс для тестирования калькулятора.
     */
    @Test
/**.
 * Метод, проверяющий принадлежность точки прямой.
 */
    public void ifPointLieOnLine() {
        Point apoint = new Point(1, 5);
        boolean result = apoint.is(2, 3);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    /**.
     * Метод проверяет, что точка прямой не принадлежит.
     */
    public void ifPointDontLieOnLine() {
        Point apoint = new Point(1, 19);
        boolean result = apoint.is(15, 3);
        boolean expected = false;
        assertThat(result, is(expected));
    }
}
