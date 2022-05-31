package JavaCoreLesson4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private HashMap<String, String> book;

    public PhoneBook() {
        book = new HashMap<>();
    }

    public void add(String name, String phone) {
        book.put(phone, name);
    }

    public ArrayList<String> get(String name) {
        // возвращает массив строк номеров телефонов, найденных по имени name
       ArrayList<String> result = new ArrayList<>(); // массив

        for (Map.Entry<String, String> phoneEntry : book.entrySet()) {
            if (phoneEntry.getValue().equals(name)) {
                result.add(phoneEntry.getKey());
            }
        }
        return result;
    }
}
