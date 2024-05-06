package by.itstep.javatraining.revision.task;

/*	Task 05. Amount of days [количество дней]
 *
 *  Даны порядковый номер месяца и номер года.
 *  Определите количество дней в заданном месяце соответствующего года.
 *
 *  Примечание
 *  1) Не забудьте про "защиту от дурака": если номер месяца некорректен,
 *  то нужно возвратить 0.
 *  2) Постарайтесь реализовать основной алгоритм так, чтобы в нём было
 *  не более двух условных конструкций.
 *
 *  Формат входных данных [input]
 *  На вход метод получает два целых числа типа int.
 *
 *  Формат выходных данных [output]
 *  Метод должно возвратить количество дней в заданном месяце
 *  или ноль (при неверных данных месяца).
 *
 *	[ input 1]: 4 2023
 *	[output 1]: 30
 *
 *	[ input 2]: 5 2023
 *	[output 2]: 31
 *
 *	[ input 3]: 2 1900
 *	[output 3]: 28
 *
 *	[ input 4]: 2 2000
 *	[output 4]: 29
 *
 *	[ input 5]: -7 2023
 *	[output 5]: 0
 *
 *	[ input 6]: 0 2023
 *	[output 6]: 0
 *
 *	[ input 7]: 13 2023
 *	[output 7]: 0
 */

public class Task05 {
	public static int start(int month, int year) {
		if (month < 1 || month > 12) {
			return 0;
		}

		int day = 0;

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31; break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30; break;
		case 2:
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				day = 29;
			} else {
				day = 28;
			}
		}
		return day;
	}
}