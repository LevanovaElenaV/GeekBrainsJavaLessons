package JavaCoreLesson3;
import java.util.Arrays;

public class Changer {
    public static void main(String[] args) {
        // 1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа)
        String[] arr = {"1", "2"};
        System.out.println(Arrays.toString(arr));
        changeArrayElements(arr, 0, 1);
        System.out.println(Arrays.toString(arr));

        // Задача:
        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple> intBox1 = new Box<>(apple, "Корзина №1 ", 5);
        Box<Orange> intBox2 = new Box<>(orange, "Корзина №2 ", 10);

        intBox1.putFruit();
        intBox1.putFruit();
        intBox1.putFruit();
        System.out.println("Вес " + intBox1.getName() + intBox1.getWeight());

        intBox2.putFruit();
        intBox2.putFruit();
        System.out.println("Вес " + intBox2.getName() + intBox2.getWeight());

        if (intBox2.compare(intBox1) == true) {
            System.out.println("Вес корзин " + intBox1.getName() + " и " + intBox2.getName() + " одинаковый");
        } else {
            System.out.println("Вес корзин " + intBox1.getName() + " и " + intBox2.getName() + " разный");
        }

        Box<Apple> intBox3 = new Box<>(apple, "Корзина №3 ", 2);

        if (intBox1.shifting(intBox3) == true) {
            System.out.println("Все фрукты из корзины " + intBox1.getName() + " успешно переложены в корзину " + intBox3.getName());
        } else {
            System.out.println("Часть фруктов осталась в корзине " + intBox1.getName());
        }


        Box<Apple> intBox4 = new Box<>(apple, "Корзина №4 ", 2);

        if (intBox1.shifting(intBox4) == true) {
            System.out.println("Все фрукты из корзины " + intBox1.getName() + " успешно переложены в корзину " + intBox4.getName());
        } else {
            System.out.println("Часть фруктов осталась в корзине " + intBox1.getName());
        }

        intBox1.printTotalInfo();
        intBox2.printTotalInfo();
        intBox3.printTotalInfo();
        intBox4.printTotalInfo();

    }

    public static <T>void changeArrayElements(T[] array, int firstIndex, int secondIndex)
    // меняет два элемента массива местами
    {
        if (firstIndex < 0 || array.length <= firstIndex || secondIndex < 0 || array.length <= secondIndex) {
            System.out.println("Некорректные индексы");
        }
        T arrayElement = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = arrayElement;

    }

}


