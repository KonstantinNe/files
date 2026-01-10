package ru.nemesh;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check4 {

    public static String getCheck4(String a) {
    //    public static <excelFilePath> void getIP(excelFilePath) {
        String excelFilePath = "D:\\simplexcel2.xls"; // Замените на ваш путь
        String ipAddressRegex = "((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)"; // Классический IPv4
     //   int  array[] = {1,2,3,4,5};

          int columnNumber =0; //  Ищем в столбце С (индекс 3)

        do {


        List<String> ipAddresses = findIPAddressesInExcel(excelFilePath, ipAddressRegex, columnNumber);

        if (ipAddresses.isEmpty()) {
            //     int sum = Arrays.stream(array).sum();
            //     System.out.println("Сумма:" + sum);

            System.out.println("IP-адреса не найдены в столбце " + (char) ('A' + columnNumber)); // Добавлено указание столбца

        } else {
            System.out.println("Найденные IP-адреса в столбце " + (char)('A' + columnNumber) + ":"); // Добавлено указание столбца
            for (String ip : ipAddresses) {
                System.out.println(ip);
            }
          
        }
        columnNumber++;
    }while (columnNumber < 5);

        return excelFilePath;
    }

    public static List<String> findIPAddressesInExcel(String excelFilePath, String ipAddressRegex, int columnNumber) {
        List<String> ipAddresses = new ArrayList<>();
        Pattern pattern = Pattern.compile(ipAddressRegex);

        try (FileInputStream inputStream = new FileInputStream(new File(excelFilePath))) {
            Workbook workbook;
            if (excelFilePath.endsWith(".xlsx")) {
                workbook = new XSSFWorkbook(inputStream);
            } else if (excelFilePath.endsWith(".xls")) {
                workbook = new HSSFWorkbook(inputStream);
            } else {
                throw new IllegalArgumentException("Неподдерживаемый формат файла Excel.  Используйте .xls или .xlsx");
            }

            Sheet sheet = workbook.getSheetAt(0); // Берем первый лист

            for (Row row : sheet) {
                Cell cell = row.getCell(columnNumber); // Получаем ячейку указанного столбца

                if (cell != null) {
                    String cellValue = cell.toString(); // Преобразуем в строку

                    Matcher matcher = pattern.matcher(cellValue);
                    while (matcher.find()) {
                        ipAddresses.add(matcher.group()); // Добавляем найденный IP-адрес
                    }
                }
            }

        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла Excel: " + e.getMessage());
            e.printStackTrace();
        }

        return ipAddresses;
    }
}
