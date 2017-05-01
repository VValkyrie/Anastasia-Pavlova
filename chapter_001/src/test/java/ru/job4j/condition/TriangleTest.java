package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

/**.
 * Test.
 *
 * @author Anastasia Pavlova (mailto:a-pavlova-1986@yandex.ru)
 * @version $Id$
 * @since 0.1
 */

public class TriangleTest {
    /**.
     * Метод, проверяющий принадлежность точки прямой.
     */
    @Test

    /**
     * @param a - точка а.
     * @param b - точка b.
     * @param c - точка c.
     * @param x - координаты абсциссы.
     * @param y - координаты ординаты.
     * @param result - передает результат.
     * @param expected - ожидаемый результат.
     */
    public void forCheckAreaTriangle() {
            Point a = new Point(1, 3);
            Point b = new Point(10, 10);
            Point c = new Point(3, 3);
            Triangle abc = new Triangle(a, b, c);
            double result = abc.area();
            double expected = 24.5;
            assertThat(result, is(expected));
        }

    /**.
     * Метод для проверки в случае, если треугольник не существует.
     */

    @Test
    public void whenPointsNotInLineThenExist() {
        Point a = new Point(1, 2);
        Point b = new Point(2, 3);
        Point c = new Point(3, 4);
        Triangle abc = new Triangle(a, b, c);
        boolean result = abc.realTriangle();
        boolean expected = false;
        assertThat(result, is(expected));
    }

   /**.
     * Метод, проверяющий возможность существования треугольника.
     */
   public void whenPointInLineThenExist() {
       Point a = new Point(1, 3);
       Point b = new Point(10, 10);
       Point c = new Point(3, 3);
       Triangle abc = new Triangle(a, b, c);
       boolean result = abc.realTriangle();
       boolean expected = true;
       assertThat(result, is(closeTo(24.5, 0.01)));
       }


}



