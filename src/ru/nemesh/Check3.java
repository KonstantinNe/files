package ru.nemesh;

import java.io.File;
// поиск файла в папке, определение формата

public class Check3 {
    public static String getCheck3(String a) {

        File file = new File(a);
        if (file.exists()) {
            String fileName = file.getName();
            String nameWithoutExtension = null;
            String extension = null;

       // } else {
       //     System.out.println("Файл не найден");
       //     }

            int dotIndex = fileName.lastIndexOf('.');

            if (dotIndex > 0 && dotIndex < fileName.length() - 1) {
                nameWithoutExtension = fileName.substring(0, dotIndex);
                extension = fileName.substring(dotIndex + 1);
            } else {
                nameWithoutExtension = fileName;
                extension = "";

            }

            return fileName;
        }
        return a;
    }
}
