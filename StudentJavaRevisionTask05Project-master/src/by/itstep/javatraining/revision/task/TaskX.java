package by.itstep.javatraining.revision.task;

/*	Task X. Caterpillar [гусеница]
 *
 *	Гусеница ползёт по вертикальному шесту высотой H метров,
 *	поднимаясь за день на A метров, а за ночь спускаясь на B метров.
 *	На какой день гусеница доползёт до вершины шеста?
 *
 *	Примечание
 *  1) Не забудьте про "защиту от дурака": все величины должны быть
 *  положительными и удовлетворять условиям: H > B и A > B.
 *  2) Данную задачу можно решить, используя только встроенные операции
 *  языка, а сам алгоритм реализовать в одну строчку.
 *
 *	Формат входных данных [input]
 *	На вход метод принимает три целых числа типа int: H, A, B.
 *
 *	Формат выходных данных [output]
 *  Метод должно возвратить одно натуральное число
 *  или 0 в случае некорректных данных.
 *
 *	[ input 1]: 10 3 2
 *	[output 1]: 8
 *
 *	[ input 2]: 4 2 3
 *	[output 2]: 0
 *
 *	[ input 3]: 1 3 2
 *	[output 3]: 0
 */

public class TaskX {
    public static int start(int h, int a, int b) {
    	if(h <= 0 || a <= 0 || b <= 0 || h <= b || a <= b) {
    		System.out.println(0);
    		return 0;
    	}
    	int dayCount = 0;
        int currentHeight = 0;

        while (currentHeight < h) {
            dayCount++;
            currentHeight += a;
            
            if (currentHeight >= h) {
                break;
            }
            
            currentHeight -= b;
        }
        
        return dayCount;
    }
}