package org.maven.MavenProject;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class DataDrivenPrac {
	@Test
	public void test1() throws Throwable {
		File f = new File("C:\\Users\\DUKIE\\.eclipse\\MavenProject\\Excel\\Sample.xlsx");
		FileInputStream f1 = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(f1);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(2);
		Cell c = r.getCell(2);
		CellType c1 = c.getCellType();
		switch (c1) {
		case NUMERIC:
			double d = c.getNumericCellValue();
			long l = (long) d;
			String valueOf = String.valueOf(l);
			System.out.println(valueOf);

			break;

		case STRING:
			String x = c.getStringCellValue();
			System.out.println(x);

			break;
		}

	}

}
