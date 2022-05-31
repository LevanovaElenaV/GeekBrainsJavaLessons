package JavaCoreLesson4;

import java.util.*;

public class DemoPhoneBook {
    public static void main(String[] args) {
        // Написать простой класс «Телефонный Справочник», который хранит в себе список фамилий и телефонных номеров
        PhoneBook phoneBook = new PhoneBook();

         // В этот телефонный справочник с помощью метода add() можно добавлять записи
        phoneBook.add("Иванов", "(222)999-99-91");
        phoneBook.add("Мартынова", "(333)111-11-11");
        phoneBook.add("Мартынов", "(495)111-11-11");
        phoneBook.add("Иванова", "(555)111-66-11");
        phoneBook.add("Иванов", "(222)888-88-88"); // однофамилец
        phoneBook.add("Сидоров", "(222)999-99-99");

        // Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
        // тогда при запросе такой фамилии должны выводиться все телефоны.
        System.out.println("Иванов: " + phoneBook.get("Иванов"));
        System.out.println("Иванов: " + phoneBook.get("Мартынова"));
        System.out.println("Иванов: " + phoneBook.get("Мартынов"));
        System.out.println("Иванов: " + phoneBook.get("Иванова"));
        System.out.println("Иванов: " + phoneBook.get("Сидоров"));
        }
    }

