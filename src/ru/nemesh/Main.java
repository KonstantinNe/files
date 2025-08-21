package ru.nemesh;


public class Main {

    public static void main(String[] args) {
        String result = null;
        String result2 = null;

        String a = "D:\\simplexcel2.xls";
            result2 = Check3.getCheck3(a);
            result = Check.getCheck(a);
            //       System.out.println(ExcelParser.parse("D:\\simplexcel.xls"));
        System.out.println(result);
    }
}
