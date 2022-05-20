package JavaCoireLesson2;

import java.sql.SQLException;

public class Exceptions {

    public static void main(String[] args) {

        String[][] twoDimArray = {{"1","10","100","1000"},
                {"2","20","200","2000"},
                {"3", "30","300","3000"},
                {"4","40","400","4000"}
        };

        ArrayChecker arrayChecker = new ArrayChecker();

        try {
            arrayChecker.setStrings(twoDimArray);
        } catch (MyArraySizeException e) {
            e.printStackTrace();  // Standart error stream
        }

        try {
            arrayChecker.summ();
        } catch (MyArrayDataException e) {
            e.printStackTrace();  // Standart error stream
        }

    }

}
