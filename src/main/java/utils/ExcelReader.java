package utils;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {
    public static Object[][] readCredentials(String filePath, String sheetName) {
        Object[][] data = null;
        try {
            FileInputStream file = new FileInputStream(filePath);
            Workbook workbook = WorkbookFactory.create(file);
            Sheet sheet = workbook.getSheet(sheetName);
            int rowCount = sheet.getLastRowNum();
            int columnCount = sheet.getRow(0).getLastCellNum();
            data = new Object[rowCount][columnCount];
            for (int i = 0; i < rowCount; i++) {
                Row row = sheet.getRow(i + 1);
                for (int j = 0; j < columnCount; j++) {
                    data[i][j] = row.getCell(j).toString();
                }
            }
            workbook.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
