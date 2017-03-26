package ru.job4j.max;

/**.
* класс для возвращения максимального числа.
*/
public class Max {
/**.
* Метод для определения максимального из двух чисел.
* @param first - первый аргумент.
* @param second - второй аргумент
* @return - возвращает большее число из двух.
*/

	public int max(int first, int second) {
		return (first > second ? first : second);
	}

}