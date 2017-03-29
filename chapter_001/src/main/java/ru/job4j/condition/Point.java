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

	public class Point {
	/**.
	* Класс Point описывает координаты точки в пространстве.
	*@param x - абсцисса.
	*@param y - ордината.
 	*@return результат.
	*/
		private int x;
		private int y;

	/**.
	 * конструктор Point описывает координаты точки.
	 * @param x - координата точки по оси x.
	 * @param y - координата точки по оси ую
	 */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/**.
	 * Метод getX возвращает координату x.
	 *@return - возвращает координату х.
	 */
	public int getX() {
		return this.x;
	}

	/**.
	 * Метод getX возвращает координату y.
	 *@return - возвращает координату y.
	 */
	public int getY() {
		return this.y;
	}
	/**.
	 * Метод проверяет истинность
	 * @return - возвращает значение у, результат.
	 * @param a - кооэффициент a.
	 * @param b - кооэффициент b.
	 */
	public boolean is(int a, int b) {
    return this.y == a * x + b;
		}

	}


