package JavaCoreLesson5;
import java.io.*;
import java.nio.charset.StandardCharsets;


public class IO {
    public static void main(String[] args) {
//       1. Реализовать сохранение данных в csv файл;
        File file1 = new File("our_file.csv");

        try (FileOutputStream fileOutputStream = new FileOutputStream(file1)) {
            byte[] csvData;
            String str;

            AppData appData = new AppData();
            String[] headers = new String[] { "Value 1", "Value 2", "Value 3" };
            appData.init(headers);
            str = appData.toString();
            csvData = str.getBytes(StandardCharsets.UTF_8);
            fileOutputStream.write(csvData);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

//        2. Реализовать загрузку данных из csv файла. Файл читается целиком.
        File file2 = new File("our_file.csv");
        String result;

        try (BufferedReader reader = new BufferedReader(new FileReader(file2))) {
            String s = reader.readLine(); // считываем заголовки
            AppData appData = new AppData();
            appData.setHeaders(s); // заполняем структуру заголовками и выделим соответствующую память под данные
            int i = 0;
            while ((result = reader.readLine()) != null) {
//              System.out.println(result); // только для отладки
                appData.setData(i, result); // заполняем данные
                ++i;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

