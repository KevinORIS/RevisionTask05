package by.itstep.javatraining.revision.test;

import by.itstep.javatraining.revision.task.*;

public class TaskTester {

    public static String RIGHT = "completed successfully. WELL DONE!!!";
    public static String WRONG = "was not running successfully. Something was WRONG!";

    private static String getResult(String task, boolean result) {
        return task + " " + (result ? RIGHT : WRONG);
    }

    public static String testingTask01() {
        boolean result = Task01.start(12, 3) == 15
                && Task01.start(1, 3) == 3
                && Task01.start(2, 3) == 3
                && Task01.start(3, 3) == 6
                && Task01.start(11, 3) == 12
                && Task01.start(13, 3) == 15
                && Task01.start(14, 3) == 15
                && Task01.start(15, 3) == 18
                && Task01.start(1, 1) == 2
                && Task01.start(0, 1) == 0
                && Task01.start(1, 0) == 0
                && Task01.start(-1, 1) == 0
                && Task01.start(1, -1) == 0;

        return getResult("Task 01 [Next Multiple Number]", result);
    }

    public static String testingTask02() {
        boolean result = Task02.start(7, 7, 7, 7) == 4
                && Task02.start(7, 7, 7, 8) == 3
                && Task02.start(7, 7, 8, 9) == 2
                && Task02.start(6, 7, 8, 9) == 0
                && Task02.start(-7, -7, -7, -7) == 4
                && Task02.start(7, 7, 8, 7) == 3
                && Task02.start(7, 8, 7, 7) == 3
                && Task02.start(8, 7, 7, 7) == 3
                && Task02.start(7, 8, 9, 7) == 2
                && Task02.start(7, 9, 8, 7) == 2
                && Task02.start(8, 9, 7, 7) == 2;

        return getResult("Task 02 [The same Numbers]", result);
    }

    public static String testingTask03() {
        boolean result = Task03.start(1, 2, 3, 4).trim().equalsIgnoreCase("Ascending arithmetic progression.")
                && Task03.start(2, 4, 6, 8).trim().equalsIgnoreCase("Ascending arithmetic progression.")
                && Task03.start(15, 10, 5, 0).trim().equalsIgnoreCase("Descending arithmetic progression.")
                && Task03.start(7, 7, 7, 7).trim().equalsIgnoreCase("Monotonic arithmetic progression.")
                && Task03.start(2, 4, 8, 16).trim().equalsIgnoreCase("No arithmetic progression.")

                && Task03.start(3, 5, 7, 9).trim().equalsIgnoreCase("Ascending arithmetic progression.")
                && Task03.start(9, 11, 13, 15).trim().equalsIgnoreCase("Ascending arithmetic progression.")
                && Task03.start(8, 10, 12, 14).trim().equalsIgnoreCase("Ascending arithmetic progression.")
                && Task03.start(-15, -13, -11, -9).trim().equalsIgnoreCase("Ascending arithmetic progression.")
                && Task03.start(-9, -7, -5, -3).trim().equalsIgnoreCase("Ascending arithmetic progression.")
                && Task03.start(-4, -1, 2, 5).trim().equalsIgnoreCase("Ascending arithmetic progression.")
                && Task03.start(-16, -12, -8, -4).trim().equalsIgnoreCase("Ascending arithmetic progression.")

                && Task03.start(-2, -7, -12, -17).trim().equalsIgnoreCase("Descending arithmetic progression.")
                && Task03.start(17, 12, 7, 2).trim().equalsIgnoreCase("Descending arithmetic progression.")
                && Task03.start(37, 31, 25, 19).trim().equalsIgnoreCase("Descending arithmetic progression.")
                && Task03.start(-19, -25, -31, -37).trim().equalsIgnoreCase("Descending arithmetic progression.")
                && Task03.start(5, 2, -1, -4).trim().equalsIgnoreCase("Descending arithmetic progression.")

                && Task03.start(-7, -7, -7, -7).trim().equalsIgnoreCase("Monotonic arithmetic progression.")
                && Task03.start(0, 0, 0, 0).trim().equalsIgnoreCase("Monotonic arithmetic progression.")

                && Task03.start(1, 1, 2, 3).trim().equalsIgnoreCase("No arithmetic progression.")
                && Task03.start(3, 2, 1, 1).trim().equalsIgnoreCase("No arithmetic progression.")
                && Task03.start(2, 3, 5, 7).trim().equalsIgnoreCase("No arithmetic progression.")
                && Task03.start(7, 5, 3, 2).trim().equalsIgnoreCase("No arithmetic progression.")
                && Task03.start(-1, -1, -2, -3).trim().equalsIgnoreCase("No arithmetic progression.")
                && Task03.start(-3, -2, -1, -1).trim().equalsIgnoreCase("No arithmetic progression.")
                && Task03.start(-2, -3, -5, -7).trim().equalsIgnoreCase("No arithmetic progression.")
                && Task03.start(-7, -5, -3, -2).trim().equalsIgnoreCase("No arithmetic progression.")
                && Task03.start(2, 3, 7, 8).trim().equalsIgnoreCase("No arithmetic progression.")
                && Task03.start(8, 7, 3, 2).trim().equalsIgnoreCase("No arithmetic progression.");

        return getResult("Task 03 [Arithmetic progression]", result);
    }

