package ru.nemesh;


import java.io.File;

public class Main {

    public static void main(String[] args) {
        String result = null;
        String a = "D:\\test";
        File file = new File(a);
        if (file.exists()) {
            result = Check.getCheck(a);
        } else {
            System.out.println("Файл не найден");
            //       System.out.println(ExcelParser.parse("D:\\simplexcel.xls"));
        }
        System.out.println(result);
    }
}
