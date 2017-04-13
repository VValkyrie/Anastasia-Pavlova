package ru.job4j.condition;

/**.
 *package for program Point.
 * @author Anastasia Pavlova (mailto: a-pavlova-1986@yandex.ru)
 * @version $Id$
 * since 0.1
 */

public class Triangle {
    /**
     * Задается описание точек, используемых в классе.
     * @param a - первая точка.
     * @param b - вторая точка.
     * @param c - третья точка.
     */
    private Point a;
    private Point b;
    private Point c;

    /**
     * Метод для присваивания координат точкам a, b, c.
     * @param a - координаты первой точки.
     * @param b - координаты второй точки.
     * @param c - координаты третьей точки.
     */
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

        public double area() {
            /**
             * Метод для вычисления площади треугольника.
             * @param area - площадь треугольника.
             */
//calculate the triangle area
        double area = 0.5 * ((this.b.getX() - this.a.getX()) * (this.c.getY() - this.a.getY()) - ((this.c.getX() - this.a.getX()) * (this.b.getY() - this.a.getY())));
        return area;
    }

    public boolean realTriangle() {
        /**
         * Метод вычисляющий возможность существования треугольника.
         * @param alength - длина первой стороны.
         * @param blength - длина второй стороны.
         * @param clength - длина третьей стороны.
         */
        double alength = Math.sqrt((this.a.getX() - this.c.getX()) ^ 2 + (this.a.getY() - this.c.getY()) ^ 2);
        double blength = Math.sqrt((this.b.getX() - this.a.getX()) ^ 2 + (this.b.getY() - this.a.getY()) ^ 2);
        double clength = Math.sqrt((this.b.getX() - this.c.getX()) ^ 2 + (this.b.getY() - this.c.getY()) ^ 2);
        if (alength + blength > clength && blength + clength > alength && clength + alength > blength) {
            return true;
    }
        else {
            return false;
        }

    }

}