    public static String testingTask04() {
        boolean result = !Task04.start(2023)
                && Task04.start(1984)
                && Task04.start(2000)
                && Task04.start(0)
                && !Task04.start(-100)

                && Task04.start(1600)
                && Task04.start(1704)
                && Task04.start(1808)
                && Task04.start(1912)
                && Task04.start(2124)
                && Task04.start(2248)
                && Task04.start(2352)

                && !Task04.start(3000)
                && !Task04.start(1700)
                && !Task04.start(1800)
                && !Task04.start(1900)
                && !Task04.start(2100)
                && !Task04.start(2200)
                && !Task04.start(2300)

                && Task04.start(-1600)
                && Task04.start(-1704)
                && Task04.start(-1808)
                && Task04.start(-1912)
                && Task04.start(-2124)
                && Task04.start(-2248)
                && Task04.start(-2352)

                && !Task04.start(-3000)
                && !Task04.start(-1700)
                && !Task04.start(-1800)
                && !Task04.start(-1900)
                && !Task04.start(-2100)
                && !Task04.start(-2200)
                && !Task04.start(-2300);

        return getResult("Task 04 [The Leap Year]", result);
    }

    public static String testingTask05() {
        boolean result = Task05.start(4, 2023) == 30
                && Task05.start(5, 2023) == 31
                && Task05.start(2, 1900) == 28
                && Task05.start(-7, 2023) == 0
                && Task05.start(0, 2023) == 0
                && Task05.start(13, 2023) == 0

                && Task05.start(2, 2023) == 28
                && Task05.start(2, 1984) == 29
                && Task05.start(2, 2000) == 29
                && Task05.start(2, 0) == 29
                && Task05.start(2, -100) == 28
                && Task05.start(2, -2300) == 28
                && Task05.start(2, 2300) == 28

                && Task05.start(6, 2023) == 30
                && Task05.start(9, 2023) == 30
                && Task05.start(11, 2023) == 30

                && Task05.start(1, 2023) == 31
                && Task05.start(3, 2023) == 31
                && Task05.start(7, 2023) == 31
                && Task05.start(8, 2023) == 31
                && Task05.start(10, 2023) == 31
                && Task05.start(12, 2023) == 31;

        return getResult("Task 05 [Amount of days]", result);
    }

