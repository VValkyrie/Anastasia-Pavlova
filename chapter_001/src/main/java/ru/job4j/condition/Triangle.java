package ru.job4j.condition;

/**.
 *package for program Point.
 * @author Anastasia Pavlova (mailto: a-pavlova-1986@yandex.ru)
 * @version $Id$
 * since 0.1
 */

/**.
 * Класс Point описывает координаты точки в пространстве.
 *@return результат.
 */

public class Triangle {
    /**.
     * Точка a.
     */
    private Point a;

    /**.
     * Точка b.
     */
    private Point b;

    /**.
     * Точка c.
     */

    private Point c;

    /**.
     * Конструктор.
     * @param a - координаты первой точки.
     * @param b - координаты второй точки.
     * @param c - координаты третьей точки.
     */
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**.
     * Метод для вычисления площади треугольника.
     * @return - возвращает результат.
     */

    public double area() {

//calculate the triangle area
        double area = Math.abs(0.5 * ((this.b.getX() - this.a.getX()) * (this.c.getY() - this.a.getY()) - ((this.c.getX() - this.a.getX()) * (this.b.getY() - this.a.getY()))));


        /**.
         * @param area - площадь треугольника.
         */
        return area;
    }

    /**.
     * Метод, вычисляющий возможность существования треугольника.
     * @return - возвращает  результат.
     */

    public boolean realTriangle() {
        /**.
         * Метод, вычисляющий возможность существования треугольника.
         * @param alength - длина первой стороны.
         * @param blength - длина второй стороны.
         * @param clength - длина третьей стороны.
         * @param return - возвращает результат.
         */
        double alength = Math.sqrt((this.a.getX() - this.c.getX()) ^ 2 + (this.a.getY() - this.c.getY()) ^ 2);
        double blength = Math.sqrt((this.b.getX() - this.a.getX()) ^ 2 + (this.b.getY() - this.a.getY()) ^ 2);
        double clength = Math.sqrt((this.b.getX() - this.c.getX()) ^ 2 + (this.b.getY() - this.c.getY()) ^ 2);
        return (alength + blength > clength && blength + clength > alength && clength + alength > blength);

    }

}
