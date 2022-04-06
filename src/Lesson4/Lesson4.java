package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Lesson4 {

    public static char[][] map;

    public static final int SIZE = 5;
    public static final int NUMBER_CHIP = 4; // NUMBER_CHIP <= SIZE

    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';


    public static void main(String[] args) {
        initMap();
        showMap();

        while (true) {
            humanTurn();
            if (isWinner(DOT_X)) {
                System.out.println("Победил человек!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            if (isWinner(DOT_O)) {
                System.out.println("Победил компьютер!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;

            }
            showMap();
        }
    }

    // 1. Инициализация игрового поля
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    // 2. Вывод игрового поля в консоль
    public static void showMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // 3. Ход человека
    public static void humanTurn() {

        Scanner scanner = new Scanner(System.in);
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");

            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    // 4. Проверка ячейки
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    // 5. Ход компьютера
    public static void aiTurn() {
        Random random = new Random();
        int x;
        int y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер сходил в координаты: X = "+ (x + 1) + " Y = " + (y + 1));
        map[y][x] = DOT_O;
    }

    // 6. Алгоритм проверки победы
    public static boolean isWinner(char symb) {
        int count, countX, countY;

        for (int i = 0; i < SIZE; i++) {
            countX = 0;
            countY = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb) countX += 1;
                if (map[j][i] == symb) countY += 1;
            }
            if (countX >= NUMBER_CHIP) return true;
            if (countY >= NUMBER_CHIP) return true;
        }

        count = 0;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == symb) {
                count += 1;
            }
        }
        if (count >= NUMBER_CHIP) return true;

        count = 0;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][SIZE-i-1] == symb) {
                count += 1;
            }
        }
        if (count >= NUMBER_CHIP) return true;

        return false;
    }

    // 7. Алгоритм проверки ничьей
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

}
