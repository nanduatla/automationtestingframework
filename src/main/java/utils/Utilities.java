package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utilities {

	public void readdatafromexcel() throws Throwable {

		String path = System.getProperty("user.dir") + "\\testData\\testdata.xlsx";

		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("login");

		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(0).getLastCellNum();

		for (int i = 0; i < rowcount; i++) {
			XSSFRow row = sheet.getRow(i);

			for (int j = 0; j < colcount; j++) {
				XSSFCell cell = row.getCell(j);

				switch (cell.getCellType()) {

				case STRING:
					System.out.println(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.println(cell.getNumericCellValue());
					break;

				}

			}

		}

	}

}