    public static String testingTask06() {
        boolean result = Task06.start(1, 2, 3) == 2
                && Task06.start(17, 23, 11) == 17
                && Task06.start(7, 7, 7) == 0
                && Task06.start(5, 7, 7) == 0

                && Task06.start(7, 5, 7) == 0
                && Task06.start(7, 7, 5) == 0
                && Task06.start(0, 0, 0) == 0
                && Task06.start(-7, -7, -7) == 0
                && Task06.start(-7, -5, -7) == 0
                && Task06.start(-7, -7, -5) == 0
                && Task06.start(7, -5, 7) == 0
                && Task06.start(7, 7, -5) == 0

                && Task06.start(23, 11, 17) == 17
                && Task06.start(11, 17, 23) == 17
                && Task06.start(-1, -2, -3) == -2
                && Task06.start(-2, -1, -3) == -2
                && Task06.start(-3, -1, -2) == -2
                && Task06.start(-7, 5, 7) == 5
                && Task06.start(7, -7, 5) == 5
                && Task06.start(7, 5, -7) == 5
                && Task06.start(5, 7, -7) == 5;

        return getResult("Task 06 [The Average Number]", result);
    }

    public static String testingTask07() {
        boolean result = Task07.start(0).trim().equalsIgnoreCase("green")
                && Task07.start(1).trim().equalsIgnoreCase("red")
                && Task07.start(2).trim().equalsIgnoreCase("black")
                && Task07.start(-1).trim().equalsIgnoreCase("error")
                && Task07.start(37).trim().equalsIgnoreCase("error");

        int[] reds = {3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36};
        int[] blacks = {4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35};

        for (int item : reds) {
            result = result && Task07.start(item).trim().equalsIgnoreCase("red");
        }

        for (int item : blacks) {
            result = result && Task07.start(item).trim().equalsIgnoreCase("black");
        }

//        for (int i = 1; i <= 36; i += 2) {
//            result = result && Task06.task06(i).trim().equalsIgnoreCase("red");
//            if (i == 9) {
//                i = 12;
//            } else if (i == 18) {
//                i = 19;
//            } else if (i == 27) {
//                i = 30;
//            }
//        }
//
//        for (int i = 2; i <= 36; i += 2) {
//            result = result && Task06.task06(i).trim().equalsIgnoreCase("black");
//            if (i == 10) {
//                i = 11;
//            } else if (i == 17) {
//                i = 20;
//            } else if (i == 28) {
//                i = 29;
//            }
//        }

        return getResult("Task 07 [Roulette Wheel Colors]", result);
    }

    public static String testingTask08() {
        boolean result = Task08.start("red", "blue").trim().equalsIgnoreCase("violet")
                && Task08.start("blue", "yellow").trim().equalsIgnoreCase("green")
                && Task08.start("red", "red").trim().equalsIgnoreCase("red")
                && Task08.start("pink", "red").trim().equalsIgnoreCase("error")

                && Task08.start("blue", "red").trim().equalsIgnoreCase("violet")
                && Task08.start("red", "yellow").trim().equalsIgnoreCase("orange")
                && Task08.start("yellow", "red").trim().equalsIgnoreCase("orange")
                && Task08.start("yellow", "blue").trim().equalsIgnoreCase("green")

                && Task08.start("yellow", "yellow").trim().equalsIgnoreCase("yellow")
                && Task08.start("blue", "blue").trim().equalsIgnoreCase("blue")

                && Task08.start("", "blue").trim().equalsIgnoreCase("error")
                && Task08.start("blue", "").trim().equalsIgnoreCase("error")
                && Task08.start("", "").trim().equalsIgnoreCase("error")
                && Task08.start(null, "blue").trim().equalsIgnoreCase("error")
                && Task08.start("blue", null).trim().equalsIgnoreCase("error")
                && Task08.start(null, null).trim().equalsIgnoreCase("error");

        return getResult("Task 08 [Color Mixer]", result);
    }

