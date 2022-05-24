package JavaCoreLesson3;

public class Changer {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple> intBox1 = new Box<>(apple, "Корзина №1 ", 5);
        Box<Orange> intBox2 = new Box<>(orange,"Корзина №2 ", 10);

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
            System.out.println("Все фрукты из корзины "+ intBox1.getName() + " успешно переложены в корзину " + intBox3.getName() );
        } else {
            System.out.println("Часть фруктов осталась в корзине "+ intBox1.getName() );
        }


        Box<Apple> intBox4 = new Box<>(apple, "Корзина №4 ",2);

        if (intBox1.shifting(intBox4) == true) {
            System.out.println("Все фрукты из корзины "+ intBox1.getName() + " успешно переложены в корзину " + intBox4.getName() );
        } else {
            System.out.println("Часть фруктов осталась в корзине "+ intBox1.getName() );
        }


        intBox1.printTotalInfo();
        intBox2.printTotalInfo();
        intBox3.printTotalInfo();
        intBox4.printTotalInfo();

    }


}
