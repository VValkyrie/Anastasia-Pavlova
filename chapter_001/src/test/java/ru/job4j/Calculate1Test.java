package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Anastasia Pavlova (mailto:a-pavlova-1986@yandex.ru)
* @version $Id$
* @since 0.1
*/

public class Calculate1Test {
/**
* Test add.
*/

@Test

    public void whenAddOneToOneThenTwo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Calculate1.main(null);
        assertThat(
        out.toString(),
        is(
        String.format(
        "Hello, world%s",
        System.getProperty("line.separator")
        )
    )
);
    }
}