    public static String testingTask09() {
        boolean result = Task09.start(3, 5, 2023).trim().equals("04.05.2023")
                && Task09.start(28, 2, 2023).trim().equals("01.03.2023")
                && Task09.start(28, 2, 2020).trim().equals("29.02.2020")
                && Task09.start(30, 2, 2020).trim().equalsIgnoreCase("Error.")
                && Task09.start(1, 13, 2020).trim().equalsIgnoreCase("Error.")
                && Task09.start(1, -1, 2020).trim().equalsIgnoreCase("Error.")
                && Task09.start(1, 1, -1).trim().equalsIgnoreCase("Error.")
                && Task09.start(29, 2, 2023).trim().equalsIgnoreCase("Error.")
                && Task09.start(29, 2, 1900).trim().equalsIgnoreCase("Error.")
                && Task09.start(29, 2, 1800).trim().equalsIgnoreCase("Error.");

        int[] month30 = {2, 4, 6, 9, 11};

        for (int month : month30) {
            result = result && Task09.start(31, month, 2020).trim().equalsIgnoreCase("Error.");
        }

        for (int month = 1; month <= 12; month++) {
            result = result && Task09.start(-1, month, 2020).trim().equalsIgnoreCase("Error.");
            result = result && Task09.start(0, month, 2020).trim().equalsIgnoreCase("Error.");
            result = result && Task09.start(32, month, 2020).trim().equalsIgnoreCase("Error.");
        }

        result = result && Task09.start(30, 1, 2023).trim().equalsIgnoreCase("31.01.2023")
                && Task09.start(31, 1, 2023).trim().equalsIgnoreCase("01.02.2023")

                && Task09.start(30, 3, 2023).trim().equalsIgnoreCase("31.03.2023")
                && Task09.start(31, 3, 2023).trim().equalsIgnoreCase("01.04.2023")

                && Task09.start(29, 4, 2023).trim().equalsIgnoreCase("30.04.2023")
                && Task09.start(30, 4, 2023).trim().equalsIgnoreCase("01.05.2023")

                && Task09.start(30, 5, 2023).trim().equalsIgnoreCase("31.05.2023")
                && Task09.start(31, 5, 2023).trim().equalsIgnoreCase("01.06.2023")

                && Task09.start(29, 6, 2023).trim().equalsIgnoreCase("30.06.2023")
                && Task09.start(30, 6, 2023).trim().equalsIgnoreCase("01.07.2023")

                && Task09.start(30, 7, 2023).trim().equalsIgnoreCase("31.07.2023")
                && Task09.start(31, 7, 2023).trim().equalsIgnoreCase("01.08.2023")

                && Task09.start(30, 8, 2023).trim().equalsIgnoreCase("31.08.2023")
                && Task09.start(31, 8, 2023).trim().equalsIgnoreCase("01.09.2023")

                && Task09.start(29, 9, 2023).trim().equalsIgnoreCase("30.09.2023")
                && Task09.start(30, 9, 2023).trim().equalsIgnoreCase("01.10.2023")

                && Task09.start(30, 10, 2023).trim().equalsIgnoreCase("31.10.2023")
                && Task09.start(31, 10, 2023).trim().equalsIgnoreCase("01.11.2023")

                && Task09.start(29, 11, 2023).trim().equalsIgnoreCase("30.11.2023")
                && Task09.start(30, 11, 2023).trim().equalsIgnoreCase("01.12.2023")

                && Task09.start(30, 12, 2023).trim().equalsIgnoreCase("31.12.2023")
                && Task09.start(31, 12, 2023).trim().equalsIgnoreCase("01.01.2024");

        result = result && Task09.start(28, 2, 1900).trim().equalsIgnoreCase("01.03.1900")
                && Task09.start(28, 2, 2000).trim().equalsIgnoreCase("29.02.2000")
                && Task09.start(29, 2, 2000).trim().equalsIgnoreCase("01.03.2000")
                && Task09.start(28, 2, 1984).trim().equalsIgnoreCase("29.02.1984")
                && Task09.start(29, 2, 1984).trim().equalsIgnoreCase("01.03.1984")
                && Task09.start(29, 2, 0).trim().equalsIgnoreCase("01.03.0000")
                && Task09.start(28, 2, 1).trim().equalsIgnoreCase("01.03.0001")
                && Task09.start(28, 2, 4).trim().equalsIgnoreCase("29.02.0004")
                && Task09.start(29, 2, 4).trim().equalsIgnoreCase("01.03.0004")
                && Task09.start(28, 2, 10).trim().equalsIgnoreCase("01.03.0010")
                && Task09.start(28, 2, 20).trim().equalsIgnoreCase("29.02.0020")
                && Task09.start(29, 2, 20).trim().equalsIgnoreCase("01.03.0020")
                && Task09.start(28, 2, 100).trim().equalsIgnoreCase("01.03.0100")
                && Task09.start(28, 2, 200).trim().equalsIgnoreCase("01.03.0200")
                && Task09.start(28, 2, 300).trim().equalsIgnoreCase("01.03.0300")
                && Task09.start(28, 2, 400).trim().equalsIgnoreCase("29.02.0400")
                && Task09.start(28, 2, 2100).trim().equalsIgnoreCase("01.03.2100")
                && Task09.start(28, 2, 2200).trim().equalsIgnoreCase("01.03.2200")
                && Task09.start(28, 2, 2300).trim().equalsIgnoreCase("01.03.2300")
                && Task09.start(28, 2, 2400).trim().equalsIgnoreCase("29.02.2400")
                && Task09.start(29, 2, 2400).trim().equalsIgnoreCase("01.03.2400");

        return getResult("Task 09 [Next Date]", result);
    }

