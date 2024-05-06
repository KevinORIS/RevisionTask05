package by.itstep.javatraining.revision.task;

/*	Task 06. The Average Number [среднее число]
 *
 *	Даны три различных числа. Определите среднее по величине число.
 *
 *	Примечание
 *	1) Не забудьте про "защиту от дурака": все три числа должны быть различными.
 *
 *	Формат входных данных [input]
 *	На вход метод получает три различных целых числа типа int.
 *
 *	Формат выходных данных [output]
 *	Метод должен возвратить среднее по величине число или ноль,
 *  если среди чисел есть одинаковые.
 *
 *	[ input 1]: 1 2 3
 *	[output 1]: 2
 *
 *	[ input 2]: 17 23 11
 *	[output 2]: 11
 *
 *	[ input 3]: 7 7 7
 *	[output 3]: 0
 *
 *	[ input 4]: 5 7 7
 *	[output 4]: 0
 */

public class Task06 {
	public static int start(int a, int b, int c) {
		if (a == b || a == c || b == c) {
			return 0;
		}
		int result = c;
		if ((a > b && a < c) || (a < b && a > c)) {
			result = a;
		} else if ((b > a && b < c) || (b < a && b > c)) {
			result = b;
		}
		return result;
	}
}