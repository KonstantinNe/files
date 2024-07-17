package ru.nemesh;



public class Main {

    public static void main(String [] args){
        String a = null;
        String result;
        a = "D:\\simplexcel.xls";
        result = Check.getCheck(a);
        System.out.println(result);
 //       System.out.println(ExcelParser.parse("D:\\simplexcel.xls"));
    }

}
