package ru.nemesh;


import java.io.File;

public class Main {

    public static void main(String[] args) {
        String result = null;
        //String username = System.getenv("Katy");
        //String password = System.getenv("");
        String a = "D:\\simplexcel.xls";
     //   Scanner scanner = new Scanner(System.in);
        //System.out.print("¬ведите им€ пользовател€: ");
        //String username = scanner.nextLine();

        //System.out.print("¬ведите им€ пароль: ");
        //String password = scanner.nextLine();

        File file = new File(a);
        if (file.exists()) {
            String fileName = file.getName();
            String nameWithoutExtension = null;
            String extension = null;

            int dotIndex = fileName.lastIndexOf('.');

            if (dotIndex > 0 && dotIndex < fileName.length() - 1) {
                nameWithoutExtension = fileName.substring(0, dotIndex);
                extension = fileName.substring(dotIndex + 1);
            } else {
                nameWithoutExtension = fileName;
                extension = "";
            }

            result = Check.getCheck(a);
        } else {
            System.out.println("‘айл не найден");
            //       System.out.println(ExcelParser.parse("D:\\simplexcel.xls"));
        }
        System.out.println(result);
    }
}
