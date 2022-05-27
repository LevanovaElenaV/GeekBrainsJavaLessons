package JavaCoreLesson4;

import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {
        // Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся)

        String[]  words = {"Мария", "Ульяна", "Ольга", "Александр", "Андрей", "Антон", "Екатерина", "Елена", "Светлана", "Александр", "Ирина", "Александр", "Елена", "Мария", "Мария", "Мария"};

        // Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем)

        Set<String> set = new HashSet<String>(Arrays.asList(words));
        System.out.println(set);

        // Посчитать, сколько раз встречается каждое слово
        Integer counter;
        Iterator<String> iterSet = set.iterator();
        while (iterSet.hasNext()) {
            String strSet = iterSet.next();
            // считаем, сколько раз str входит в words
            counter = 0;
            for (int i = 0; i < words.length; i++) {
                if (strSet.equals(words[i]) == true) {
                     ++counter;
                }
            }
            System.out.println(strSet + " " + counter);
        }

        // то же самое через ArrayList
        //        Collection<String> words = new ArrayList<>(Arrays.asList("Мария", "Ульяна", "Ольга", "Александр", "Андрей", "Антон", "Екатерина", "Елена", "Светлана", "Александр", "Ирина", "Александр", "Елена", "Мария", "Мария", "Мария"));
        //        Set<String> set = new HashSet<>(words);

        //        Integer counter;
        //        Iterator<String> iterSet = set.iterator();
        //        while (iterSet.hasNext()) {
        //            String strSet = iterSet.next();
        //            // считаем, сколько раз str входит в words
        //            counter = 0;
        //            Iterator<String> iterWords = words.iterator();
        //            while (iterWords.hasNext()) {
        //                String strWords = iterWords.next();
        //                if (strSet.equals(strWords) == true) {
        //                    ++counter;
        //                }
        //            }
        //            System.out.println(strSet + " " + counter);
        //        }

    }
}