    public static String testingTask10() {
        boolean result = Task10.start(1, 3, 2, 4).trim().equalsIgnoreCase("segment - [2, 3]")
                && Task10.start(3, 1, 2, 4).trim().equalsIgnoreCase("segment - [2, 3]")
                && Task10.start(1, 2, 2, 3).trim().equalsIgnoreCase("point - 2")
                && Task10.start(1, 2, 3, 4).trim().equalsIgnoreCase("empty set")
                && Task10.start(2, 2, 3, 4).trim().equalsIgnoreCase("error")

                && Task10.start(0, 0, 0, 0).trim().equalsIgnoreCase("error")
                && Task10.start(1, 1, 1, 1).trim().equalsIgnoreCase("error")
                && Task10.start(-1, -1, -1, -1).trim().equalsIgnoreCase("error")
                && Task10.start(3, 4, 2, 2).trim().equalsIgnoreCase("error")
                && Task10.start(-2, -2, 3, 4).trim().equalsIgnoreCase("error")
                && Task10.start(3, 4, -2, -2).trim().equalsIgnoreCase("error")

                && Task10.start(-2, 4, 3, -1).trim().equalsIgnoreCase("segment - [-1, 3]")
                && Task10.start(4, -2, 3, -1).trim().equalsIgnoreCase("segment - [-1, 3]")
                && Task10.start(-2, 4, -1, 3).trim().equalsIgnoreCase("segment - [-1, 3]")
                && Task10.start(3, -1, -2, 4).trim().equalsIgnoreCase("segment - [-1, 3]")
                && Task10.start(3, -1, 4, -2).trim().equalsIgnoreCase("segment - [-1, 3]")

                && Task10.start(1, 5, 6, 10).trim().equalsIgnoreCase("empty set")
                && Task10.start(6, 10, 1, 5).trim().equalsIgnoreCase("empty set")
                && Task10.start(5, 1, 6, 10).trim().equalsIgnoreCase("empty set")
                && Task10.start(1, 5, 10, 6).trim().equalsIgnoreCase("empty set")

                && Task10.start(1, 10, 3, 5).trim().equalsIgnoreCase("segment - [3, 5]")
                && Task10.start(1, 5, 3, 7).trim().equalsIgnoreCase("segment - [3, 5]")
                && Task10.start(3, 7, 1, 5).trim().equalsIgnoreCase("segment - [3, 5]")
                && Task10.start(3, 5, 1, 10).trim().equalsIgnoreCase("segment - [3, 5]")

                && Task10.start(1, 5, 1, 5).trim().equalsIgnoreCase("segment - [1, 5]")
                && Task10.start(5, 1, 1, 5).trim().equalsIgnoreCase("segment - [1, 5]")
                && Task10.start(1, 5, 5, 1).trim().equalsIgnoreCase("segment - [1, 5]")
                && Task10.start(5, 1, 5, 1).trim().equalsIgnoreCase("segment - [1, 5]")

                && Task10.start(1, 10, 1, 5).trim().equalsIgnoreCase("segment - [1, 5]")
                && Task10.start(1, 5, 1, 10).trim().equalsIgnoreCase("segment - [1, 5]")
                && Task10.start(5, 10, 1, 10).trim().equalsIgnoreCase("segment - [5, 10]")
                && Task10.start(1, 10, 5, 10).trim().equalsIgnoreCase("segment - [5, 10]")

                && Task10.start(5, 1, 10, 1).trim().equalsIgnoreCase("segment - [1, 5]")
                && Task10.start(10, 5, 10, 1).trim().equalsIgnoreCase("segment - [5, 10]")
                && Task10.start(10, 1, 10, 5).trim().equalsIgnoreCase("segment - [5, 10]")

                && Task10.start(1, 5, 5, 10).trim().equalsIgnoreCase("point - 5")
                && Task10.start(1, 5, 10, 5).trim().equalsIgnoreCase("point - 5")
                && Task10.start(5, 1, 10, 5).trim().equalsIgnoreCase("point - 5")
                && Task10.start(5, 1, 5, 10).trim().equalsIgnoreCase("point - 5")

                && Task10.start(5, 10, 1, 5).trim().equalsIgnoreCase("point - 5")
                && Task10.start(5, 10, 5, 1).trim().equalsIgnoreCase("point - 5")
                && Task10.start(10, 5, 1, 5).trim().equalsIgnoreCase("point - 5")
                && Task10.start(10, 5, 5, 1).trim().equalsIgnoreCase("point - 5");

        return getResult("Task 10 [Intersection of Segments]", result);
    }

