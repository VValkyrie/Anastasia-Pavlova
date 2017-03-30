package ru.job4j.condition;

/**.
 *package for program Point.
 * @author Anastasia Pavlova (mailto: a-pavlova-1986@yandex.ru)
 * @version $Id$
 * since 0.1
 */

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area(int x1, int x2, int x3, int y1, int y2, int y3) {
//calculate the triangle area
        double area = 1/2 * ((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1));
        return area;
    }
}
