public class Main {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void  printThreeWords() {
        // печать трех слов
        System.out.print("Orange\n");
        System.out.print("Banana\n");
        System.out.print("Apple\n");
    }

    public static void checkSumSign() {
        // проверка знака
        int a = -2147483648;
        int b = 2147483647;

        //  int result = a + b;
        //  if (result >= 0) System.out.print("Сумма положительная или ноль\n");
        //  else System.out.print("Сумма отрицательная\n");

        //  попробуем сэкономить на переменной
        a += b;
        if (a >= 0) System.out.print("Сумма положительная или ноль\n");
        else System.out.print("Сумма отрицательная\n");
    }

    public static void printColor() {
        // печать цвета
        int value = 0;
        if (value <= 0) System.out.print("Красный\n");
        if ((value > 0) && (value <= 100)) System.out.print("Жёлтый\n");
        if (value > 100) System.out.print("Зелёный\n");
    }

    public static void compareNumbers() {
        // сравнение чисел
        int a = 5;
        int b = 4;
        if ( a >= b ) System.out.print("a >= b\n");
        else System.out.print("a < b\n");
    }


}