    public static String testingTaskX() {
        boolean result = TaskX.start(10, 3, 2) == 8
                && TaskX.start(10, 2, 1) == 9
                && TaskX.start(10, 4, 2) == 4
                && TaskX.start(10, 5, 4) == 6
                && TaskX.start(10, 6, 5) == 5
                && TaskX.start(10, 7, 6) == 4
                && TaskX.start(10, 8, 7) == 3
                && TaskX.start(10, 9, 8) == 2
                && TaskX.start(10, 10, 9) == 1
                && TaskX.start(10, 6, 3) == 3
                && TaskX.start(10, 9, 3) == 2
                && TaskX.start(3, 2, 1) == 2
                && TaskX.start(100, 3, 2) == 98
                && TaskX.start(99, 100, 98) == 1
                && TaskX.start(4, 3, 2) == 2

                && TaskX.start(-4, 3, 2) == 0
                && TaskX.start(4, -3, 2) == 0
                && TaskX.start(4, 3, -2) == 0
                && TaskX.start(0, 3, 2) == 0
                && TaskX.start(4, 0, 2) == 0
                && TaskX.start(4, 3, 0) == 0
                && TaskX.start(4, 2, 3) == 0
                && TaskX.start(4, 3, 3) == 0
                && TaskX.start(2, 3, 2) == 0
                && TaskX.start(1, 3, 2) == 0;

        return getResult("Task X [Caterpillar]", result);
    }
}