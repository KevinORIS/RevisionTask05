package by.itstep.javatraining.revision.task;

/*	Task 02. The same Numbers [совпадающие числа]
 *
 *	Даны четыре целых числа. Определите, сколько из них совпадающих.
 *	Если числа не совпадают, то необходимо возвратить ноль.
 *
 *	Формат входных данных [input]
 *	На вход метод получает четыре целых числа типа int.
 *
 *	Формат выходных данных [output]
 *	Метод должен возвратить количество совпадающих чисел
 *  или ноль, если таких чисел нет.
 *
 *	[ input 1]: 7 7 7 7
 *	[output 1]: 4
 *
 *	[ input 2]: 7 7 7 8
 *	[output 2]: 3
 *
 *	[ input 3]: 7 7 8 9
 *	[output 3]: 2
 *
 *	[ input 4]: 6 7 8 9
 *	[output 4]: 0
 */

public class Task02 {
    public static int start(int a, int b, int c, int d) {
    	int count = 0;
        
        if (a == b && b == c && c == d) {
            count = 4; 
        } else if ((a == b && b == c) || (b == c && c == d) 
        		|| (a == b && b == d) || (a == c && c == d)) {
            count = 3;
        } else if (a == b || b == c || c == d || a == c || a == d || b == d) {
            count = 2;
        } else {
            count = 0;
        }
        
        return count;
    }
}