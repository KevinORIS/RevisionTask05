package by.itstep.javatraining.revision.task;

/*	Task 08. Color Mixer [цветовой микшер]
 *
 *  Красный (red), синий (blue) и желтый (yellow) называются основными цветами,
 *  потому что их нельзя получить путем смешения других цветов.
 *  При смешивании двух основных цветов получается вторичный цвет:
 *  1) если смешать красный и синий, то получится фиолетовый (violet);
 *  2) если смешать красный и желтый, то получится оранжевый (orange);
 *  3) если смешать синий и желтый, то получится зеленый (green).
 *
 *  Определите цвет, который получается при смешивании двух основных цветов.
 *  Если передаются другие цвета, т.е. неосновные («красный», «синий» или «желтый»),
 *  или значение null, то программа должна вывести сообщение об ошибке "Error".
 *
 *  Примечание
 *  1) На вход могут быть заданы два одинаковых цвета, тогда на выходе должен быть
 *  получен тот же самый цвет.
 *  2) Не забудьте про значение null, т.к. строки - это ссылочные типы данных.
 *
 *  Формат входных данных [input]
 *  На вход метод получает две строки - основные цвета цветового микшера.
 *
 *  Формат выходных данных [output]
 *  Метод должен возвратить строку (- полученный цвет) или "error",
 *  если заданы некорректные данные.
 *
 *	[ input 1]: red blue
 *	[output 1]: violet
 *
 *	[ input 2]: blue yellow
 *	[output 2]: green
 *
 *	[ input 3]: red red
 *	[output 3]: red
 *
 *	[ input 4]: pink red
 *	[output 4]: error
 *
 *	[ input 5]: null red
 *	[output 5]: error
 */

public class Task08 {
	public static String start(String color1, String color2) {
		if (color1 == null || color2 == null 
				|| (!color1.equals("red") && !color1.equals("blue") && !color1.equals("yellow")) 
				|| (!color2.equals("red") && !color2.equals("blue") && !color2.equals("yellow"))) {
			return "error";
		}

		String result = "green";

		if ((color1.equals("red")) && color2.equals("blue") 
				|| (color1.equals("blue")) && color2.equals("red")) {
			result = "violet";
		} else if (color1.equals("red") && color2.equals("yellow") 
				|| color1.equals("yellow") && color2.equals("red")) {
			result = "orange";
		} else if (color1.equals(color2)) {
			result = color1;
		}
		return result;
	}
}