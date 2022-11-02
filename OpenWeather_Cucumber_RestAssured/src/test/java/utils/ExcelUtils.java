package utils;

import java.io.FileInputStream;
import java.io.InputStream;


import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public ExcelUtils(String excelPath, String sheetName) {
		try {
			InputStream file = new FileInputStream(excelPath);
			workbook = new XSSFWorkbook(file);
			//workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);

		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}

	public  int getRowCount() {
			
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows : "+rowCount);
			return rowCount;
	}

	public  Object getCellData(int rowNum, int colNum) {
		
			DataFormatter formatter = new DataFormatter();
			Object value=formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
			return value;

	}

}