package homeWork_Modul11_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.*;

public class Spisok {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ivan");
        list.add("Ruslan");
        list.add("Peter");
        list.add("Artem");

        String result = getNameString(list);

        System.out.println(result);
    }

    private static String getNameString(List<String> list) {
        List<String> sortedList = list.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        return String.join(", ", sortedList);
    }
}
//    Повертає список цих рядків у верхньому регістрі, і відсортованих за спаданням (від Z до A).