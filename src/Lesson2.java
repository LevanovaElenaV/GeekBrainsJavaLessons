import java.util.Date;

public class Lesson2
{
    public static void main(String[] args)
    {
        boolean result = checkSum(10,10);
        System.out.print(result + "\n");

        checkValue(10);

        checkNegative(0);
        System.out.print(result + "\n");

        printN("Привет!", 5);

        Date dt = new Date();
        int year = dt.getYear() + 1900;
        result = ifLeapYear(year);
        System.out.print(result + "\n");
    }

    public static boolean checkSum (int a, int b)
    // проверка суммы чисел на принадлежность диапазону [10; 20]
    {
        int sum = a + b;
        return ((sum >= 10) && (sum <= 20 ));
    }

    public static void checkValue (int val)
    // проверка и вывод знака числа
    {
         if (val >= 0) {
            System.out.print("Число положительное\n");
        } else {
            System.out.print("Число отрицательное\n");
        }
    }

    public static boolean checkNegative(int val)
    //  проверка числа на отрицательность
    {
        return (val < 0)
    }

    public static void printN(String str, int n)
    // печать строку n раз
    {
      for ( int i = 0; i < n; i++) {
          System.out.println(str);
      }
    }

    public static boolean ifLeapYear(int year)
    // определяет, является ли год високосным
    {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }

            } else {
                return true;
            }

        } else {
            return false;
        }
     }

}
