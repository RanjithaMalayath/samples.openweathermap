package org.openweathermap.readxl;

import utils.ExcelUtils;

public class TestExcelUtils {
	
	public static void main(String[] args) {
		
		String excelPath = "testdata/api.xlsx";
		String sheetName = "weatherdata";
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		
		try{
		int rc = excel.getRowCount();
		System.out.print(excel.getCellData(0, 0));
		System.out.print("  ");
		System.out.print(excel.getCellData(0, 1));
		System.out.print("  ");
		System.out.print(excel.getCellData(0, 2));
		System.out.print("  ");
		System.out.print(excel.getCellData(0, 3));
		System.out.print("  ");
		System.out.print(excel.getCellData(0, 4));
		System.out.print("  ");
		System.out.println("\n");
		for(int i=1;i<=rc;i++)
		{
			System.out.print("    ");
			
			System.out.print(excel.getCellData(i,1));
			System.out.print("      ");
			
			System.out.print(excel.getCellData(i,2));
			System.out.print("         ");
			
			System.out.print(excel.getCellData(i,3));
			System.out.print("          ");
			System.out.print(excel.getCellData(i,4));
			System.out.print("          ");
			System.out.println("\n");
		}
		}
		catch(Exception e)
		{
			
		}
	}
	}

