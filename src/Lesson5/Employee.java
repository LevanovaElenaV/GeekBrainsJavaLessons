package Lesson5;

public class Employee {
    String fullName;
    String position;
    String eMail;
    String phone;
    int salary;
    int age;

    Employee(String fullName, String position, String eMail, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.eMail = eMail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printEmployeeInfo() {
        System.out.println("Ф.И.О. " + fullName);
        System.out.println("Должность " + position);
        System.out.println("email " + eMail);
        System.out.println("Телефон " + phone);
        System.out.println("Оклад " + salary);
        System.out.println("Возраст " + age + "\n");
    }

}
