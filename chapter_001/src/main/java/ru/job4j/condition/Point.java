package ru.job4j.condition;

/**.
 *package for program Point.
 *
 * @author Anastasia Pavlova (mailto: a-pavlova-1986@yandex.ru)
 * @version $Id$
 * since 0.1
 */
	public class Point {
	/**.
	*Класс Point описывает координаты точки в пространстве.
	*/	
		private int x;
		private int y;
	}

	public Point(int x, int y) {
		/**.
        * конструктор Point описывает координаты точки.
		* @param x - координата точки по оси x.
		* @param y - координата точки по оси ую
		*/

		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		/**.
		* Метод getX возвращает координату x.
		*@return - возвращает координату х.
		*/
		return this.x;
	}
	
	public int getY() {
		/**.
		* Метод getX возвращает координату y.
		*@return - возвращает координату y.
		*/
		return this.y;
	}
	
	public boolean is(int a, int b) {
		/**.
		 * Метод проверяет истинность
		 */
    return this.y == a*x + b;
		}

	}

	
