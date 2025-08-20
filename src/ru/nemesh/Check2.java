package ru.nemesh;


import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check2 {

    public static String[] getChisla(String b) {
        // InputStreamReader reader = new InputStreamReader(b);
//        String[] words = b.split("");
//        for (String word : words) {
        String input = b;
        //  boolean hasNumber = input.matches(".*\\d.*");

        //      if (hasNumber) {
        //   System.out.println("Строка содержит число.");
        //} else {
        //  System.out.println("Строка не содержит числа.");

        // Удаляем квадратные скобки
        String withoutBrackets = input.replaceAll("\\[|\\]", "");

        // Регулярное выражение для поиска чисел
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(withoutBrackets);
        int array[] = {1, 2, 3};
        int sum = Arrays.stream(array).sum();

            System.out.println("Строка без квадратных скобок: " + withoutBrackets);
            System.out.println("Найденные цифры:" + input);
            System.out.println("Сумма:" + sum);

            while (matcher.find()) {
                // Получаем найденные цифры
                String number = matcher.group();


                //      InputStreamReader reader = new InputStreamReader(w);
                //     int number = Integer.parseInt(reader.readLine());

//            if (word == String.valueOf(word));
//                System.out.println(1);

//                if (!b.equals("")) {
//                    int f = Integer.parseInt(b);
//                }
//                else continue;
                //           }


                //Integer.parseInt(word);
//            int number = Integer.parseInt(word.readLine());
//            if (number == (int)number);
//            System.out.println(number);
                //else
                //System.out.println("Error");

                //    String[] stringArray = new String[0];
                //    for (int i = 0; i < stringArray.length; i++) {

//        int b;
//        int[] myArray = new int[1];
                //   for (int i = 0; i < 3; i++) {
                //       for (int i = 0; i < b.length; i++) {
                //   int c = Integer.parseInt(b.trim());
//        int [] num = new int[]{0,1,2};
//        int result = 0;
                //    String[] result = new String[] {b};
                // for(int i = 0; i < 3; i++){
                //       [i] = Integer.parseInt(b);
//                                result = arr[i];

                //      }
                //      String c = String.valueOf(0 + 1 + 2);


                //  return words;

                return new String[]{number};
            }
            return new String[0];
        }
    }