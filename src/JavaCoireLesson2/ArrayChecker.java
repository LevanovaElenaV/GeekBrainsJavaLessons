package JavaCoireLesson2;

public class ArrayChecker {
    private String[][] strings;

    public void setStrings(String[][] strings) throws MyArraySizeException {
        if (strings == null) {
            System.out.println("Ошибка передачи массива 1 (конструктор)!");
            return;
        }
        if (strings.length != 4) {
            throw new MyArraySizeException("Количество строк массива не равно 4!");
        }
        for (int i = 0; i<strings.length; i++) {
            if (strings[i].length != 4) {
                throw new MyArraySizeException("Количество элементов массива не равно 4! Строка " + i);
            }
        }
        this.strings = strings;
    }

    public void summ() throws MyArrayDataException  {
        if (strings == null) {
            System.out.println("Ошибка передачи массива 2 (summ)!");
            return;
        }
        int result = 0;
        for (int x = 0; x < strings.length; x++) {
            String[] str = strings[x];
            for (int y = 0; y < str.length; y++) {
                try {
                    result += Integer.parseInt(str[y]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException("Массив содержит не только числа, суммирование не возможно. Ошибка в ячейке: " + x + ":" + y);
                }
            }
        }
        System.out.println("Сумма элементов массива: " + result);
    }
}
