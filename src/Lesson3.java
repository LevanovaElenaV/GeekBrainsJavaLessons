public class Lesson3
{
    public static void main(String[] args) {

        // 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] arr10 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < 10; i++) {
            arr10[i] = invertInt(arr10[i]);
        }
//        for (int i = 0; i < 10; i++) {
//            System.out.println("arr10[" + i + "] = " + arr10[i]);
//        }

        // 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        int[] arr100 = new int[100];
        for (int i = 0; i < 100; i++) {
            arr100[i] = i + 1;
        }
//        for (int i = 0; i < 100; i++) {
//            System.out.println("arr100[" + i + "] = " + arr100[i]);
//        }

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] arr12 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < 12; i++) {
            if (arr12[i] < 6) arr12[i] *= 2;
        }
//        for (int i = 0; i < 12; i++) {
//            System.out.println("arr12[" + i + "] = " + arr12[i]);
//        }

        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами
        int N = 10;
        int[][] table = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                table[i][j] = 0;
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    table[i][j] = 1;
                    System.out.print( "table[" + i + "][" + j + "] = " + table[i][j] + "\n");
                }
                else if ( i+j+1 == N ) {
                    table[i][j] = 1;
                    System.out.print( "table[" + i + "][" + j + "] = " + table[i][j] + "\n");
                }
            }
        }

        //5. Написать метод, принимающий на вход два аргумента: len и initialValue, и
        // возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
        int len = 5;
        int initialValue = 1;
        int[] newArr = allocArray(len, initialValue);

        for (int i = 0; i < len; i++) {
            System.out.println("newArr[" + i + "] = " + newArr[i]);
        }

        //6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
        int[] myArr = {1, 2, 3, 100, -1, 5, -3};
        findMaxMin(myArr);


        //7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
        // метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.

        int[] myArr2 = {2, 2, 2, 1, 2, 2, 10, 1};
        boolean result = checkBalance(myArr2);
        System.out.print(result + "\n");

        //8. *** Написать метод, которому на вход подается одномерный массив и число n
        // (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
        int[] myArr3 = {1, 2, 3, 4, 5, 6};
        int shift = -2;
        shiftArray(myArr3, shift);
        for (int i = 0; i < 6; i++) {
            System.out.println("myArr3[" + i + "] = " + myArr3[i]);
        }
    }

    public static int invertInt (int val)
    //  заменить 0 на 1, 1 на 0
    {
       if (val == 0) return 1;
       else if (val == 1) return 0;
       else return -1;
    }

    public static int[] allocArray(int len, int initialValue)
    // возвращает одномерный массив типа int длиной len, каждая ячейка которого равна initialValue
    {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void findMaxMin(int[] array) {
        // находит минимальный и максимальный элементы
        int len = array.length;
        if (len < 1) {
            System.out.print("Длина массива не должна быть меньше 1!");
            return;
        }
        int minVal = array[0];
        int maxVal = array[0];
        for (int i = 1; i < len; i++) {
            if (array[i] > maxVal) {
                maxVal = array[i];
            }
            if (array[i] < minVal) {
                minVal = array[i];
            }
        }
        System.out.print("Минимальное значение = " + minVal + "\n");
        System.out.print("Максимальное значение = " + maxVal+ "\n");
        return;
    }

    public static boolean checkBalance(int[] array) {
        // проверяет, есть ли в массиве есть место, в котором сумма левой и правой части массива равны
        int len = array.length;
        int right = 0;
        int left = 0;
        for (int i = 0; i < len; i++) {
            left = array[0];
            right = array[len-1];
            for (int j = 1; j <= i; j++) {
                left += array[j];
            }
            for (int j = len-2; j > i ; j--) {
                right += array[j];
            }

            if (left == right) return true;
        }
        return false;
    }

    public static void shiftArray( int[] array, int shift) {
        // сдвигает массив вправо или влево на shift символов
        boolean ToLeft = false ;
        if (shift < 0) {
              ToLeft = true;
              shift *= -1;
          }
        int len = array.length;
        shift = shift % len;
        System.out.print("Сдвиг = " + shift + "\n");

        if (ToLeft == true) {
            for (int i = 0; i < shift; i++) {
                shiftArrayLeft1(array);
            }
        }
        else {
            for (int i = 0; i < shift; i++) {
                shiftArrayRight1(array);
            }
        }
        return;

    }

    public static void shiftArrayRight1 (int[] array) {
        // сдвигает массив вправо на 1 символ
        int len = array.length;
        int tmp = array[len-1];

        for (int i = len-1; i > 0; i--) {
            array[i] = array[i-1];
        }
        array[0] = tmp;

        return;
    }

    public static void shiftArrayLeft1 (int[] array) {
        // сдвигает массив влево на 1 символ
        int len = array.length;
        int tmp = array[0];

        for (int i = 0; i < len-1;  i++) {
            array[i] = array[i+1];
        }
        array[len-1] = tmp;

        return;
    }
}


