package Lesson5;

public class Main {
    public static void main(String[] args) {
        Employee[] Employees = new Employee[5];

        Employees[0] = new Employee("Ильин Игорь Игоревич", "Генеральный директор", "email@gmail.com","+7(995)999-78-65", 10000, 44);
        Employees[1] = new Employee("Слесарева Нина Алексеевна", "Главный бухгалтер", "email1@gmail.com","+7(995)999-78-65", 50000 ,55 );
        Employees[2] = new Employee("Николаева Серафима Николаевна", "Ведущий инженер-программист", "email4@gmail.com","+7(995)999-78-65",90000,50 );
        Employees[3] = new Employee("Леванова Елена Владимировна", "Ведущий инженер-программист", "email2@gmail.com","+7(995)999-78-65",90000,30 );
        Employees[4] = new Employee("Гриценко Андрей Владимирович", "Ведущий инженер-программист", "email3@gmail.com","+7(995)999-78-65",90000, 22);

        for (int i=0; i < 5; i++) {
            if (Employees[i].age >= 40) Employees[i].printEmployeeInfo();
        }
    }
}
