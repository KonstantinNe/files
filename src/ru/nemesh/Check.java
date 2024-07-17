
package ru.nemesh;

public class Check {

    public static String getCheck(String a) {
//        String[] strings = {"string1", "string2", "string3"};
//        String[] res = new String[a.length];
//        for (int i = 0; i < a.length; i++) {
//            res[i] = String.valueOf(1);
// String res = null;


        String b = ExcelParser.parse(a);
        String c = String.valueOf(Check2.getChisla(b));
        //   String[] c = new String[3];


//        //    String b = Integer.parseInt(ExcelParser.parse(a));
//        String[] result = new String[Integer.parseInt(b)];
//        for (int i = 0; i < 3; i++) {
//            //    res[i] = String.valueOf(3);
//            int c = 0 + 1 + 2;


//        String b = "Десять";
//        String result1 = null;
//        if (a == b);
//            result = String.valueOf(10);
//            String [][] result = new String[0][1];
            //  int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
//char[] res = new char[a.length];
//        String [] res = new String[a.length];
////        int res = Integer.parseInt(null);
//        for (int i = 0; i < a.length; i++) {
//            res[i] = a[i].charAt(8);
//      }
//        return res;
//    }

            //    if(a == "Два")
            //       b = String.valueOf(2);
            //           WorksheetCollection collection = wb.getWorksheets();

            // Получить все ячейки в CellCollections
            // Cells cells = worksheet.getCells();

            //   String str = cell.getRichStringCellValue().getString();
            //   cell.setCellValue(new HSSFRichTextString(str));

// Инициализировать FindOptions
//                FindOptions findOptions = new FindOptions();

// Найдите ячейку, содержащую строковое значение
//        findOptions.setLookAtType(LookAtType.ENTIRE_CONTENT);
//        Cell cell = cells.find("A Company", null, findOptions);

// Показать имя ячейки и ее значение
//        System.out.println("Name of the cell containing String: " + cell.getName());
//        System.out.println("the cell value is: " + cell.getValue());

//Запись в файл
//                resultSetToExcel.writeBook();
//                int iCountRoe = resultSetToExcel.getiRow();
//                System.out.println("Всего записей:= " + iCountRoe);

//        return String.valueOf(result);
//    }
//
//    private static class FindOptions {
            //   }

            //  }
            return b;
            // return String.valueOf(res);


    }
}