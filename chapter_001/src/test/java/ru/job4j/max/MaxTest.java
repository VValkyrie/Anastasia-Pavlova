package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**.
 * Test.
 * @author Anastasia Pavlova (mailto:a-pavlova-1986@yandex.ru)
 * @version $Id$
 * @since 0.1
 */

public class MaxTest {
    /**
     * класс для тестирования .
     */
    @Test

	/**.
	* Метод для тестирования public int max
	*/
    public void whenReturnTheMax() {
        Max value = new Max();
        double result = value.max(2, 1);
        double expected = 2;
		assertThat(result, is(expected));
    }
}