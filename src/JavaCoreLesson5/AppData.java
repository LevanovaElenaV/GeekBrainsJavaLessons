package JavaCoreLesson5;
import java.util.Random;

public class AppData {
    private String[] headers;
    private int[][] data;

    public void init(String[] headers) {
        this.headers = headers;
        Random random = new Random();
        data = new int[headers.length][headers.length];

        for (int row = 0; row < headers.length; row++) {
            for (int column = 0; column < headers.length; column++) {
                data[row][column]  = random.nextInt(10);
            }
        }
    }

    @Override
    public String toString() {
        String result = "";

        for (String word : headers) {
            result += word + ";";
        }

        result += "\n";

        for (int row = 0; row < data.length; row++) {
            for (int column = 0; column < data[row].length; column++) {
                result += data[row][column] + ";";
            }
            result += "\n";
        }
        return result;
    }

    public void setData(int strNum, String s) {
        String[] strData;

//        for ( int i = 0; i < this.headers.length; i++ ) {  // только для отладки - посмотрим, жив ли наш заголовок
//            System.out.print("Заголовок " + i + ": " + this.headers[i] + "\n");
//        }

        strData = s.split(";");
         for ( int j = 0; j < strData.length; j++ ) {
            int value = Integer.parseInt(strData[j]);
            data[strNum][j] = value;
//            System.out.print("Строка " + strNum + " столбец " + j+ ": " + data[strNum][j] + "\n");
        }
    }

    public void setHeaders(String s) {
        this.headers = s.split(";");
        this.data = new int[headers.length][headers.length];
    }

}
