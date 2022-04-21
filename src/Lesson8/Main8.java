package Lesson8;

import java.util.Random;
import java.util.Scanner;

public class Main8 {

    public static final int MAXLENGTH = 15;

    public static void main(String[] args) {

        //        MyWindow window = new MyWindow();
        //        window.init();

        Random random = new Random();

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String hiddenWord = words[random.nextInt(words.length)];
        System.out.println("Загаданное слово - " + hiddenWord);

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        Scanner console = new Scanner(System.in);

        do {
            System.out.println("Выберите слово из списка и введите с клавиатуры: ");
            String playerResponse = console.nextLine();

            if (hiddenWord.equals(playerResponse)) {
                break;
            }

            String result = "###############";
            String newResult = "";

            for (int i = 0; i < MAXLENGTH; i++) {
                if (i >= hiddenWord.length()) break;
                if (i >= playerResponse.length()) break;
                if (hiddenWord.charAt(i) == playerResponse.charAt(i)) {
                    newResult = replaceCharIntoStringByIndex(result, hiddenWord.charAt(i), i);
                    result = newResult;
                }
            }
            System.out.println("Результат итерации: " + result);
        } while (true);

        System.out.println("Слово угадано!");
    }

    public static String replaceCharIntoStringByIndex(String str, char ch, int index) {
        char[] chars = str.toCharArray();
        chars[index] = ch;
        return String.valueOf(chars);
    }
}
